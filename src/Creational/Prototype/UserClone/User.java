package Prototype.UserClone;

public class User implements ClonableObject<User>{
    private long userId;

    private String username;
    private String email;
    private String displayName;
    private int age;
    private UserType type;

    public User(long userId, String username, String email, String displayName, int age, UserType type) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.displayName = displayName;
        this.age = age;
        this.type = type;
    }

    public long getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getAge() {
        return age;
    }

    public UserType getType() {
        return type;
    }

    public User(User clone) {
        this.userId = clone.getUserId();
        this.username = clone.getUsername();
        this.email = clone.getEmail();
        this.displayName = clone.getDisplayName();
        this.age = clone.getAge();
        this.type = clone.getType();
    }
    @Override
    public User cloneObject() {
        return new User(this);
    }
}
