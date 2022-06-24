package mk.ukim.finki.reviewsfilter.web;

import mk.ukim.finki.reviewsfilter.model.Review;
import mk.ukim.finki.reviewsfilter.service.ReviewsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("")
public class ReviewsController {

    private final ReviewsService reviewsService;

    public ReviewsController(ReviewsService reviewsService) {
        this.reviewsService = reviewsService;
    }

    @GetMapping
    public String getFilter() {
        return "filter";
    }

    @PostMapping("/reviews")
    public String getReviews(@RequestParam String orderRating,
                             @RequestParam int rating,
                             @RequestParam String orderDate,
                             @RequestParam String text, Model model) {
        if (orderRating.length() == 0 && orderDate.length() == 0 && text.length() == 0 && rating > 5) {
            return "filter";
        }

        List<Review> reviews = this.reviewsService.filter(orderRating, rating, orderDate, text);
        model.addAttribute("reviews", reviews);
        return "reviews";
    }
}
