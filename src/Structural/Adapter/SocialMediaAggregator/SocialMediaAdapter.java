package Structural.Adapter.SocialMediaAggregator;

import java.util.List;

public interface SocialMediaAdapter {
    public List<SocialMediaPost> fetchPosts(Long userId, Long timeStamp);
    public void postStatus(Long userId, String status);
}
