package mk.ukim.finki.reviewsfilter.model;

import lombok.Data;

@Data
public class Review {

    private Long id;
    private String reviewId;
    private String reviewFullText;
    private String reviewText;
    private int numLikes;
    private int numComments;
    private int numShares;
    private int rating;
    private String reviewCreatedOn;
    private String reviewCreatedOnDate;
    private String reviewCreatedOnTime;
    private int reviewerId;
    private String reviewerUrl;
    private String reviewerName;
    private String reviewerEmail;
    private String sourceType;
    private Boolean isVerified;
    private String source;
    private String sourceName;
    private String sourceId;
    private int[] tags;
    private String href;
    private String logoHref;
    private int[] photos;

    public Review() {
    }

    public Review(Long id, String reviewId, String reviewFullText, String reviewText, int numLikes, int numComments, int numShares, int rating, String reviewCreatedOn, String reviewCreatedOnDate, String reviewCreatedOnTime, int reviewerId, String reviewerUrl, String reviewerName, String reviewerEmail, String sourceType, Boolean isVerified, String source, String sourceName, String sourceId, int[] tags, String href, String logoHref, int[] photos) {
        this.id = id;
        this.reviewId = reviewId;
        this.reviewFullText = reviewFullText;
        this.reviewText = reviewText;
        this.numLikes = numLikes;
        this.numComments = numComments;
        this.numShares = numShares;
        this.rating = rating;
        this.reviewCreatedOn = reviewCreatedOn;
        this.reviewCreatedOnDate = reviewCreatedOnDate;
        this.reviewCreatedOnTime = reviewCreatedOnTime;
        this.reviewerId = reviewerId;
        this.reviewerUrl = reviewerUrl;
        this.reviewerName = reviewerName;
        this.reviewerEmail = reviewerEmail;
        this.sourceType = sourceType;
        this.isVerified = isVerified;
        this.source = source;
        this.sourceName = sourceName;
        this.sourceId = sourceId;
        this.tags = tags;
        this.href = href;
        this.logoHref = logoHref;
        this.photos = photos;
    }
}
