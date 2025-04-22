package Structural.Adapter.SocialMediaAggregator;

import Structural.Adapter.SocialMediaAggregator.external.TwitterApi;

import java.util.List;
import java.util.stream.Collectors;

public class TwitterAdapter implements SocialMediaAdapter{

 private final TwitterApi twitterApi = new TwitterApi();

    @Override
    public List<SocialMediaPost> fetchPosts(Long userId, Long timeStamp) {
        return twitterApi.getTweets(userId)
                .stream()
                .map(post-> new SocialMediaPost(post.getId(), post.getUserId(), post.getTweet(), 1235432234L))
                .collect(Collectors.toList());
    }

    @Override
    public void postStatus(Long userId, String status) {
        twitterApi.tweet(userId, status);
    }
}
