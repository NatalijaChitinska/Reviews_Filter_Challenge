package mk.ukim.finki.reviewsfilter.repository;

import mk.ukim.finki.reviewsfilter.model.DataHolder;
import mk.ukim.finki.reviewsfilter.model.Review;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ReviewsRepository {

    public List<Review> filter(String orderByRating, int minRating, String orderDate, String text) {

        List<Review> reviews = DataHolder.reviewList.stream().filter(r ->
                r.getRating() >= minRating).collect(Collectors.toList());

        if (text.equals("yes")) {
            List<Review> noReviewText = reviews.stream().filter(r ->
                    r.getReviewText().equals("")).collect(Collectors.toList());
            List<Review> reviewsWithText = reviews.stream().filter(r ->
                    !(r.getReviewText().equals(""))).collect(Collectors.toList());

            if (orderByRating.equals("highest") && orderDate.equals("oldest")) {
                Comparator<Review> filterByThreeFilters = Comparator.comparing(Review::getReviewText)
                        .thenComparing(Review::getRating).reversed()
                        .thenComparing(Review::getReviewCreatedOnDate);
                List<Review> result = reviews.stream().sorted(filterByThreeFilters).collect(Collectors.toList());
                return result;
            } else if (orderByRating.equals("lowest") && orderDate.equals("newest")) {

                Comparator<Review> filterByThreeFilters = (Comparator.comparing(Review::getReviewText)
                        .thenComparing(Review::getRating))
                        .thenComparing(Comparator.comparing(Review::getReviewCreatedOnDate).reversed());
                reviewsWithText = reviewsWithText.stream().sorted(filterByThreeFilters).collect(Collectors.toList());
                noReviewText = noReviewText.stream().sorted(filterByThreeFilters).collect(Collectors.toList());
                reviewsWithText.addAll(noReviewText);
                return reviewsWithText;
            } else if (orderByRating.equals("lowest") && orderDate.equals("oldest")) {
                Comparator<Review> filterByThreeFilters = (Comparator.comparing(Review::getReviewText)
                        .thenComparing(Review::getRating))
                        .thenComparing(Review::getReviewCreatedOnDate);
                reviewsWithText = reviewsWithText.stream().sorted(filterByThreeFilters).collect(Collectors.toList());
                noReviewText = noReviewText.stream().sorted(filterByThreeFilters).collect(Collectors.toList());
                reviewsWithText.addAll(noReviewText);
                return reviewsWithText;
            } else {
                Comparator<Review> filterByThreeFilters = Comparator.comparing(Review::getReviewText)
                        .thenComparing(Review::getRating)
                        .thenComparing(Review::getReviewCreatedOnDate).reversed();
                List<Review> result = reviews.stream().sorted(filterByThreeFilters).collect(Collectors.toList());
                return result;
            }
        } else {
            if (orderByRating.equals("lowest") && orderDate.equals("oldest")) {
                Comparator<Review> filterByRatingAndDate = Comparator.comparing(Review::getRating)
                        .thenComparing(Review::getReviewCreatedOnDate);
                List<Review> result = reviews.stream().sorted(filterByRatingAndDate).collect(Collectors.toList());
                return result;
            } else if (orderByRating.equals("lowest") && orderDate.equals("newest")) {
                Comparator<Review> filterByRatingAndDate = Comparator.comparing(Review::getRating)
                        .thenComparing(Review::getReviewCreatedOnDate).reversed();
                List<Review> result = reviews.stream().sorted(filterByRatingAndDate).collect(Collectors.toList());
                return result;
            } else if (orderByRating.equals("highest") && orderDate.equals("oldest")) {
                Comparator<Review> filterByRatingAndDate = Comparator.comparing(Review::getRating).reversed()
                        .thenComparing(Review::getReviewCreatedOnDate);
                List<Review> result = reviews.stream().sorted(filterByRatingAndDate).collect(Collectors.toList());
                return result;
            } else {
                Comparator<Review> filterByRatingAndDate = Comparator.comparing(Review::getRating)
                        .thenComparing(Review::getReviewCreatedOnDate).reversed();
                List<Review> result = reviews.stream().sorted(filterByRatingAndDate).collect(Collectors.toList());
                return result;
            }
        }
    }
}
