package mk.ukim.finki.reviewsfilter.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    String reviewJson = "[\n" +
            "  {\n" +
            "    \"id\": 2097047,\n" +
            "    \"reviewId\": \"93f131be27dc1122bb7ef0048ad10e4f\",\n" +
            "    \"reviewFullText\": \"5 star review\",\n" +
            "    \"reviewText\": \"5 star review\",\n" +
            "    \"numLikes\": 0,\n" +
            "    \"numComments\": 0,\n" +
            "    \"numShares\": 0,\n" +
            "    \"rating\": 5,\n" +
            "    \"reviewCreatedOn\": \"2 months ago\",\n" +
            "    \"reviewCreatedOnDate\": \"2021-01-25T13:00:35+00:00\",\n" +
            "    \"reviewCreatedOnTime\": 1611579635,\n" +
            "    \"reviewerId\": null,\n" +
            "    \"reviewerUrl\": null,\n" +
            "    \"reviewerName\": \"Reviewer #20\",\n" +
            "    \"reviewerEmail\": null,\n" +
            "    \"sourceType\": \"custom\",\n" +
            "    \"isVerified\": false,\n" +
            "    \"source\": \"custom\",\n" +
            "    \"sourceName\": \"1-20 Reviews\",\n" +
            "    \"sourceId\": \"890cdd7974cdf8aabe6e9051f5a87303bdb933ae\",\n" +
            "    \"tags\": [],\n" +
            "    \"href\": null,\n" +
            "    \"logoHref\": null,\n" +
            "    \"photos\": []\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2097046,\n" +
            "    \"reviewId\": \"6e7bd4c71a56885ef583bd79186af689\",\n" +
            "    \"reviewFullText\": \"4 star review\",\n" +
            "    \"reviewText\": \"4 star review\",\n" +
            "    \"numLikes\": 0,\n" +
            "    \"numComments\": 0,\n" +
            "    \"numShares\": 0,\n" +
            "    \"rating\": 4,\n" +
            "    \"reviewCreatedOn\": \"2 months ago\",\n" +
            "    \"reviewCreatedOnDate\": \"2021-01-25T13:00:21+00:00\",\n" +
            "    \"reviewCreatedOnTime\": 1611579621,\n" +
            "    \"reviewerId\": null,\n" +
            "    \"reviewerUrl\": null,\n" +
            "    \"reviewerName\": \"Reviewer #19\",\n" +
            "    \"reviewerEmail\": null,\n" +
            "    \"sourceType\": \"custom\",\n" +
            "    \"isVerified\": false,\n" +
            "    \"source\": \"custom\",\n" +
            "    \"sourceName\": \"1-20 Reviews\",\n" +
            "    \"sourceId\": \"890cdd7974cdf8aabe6e9051f5a87303bdb933ae\",\n" +
            "    \"tags\": [],\n" +
            "    \"href\": null,\n" +
            "    \"logoHref\": null,\n" +
            "    \"photos\": []\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2097045,\n" +
            "    \"reviewId\": \"ced8bd056d0adec93c651f935c7dde80\",\n" +
            "    \"reviewFullText\": \"3 star review\",\n" +
            "    \"reviewText\": \"3 star review\",\n" +
            "    \"numLikes\": 0,\n" +
            "    \"numComments\": 0,\n" +
            "    \"numShares\": 0,\n" +
            "    \"rating\": 3,\n" +
            "    \"reviewCreatedOn\": \"2 months ago\",\n" +
            "    \"reviewCreatedOnDate\": \"2021-01-25T13:00:10+00:00\",\n" +
            "    \"reviewCreatedOnTime\": 1611579610,\n" +
            "    \"reviewerId\": null,\n" +
            "    \"reviewerUrl\": null,\n" +
            "    \"reviewerName\": \"Reviewer #18\",\n" +
            "    \"reviewerEmail\": null,\n" +
            "    \"sourceType\": \"custom\",\n" +
            "    \"isVerified\": false,\n" +
            "    \"source\": \"custom\",\n" +
            "    \"sourceName\": \"1-20 Reviews\",\n" +
            "    \"sourceId\": \"890cdd7974cdf8aabe6e9051f5a87303bdb933ae\",\n" +
            "    \"tags\": [],\n" +
            "    \"href\": null,\n" +
            "    \"logoHref\": null,\n" +
            "    \"photos\": []\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2097044,\n" +
            "    \"reviewId\": \"b0dfee9017fafe7d751f0fea1f3ce540\",\n" +
            "    \"reviewFullText\": \"2 star review\",\n" +
            "    \"reviewText\": \"2 star review\",\n" +
            "    \"numLikes\": 0,\n" +
            "    \"numComments\": 0,\n" +
            "    \"numShares\": 0,\n" +
            "    \"rating\": 2,\n" +
            "    \"reviewCreatedOn\": \"2 months ago\",\n" +
            "    \"reviewCreatedOnDate\": \"2021-01-25T12:59:57+00:00\",\n" +
            "    \"reviewCreatedOnTime\": 1611579597,\n" +
            "    \"reviewerId\": null,\n" +
            "    \"reviewerUrl\": null,\n" +
            "    \"reviewerName\": \"Reviewer #17\",\n" +
            "    \"reviewerEmail\": null,\n" +
            "    \"sourceType\": \"custom\",\n" +
            "    \"isVerified\": false,\n" +
            "    \"source\": \"custom\",\n" +
            "    \"sourceName\": \"1-20 Reviews\",\n" +
            "    \"sourceId\": \"890cdd7974cdf8aabe6e9051f5a87303bdb933ae\",\n" +
            "    \"tags\": [],\n" +
            "    \"href\": null,\n" +
            "    \"logoHref\": null,\n" +
            "    \"photos\": []\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2097043,\n" +
            "    \"reviewId\": \"10588b914a39967f3a702b02f3751794\",\n" +
            "    \"reviewFullText\": \"1 star review\",\n" +
            "    \"reviewText\": \"1 star review\",\n" +
            "    \"numLikes\": 0,\n" +
            "    \"numComments\": 0,\n" +
            "    \"numShares\": 0,\n" +
            "    \"rating\": 1,\n" +
            "    \"reviewCreatedOn\": \"2 months ago\",\n" +
            "    \"reviewCreatedOnDate\": \"2021-01-25T12:59:40+00:00\",\n" +
            "    \"reviewCreatedOnTime\": 1611579580,\n" +
            "    \"reviewerId\": null,\n" +
            "    \"reviewerUrl\": null,\n" +
            "    \"reviewerName\": \"Reviewer #16\",\n" +
            "    \"reviewerEmail\": null,\n" +
            "    \"sourceType\": \"custom\",\n" +
            "    \"isVerified\": false,\n" +
            "    \"source\": \"custom\",\n" +
            "    \"sourceName\": \"1-20 Reviews\",\n" +
            "    \"sourceId\": \"890cdd7974cdf8aabe6e9051f5a87303bdb933ae\",\n" +
            "    \"tags\": [],\n" +
            "    \"href\": null,\n" +
            "    \"logoHref\": null,\n" +
            "    \"photos\": []\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2097042,\n" +
            "    \"reviewId\": \"1d14901bbb67ded3368d2d8d8b5989d8\",\n" +
            "    \"reviewFullText\": \"5 star review\",\n" +
            "    \"reviewText\": \"5 star review\",\n" +
            "    \"numLikes\": 0,\n" +
            "    \"numComments\": 0,\n" +
            "    \"numShares\": 0,\n" +
            "    \"rating\": 5,\n" +
            "    \"reviewCreatedOn\": \"2 months ago\",\n" +
            "    \"reviewCreatedOnDate\": \"2021-01-25T12:59:27+00:00\",\n" +
            "    \"reviewCreatedOnTime\": 1611579567,\n" +
            "    \"reviewerId\": null,\n" +
            "    \"reviewerUrl\": null,\n" +
            "    \"reviewerName\": \"Reviewer #15\",\n" +
            "    \"reviewerEmail\": null,\n" +
            "    \"sourceType\": \"custom\",\n" +
            "    \"isVerified\": false,\n" +
            "    \"source\": \"custom\",\n" +
            "    \"sourceName\": \"1-20 Reviews\",\n" +
            "    \"sourceId\": \"890cdd7974cdf8aabe6e9051f5a87303bdb933ae\",\n" +
            "    \"tags\": [],\n" +
            "    \"href\": null,\n" +
            "    \"logoHref\": null,\n" +
            "    \"photos\": []\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2097041,\n" +
            "    \"reviewId\": \"ca10718af15af32f71da09a6e5f78c48\",\n" +
            "    \"reviewFullText\": \"\",\n" +
            "    \"reviewText\": \"\",\n" +
            "    \"numLikes\": 0,\n" +
            "    \"numComments\": 0,\n" +
            "    \"numShares\": 0,\n" +
            "    \"rating\": 4,\n" +
            "    \"reviewCreatedOn\": \"2 months ago\",\n" +
            "    \"reviewCreatedOnDate\": \"2021-01-25T12:59:15+00:00\",\n" +
            "    \"reviewCreatedOnTime\": 1611579555,\n" +
            "    \"reviewerId\": null,\n" +
            "    \"reviewerUrl\": null,\n" +
            "    \"reviewerName\": \"Reviewer #14\",\n" +
            "    \"reviewerEmail\": null,\n" +
            "    \"sourceType\": \"custom\",\n" +
            "    \"isVerified\": false,\n" +
            "    \"source\": \"custom\",\n" +
            "    \"sourceName\": \"1-20 Reviews\",\n" +
            "    \"sourceId\": \"890cdd7974cdf8aabe6e9051f5a87303bdb933ae\",\n" +
            "    \"tags\": [],\n" +
            "    \"href\": null,\n" +
            "    \"logoHref\": null,\n" +
            "    \"photos\": []\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2097040,\n" +
            "    \"reviewId\": \"65b3ba7d67109d2a4f573fca44d5e532\",\n" +
            "    \"reviewFullText\": \"3 star review\",\n" +
            "    \"reviewText\": \"3 star review\",\n" +
            "    \"numLikes\": 0,\n" +
            "    \"numComments\": 0,\n" +
            "    \"numShares\": 0,\n" +
            "    \"rating\": 3,\n" +
            "    \"reviewCreatedOn\": \"2 months ago\",\n" +
            "    \"reviewCreatedOnDate\": \"2021-01-25T12:58:46+00:00\",\n" +
            "    \"reviewCreatedOnTime\": 1611579526,\n" +
            "    \"reviewerId\": null,\n" +
            "    \"reviewerUrl\": null,\n" +
            "    \"reviewerName\": \"Reviewer #13\",\n" +
            "    \"reviewerEmail\": null,\n" +
            "    \"sourceType\": \"custom\",\n" +
            "    \"isVerified\": false,\n" +
            "    \"source\": \"custom\",\n" +
            "    \"sourceName\": \"1-20 Reviews\",\n" +
            "    \"sourceId\": \"890cdd7974cdf8aabe6e9051f5a87303bdb933ae\",\n" +
            "    \"tags\": [],\n" +
            "    \"href\": null,\n" +
            "    \"logoHref\": null,\n" +
            "    \"photos\": []\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2097039,\n" +
            "    \"reviewId\": \"c111f4f05a1048e3a43a28e5bfd0be27\",\n" +
            "    \"reviewFullText\": \"\",\n" +
            "    \"reviewText\": \"\",\n" +
            "    \"numLikes\": 0,\n" +
            "    \"numComments\": 0,\n" +
            "    \"numShares\": 0,\n" +
            "    \"rating\": 2,\n" +
            "    \"reviewCreatedOn\": \"2 months ago\",\n" +
            "    \"reviewCreatedOnDate\": \"2021-01-25T12:58:22+00:00\",\n" +
            "    \"reviewCreatedOnTime\": 1611579502,\n" +
            "    \"reviewerId\": null,\n" +
            "    \"reviewerUrl\": null,\n" +
            "    \"reviewerName\": \"Reviewer #12\",\n" +
            "    \"reviewerEmail\": null,\n" +
            "    \"sourceType\": \"custom\",\n" +
            "    \"isVerified\": false,\n" +
            "    \"source\": \"custom\",\n" +
            "    \"sourceName\": \"1-20 Reviews\",\n" +
            "    \"sourceId\": \"890cdd7974cdf8aabe6e9051f5a87303bdb933ae\",\n" +
            "    \"tags\": [],\n" +
            "    \"href\": null,\n" +
            "    \"logoHref\": null,\n" +
            "    \"photos\": []\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2097038,\n" +
            "    \"reviewId\": \"be88045286fcb7ca91e234b37eef511b\",\n" +
            "    \"reviewFullText\": \"1 star review\",\n" +
            "    \"reviewText\": \"1 star review\",\n" +
            "    \"numLikes\": 0,\n" +
            "    \"numComments\": 0,\n" +
            "    \"numShares\": 0,\n" +
            "    \"rating\": 1,\n" +
            "    \"reviewCreatedOn\": \"2 months ago\",\n" +
            "    \"reviewCreatedOnDate\": \"2021-01-25T12:58:06+00:00\",\n" +
            "    \"reviewCreatedOnTime\": 1611579486,\n" +
            "    \"reviewerId\": null,\n" +
            "    \"reviewerUrl\": null,\n" +
            "    \"reviewerName\": \"Reviewer #11\",\n" +
            "    \"reviewerEmail\": null,\n" +
            "    \"sourceType\": \"custom\",\n" +
            "    \"isVerified\": false,\n" +
            "    \"source\": \"custom\",\n" +
            "    \"sourceName\": \"1-20 Reviews\",\n" +
            "    \"sourceId\": \"890cdd7974cdf8aabe6e9051f5a87303bdb933ae\",\n" +
            "    \"tags\": [],\n" +
            "    \"href\": null,\n" +
            "    \"logoHref\": null,\n" +
            "    \"photos\": []\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2097037,\n" +
            "    \"reviewId\": \"70b57c0433d0221b0788b106fb9fdd5a\",\n" +
            "    \"reviewFullText\": \"\",\n" +
            "    \"reviewText\": \"\",\n" +
            "    \"numLikes\": 0,\n" +
            "    \"numComments\": 0,\n" +
            "    \"numShares\": 0,\n" +
            "    \"rating\": 5,\n" +
            "    \"reviewCreatedOn\": \"2 months ago\",\n" +
            "    \"reviewCreatedOnDate\": \"2021-01-25T12:57:48+00:00\",\n" +
            "    \"reviewCreatedOnTime\": 1611579468,\n" +
            "    \"reviewerId\": null,\n" +
            "    \"reviewerUrl\": null,\n" +
            "    \"reviewerName\": \"Reviewer #10\",\n" +
            "    \"reviewerEmail\": null,\n" +
            "    \"sourceType\": \"custom\",\n" +
            "    \"isVerified\": false,\n" +
            "    \"source\": \"custom\",\n" +
            "    \"sourceName\": \"1-20 Reviews\",\n" +
            "    \"sourceId\": \"890cdd7974cdf8aabe6e9051f5a87303bdb933ae\",\n" +
            "    \"tags\": [],\n" +
            "    \"href\": null,\n" +
            "    \"logoHref\": null,\n" +
            "    \"photos\": []\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2097036,\n" +
            "    \"reviewId\": \"59cbd1e887e8cce76ef68318b198ddf0\",\n" +
            "    \"reviewFullText\": \"4 star review\",\n" +
            "    \"reviewText\": \"4 star review\",\n" +
            "    \"numLikes\": 0,\n" +
            "    \"numComments\": 0,\n" +
            "    \"numShares\": 0,\n" +
            "    \"rating\": 4,\n" +
            "    \"reviewCreatedOn\": \"2 months ago\",\n" +
            "    \"reviewCreatedOnDate\": \"2021-01-25T12:57:35+00:00\",\n" +
            "    \"reviewCreatedOnTime\": 1611579455,\n" +
            "    \"reviewerId\": null,\n" +
            "    \"reviewerUrl\": null,\n" +
            "    \"reviewerName\": \"Reviewer #9\",\n" +
            "    \"reviewerEmail\": null,\n" +
            "    \"sourceType\": \"custom\",\n" +
            "    \"isVerified\": false,\n" +
            "    \"source\": \"custom\",\n" +
            "    \"sourceName\": \"1-20 Reviews\",\n" +
            "    \"sourceId\": \"890cdd7974cdf8aabe6e9051f5a87303bdb933ae\",\n" +
            "    \"tags\": [],\n" +
            "    \"href\": null,\n" +
            "    \"logoHref\": null,\n" +
            "    \"photos\": []\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2097034,\n" +
            "    \"reviewId\": \"ac50da2870193abe25ba529597cfbd23\",\n" +
            "    \"reviewFullText\": \"\",\n" +
            "    \"reviewText\": \"\",\n" +
            "    \"numLikes\": 0,\n" +
            "    \"numComments\": 0,\n" +
            "    \"numShares\": 0,\n" +
            "    \"rating\": 3,\n" +
            "    \"reviewCreatedOn\": \"2 months ago\",\n" +
            "    \"reviewCreatedOnDate\": \"2021-01-25T12:57:11+00:00\",\n" +
            "    \"reviewCreatedOnTime\": 1611579431,\n" +
            "    \"reviewerId\": null,\n" +
            "    \"reviewerUrl\": null,\n" +
            "    \"reviewerName\": \"Reviewer #8\",\n" +
            "    \"reviewerEmail\": null,\n" +
            "    \"sourceType\": \"custom\",\n" +
            "    \"isVerified\": false,\n" +
            "    \"source\": \"custom\",\n" +
            "    \"sourceName\": \"1-20 Reviews\",\n" +
            "    \"sourceId\": \"890cdd7974cdf8aabe6e9051f5a87303bdb933ae\",\n" +
            "    \"tags\": [],\n" +
            "    \"href\": null,\n" +
            "    \"logoHref\": null,\n" +
            "    \"photos\": []\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2097032,\n" +
            "    \"reviewId\": \"f0c8bdd06d6c4ec35de765657e118602\",\n" +
            "    \"reviewFullText\": \"2 star review\",\n" +
            "    \"reviewText\": \"2 star review\",\n" +
            "    \"numLikes\": 0,\n" +
            "    \"numComments\": 0,\n" +
            "    \"numShares\": 0,\n" +
            "    \"rating\": 2,\n" +
            "    \"reviewCreatedOn\": \"2 months ago\",\n" +
            "    \"reviewCreatedOnDate\": \"2021-01-25T12:56:55+00:00\",\n" +
            "    \"reviewCreatedOnTime\": 1611579415,\n" +
            "    \"reviewerId\": null,\n" +
            "    \"reviewerUrl\": null,\n" +
            "    \"reviewerName\": \"Reviewer #7\",\n" +
            "    \"reviewerEmail\": null,\n" +
            "    \"sourceType\": \"custom\",\n" +
            "    \"isVerified\": false,\n" +
            "    \"source\": \"custom\",\n" +
            "    \"sourceName\": \"1-20 Reviews\",\n" +
            "    \"sourceId\": \"890cdd7974cdf8aabe6e9051f5a87303bdb933ae\",\n" +
            "    \"tags\": [],\n" +
            "    \"href\": null,\n" +
            "    \"logoHref\": null,\n" +
            "    \"photos\": []\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2097031,\n" +
            "    \"reviewId\": \"ef2ad7498e260ec9462d0f27801c86b3\",\n" +
            "    \"reviewFullText\": \"\",\n" +
            "    \"reviewText\": \"\",\n" +
            "    \"numLikes\": 0,\n" +
            "    \"numComments\": 0,\n" +
            "    \"numShares\": 0,\n" +
            "    \"rating\": 1,\n" +
            "    \"reviewCreatedOn\": \"2 months ago\",\n" +
            "    \"reviewCreatedOnDate\": \"2021-01-25T12:56:34+00:00\",\n" +
            "    \"reviewCreatedOnTime\": 1611579394,\n" +
            "    \"reviewerId\": null,\n" +
            "    \"reviewerUrl\": null,\n" +
            "    \"reviewerName\": \"Reviewer #6\",\n" +
            "    \"reviewerEmail\": null,\n" +
            "    \"sourceType\": \"custom\",\n" +
            "    \"isVerified\": false,\n" +
            "    \"source\": \"custom\",\n" +
            "    \"sourceName\": \"1-20 Reviews\",\n" +
            "    \"sourceId\": \"890cdd7974cdf8aabe6e9051f5a87303bdb933ae\",\n" +
            "    \"tags\": [],\n" +
            "    \"href\": null,\n" +
            "    \"logoHref\": null,\n" +
            "    \"photos\": []\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2097030,\n" +
            "    \"reviewId\": \"d55229232defac9397fc6f12550d4f1f\",\n" +
            "    \"reviewFullText\": \"5 star review\",\n" +
            "    \"reviewText\": \"5 star review\",\n" +
            "    \"numLikes\": 0,\n" +
            "    \"numComments\": 0,\n" +
            "    \"numShares\": 0,\n" +
            "    \"rating\": 5,\n" +
            "    \"reviewCreatedOn\": \"2 months ago\",\n" +
            "    \"reviewCreatedOnDate\": \"2021-01-25T12:56:17+00:00\",\n" +
            "    \"reviewCreatedOnTime\": 1611579377,\n" +
            "    \"reviewerId\": null,\n" +
            "    \"reviewerUrl\": null,\n" +
            "    \"reviewerName\": \"Reviewer #5\",\n" +
            "    \"reviewerEmail\": null,\n" +
            "    \"sourceType\": \"custom\",\n" +
            "    \"isVerified\": false,\n" +
            "    \"source\": \"custom\",\n" +
            "    \"sourceName\": \"1-20 Reviews\",\n" +
            "    \"sourceId\": \"890cdd7974cdf8aabe6e9051f5a87303bdb933ae\",\n" +
            "    \"tags\": [],\n" +
            "    \"href\": null,\n" +
            "    \"logoHref\": null,\n" +
            "    \"photos\": []\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2097029,\n" +
            "    \"reviewId\": \"3a6dd5070788c36f28c4f78eb349c248\",\n" +
            "    \"reviewFullText\": \"4 star review\",\n" +
            "    \"reviewText\": \"4 star review\",\n" +
            "    \"numLikes\": 0,\n" +
            "    \"numComments\": 0,\n" +
            "    \"numShares\": 0,\n" +
            "    \"rating\": 4,\n" +
            "    \"reviewCreatedOn\": \"2 months ago\",\n" +
            "    \"reviewCreatedOnDate\": \"2021-01-25T12:55:57+00:00\",\n" +
            "    \"reviewCreatedOnTime\": 1611579357,\n" +
            "    \"reviewerId\": null,\n" +
            "    \"reviewerUrl\": null,\n" +
            "    \"reviewerName\": \"Reviewer #4\",\n" +
            "    \"reviewerEmail\": null,\n" +
            "    \"sourceType\": \"custom\",\n" +
            "    \"isVerified\": false,\n" +
            "    \"source\": \"custom\",\n" +
            "    \"sourceName\": \"1-20 Reviews\",\n" +
            "    \"sourceId\": \"890cdd7974cdf8aabe6e9051f5a87303bdb933ae\",\n" +
            "    \"tags\": [],\n" +
            "    \"href\": null,\n" +
            "    \"logoHref\": null,\n" +
            "    \"photos\": []\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2097028,\n" +
            "    \"reviewId\": \"01223a92f8823251b9678720def5ff43\",\n" +
            "    \"reviewFullText\": \"3 star review\",\n" +
            "    \"reviewText\": \"3 star review\",\n" +
            "    \"numLikes\": 0,\n" +
            "    \"numComments\": 0,\n" +
            "    \"numShares\": 0,\n" +
            "    \"rating\": 3,\n" +
            "    \"reviewCreatedOn\": \"2 months ago\",\n" +
            "    \"reviewCreatedOnDate\": \"2021-01-25T12:55:40+00:00\",\n" +
            "    \"reviewCreatedOnTime\": 1611579340,\n" +
            "    \"reviewerId\": null,\n" +
            "    \"reviewerUrl\": null,\n" +
            "    \"reviewerName\": \"Reviewer #3\",\n" +
            "    \"reviewerEmail\": null,\n" +
            "    \"sourceType\": \"custom\",\n" +
            "    \"isVerified\": false,\n" +
            "    \"source\": \"custom\",\n" +
            "    \"sourceName\": \"1-20 Reviews\",\n" +
            "    \"sourceId\": \"890cdd7974cdf8aabe6e9051f5a87303bdb933ae\",\n" +
            "    \"tags\": [],\n" +
            "    \"href\": null,\n" +
            "    \"logoHref\": null,\n" +
            "    \"photos\": []\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2097027,\n" +
            "    \"reviewId\": \"5b8c2de55dbb5ccf9f8d033c1859b559\",\n" +
            "    \"reviewFullText\": \"2 star review\",\n" +
            "    \"reviewText\": \"2 star review\",\n" +
            "    \"numLikes\": 0,\n" +
            "    \"numComments\": 0,\n" +
            "    \"numShares\": 0,\n" +
            "    \"rating\": 2,\n" +
            "    \"reviewCreatedOn\": \"2 months ago\",\n" +
            "    \"reviewCreatedOnDate\": \"2021-01-25T12:55:21+00:00\",\n" +
            "    \"reviewCreatedOnTime\": 1611579321,\n" +
            "    \"reviewerId\": null,\n" +
            "    \"reviewerUrl\": null,\n" +
            "    \"reviewerName\": \"Reviewer #2\",\n" +
            "    \"reviewerEmail\": null,\n" +
            "    \"sourceType\": \"custom\",\n" +
            "    \"isVerified\": false,\n" +
            "    \"source\": \"custom\",\n" +
            "    \"sourceName\": \"1-20 Reviews\",\n" +
            "    \"sourceId\": \"890cdd7974cdf8aabe6e9051f5a87303bdb933ae\",\n" +
            "    \"tags\": [],\n" +
            "    \"href\": null,\n" +
            "    \"logoHref\": null,\n" +
            "    \"photos\": []\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2097026,\n" +
            "    \"reviewId\": \"691d4d278dc23aa9a478e078b9382c2a\",\n" +
            "    \"reviewFullText\": \"1 star review\",\n" +
            "    \"reviewText\": \"1 star review\",\n" +
            "    \"numLikes\": 0,\n" +
            "    \"numComments\": 0,\n" +
            "    \"numShares\": 0,\n" +
            "    \"rating\": 1,\n" +
            "    \"reviewCreatedOn\": \"2 months ago\",\n" +
            "    \"reviewCreatedOnDate\": \"2021-01-25T12:55:06+00:00\",\n" +
            "    \"reviewCreatedOnTime\": 1611579306,\n" +
            "    \"reviewerId\": null,\n" +
            "    \"reviewerUrl\": null,\n" +
            "    \"reviewerName\": \"Reviewer #1\",\n" +
            "    \"reviewerEmail\": null,\n" +
            "    \"sourceType\": \"custom\",\n" +
            "    \"isVerified\": false,\n" +
            "    \"source\": \"custom\",\n" +
            "    \"sourceName\": \"1-20 Reviews\",\n" +
            "    \"sourceId\": \"890cdd7974cdf8aabe6e9051f5a87303bdb933ae\",\n" +
            "    \"tags\": [],\n" +
            "    \"href\": null,\n" +
            "    \"logoHref\": null,\n" +
            "    \"photos\": []\n" +
            "  }\n" +
            "]\n";

    public static List<Review> reviewList = new ArrayList<>();

    @PostConstruct
    public void init () throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        reviewList = mapper.readValue(reviewJson, new TypeReference<List<Review>>(){});


        }
}

