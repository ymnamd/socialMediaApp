package com.company;
import java.time.LocalDate;
import java.util.Arrays;

public class User {
    private String username;
    private String name;
    private String email;
    private String password;
    private LocalDate dateJoined;
    private User[] followers;
    private int numberOfFollowers;
    private User[] following;
    private int numberOfFollowing;
    private Post[] posts;
    private int numberOfPosts;

    // Constructor
    public User(String username, String name, String email, String password) {
        this.username = username;
        this.name = name;
        this.email = email;
        this.password = password;
        this.dateJoined = LocalDate.now();
        this.followers = new User[0];
        this.numberOfFollowers = followers.length;
        this.following = new User[0];
        this.numberOfFollowing = following.length;
        this.posts = new Post[0];
        this.numberOfPosts = posts.length;

    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }

    public User[] getFollowers() {
        return followers;
    }

    public int getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public int getNumberOfFollowing() {
        return numberOfFollowing;
    }

    public User[] getFollowing() {
        return following;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public Post[] getPosts() {
        return posts;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPosts(Post[] posts) {
        this.posts = posts;
    }

    public void addPost(Post post) {
        Post[] updatedPosts = Arrays.copyOf(posts, posts.length + 1);
        updatedPosts[posts.length] = post;
        posts = updatedPosts;
        numberOfPosts++;
    }

    public void followSomeone(User user) {
        if (user.getUsername() == this.getUsername()) {
            System.out.println("Cannot follow yourself");
        }
        else {
            User[] updatedFollowing = Arrays.copyOf(following, following.length + 1);
            updatedFollowing[following.length] = user;
            following = updatedFollowing;
            numberOfFollowing++;

            user.followYou(this);
        }
    }

    public void followYou(User user) {
        User[] updatedFollowers = Arrays.copyOf(followers, followers.length + 1);
        updatedFollowers[followers.length] = user;
        followers = updatedFollowers;
        numberOfFollowers++;
    }
}
