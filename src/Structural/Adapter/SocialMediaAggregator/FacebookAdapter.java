package Structural.Adapter.SocialMediaAggregator;

import Structural.Adapter.SocialMediaAggregator.external.FacebookApi;

import java.util.List;
import java.util.stream.Collectors;

public class FacebookAdapter implements SocialMediaAdapter{

   private final FacebookApi facebookApi = new FacebookApi();

    @Override
    public List<SocialMediaPost> fetchPosts(Long userId, Long timeStamp) {
        return facebookApi.fetchFacebookPosts(userId, timeStamp)
                .stream()
                .map(post -> new SocialMediaPost(post.getId(), post.getUserId(), post.getStatus(), post.getTimestamp()))
                .collect(Collectors.toList());
    }

    @Override
    public void postStatus(Long userId, String status) {
        facebookApi.postFacebookStatus(userId, status);
    }
}
