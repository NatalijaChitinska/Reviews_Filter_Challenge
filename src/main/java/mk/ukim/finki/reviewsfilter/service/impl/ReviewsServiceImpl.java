package mk.ukim.finki.reviewsfilter.service.impl;

import mk.ukim.finki.reviewsfilter.model.Review;
import mk.ukim.finki.reviewsfilter.repository.ReviewsRepository;
import mk.ukim.finki.reviewsfilter.service.ReviewsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewsServiceImpl implements ReviewsService {

    private final ReviewsRepository reviewsRepository;

    public ReviewsServiceImpl(ReviewsRepository reviewsRepository) {
        this.reviewsRepository = reviewsRepository;
    }

    @Override
    public List<Review> filter(String orderRating, int rating, String orderDate, String text) {
        return this.reviewsRepository.filter(orderRating, rating, orderDate, text);
    }
}
