package mk.ukim.finki.reviewsfilter.service;

import mk.ukim.finki.reviewsfilter.model.Review;

import java.util.List;

public interface ReviewsService {

    List<Review> filter(String orderRating, int rating, String orderDate, String text);
}
