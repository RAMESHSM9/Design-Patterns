package Structural.Adapter.SocialMediaAggregator;

public class SocialMediaPost {
    private String id;
    private String content;
    private Long authorId;
    private Long timeStamp;
    public SocialMediaPost(String id, Long authorId, String content, Long timeStamp) {
        this.id = id;
        this.authorId = authorId;
        this.content = content;
        this.timeStamp = timeStamp;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Long getAuthorId() {
        return authorId;
    }
    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Long getTimeStamp() {
        return timeStamp;
    }
    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
