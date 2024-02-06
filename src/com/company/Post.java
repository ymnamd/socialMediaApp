package com.company;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Post {
    private String content;
    private User author;
    private LocalDateTime timestamp;
    private int numberOfComments;
    private Comment[] comments;
    private User[] likes;
    private int numberOfLikes;

    // Constructor
    public Post(String content, User author) {
        this.content = content;
        this.author = author;
        this.timestamp = LocalDateTime.now();
        this.comments = new Comment[0];
        this.numberOfComments = comments.length;
        this.likes = new User[0];
        this.numberOfLikes = likes.length;
    }

    // Getters
    public String getContent() {
        return content;
    }

    public User getAuthor() {
        return author;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public Comment[] getComments() {
        return comments;
    }

    public User[] getLikes() {
        return likes;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void addComment(Comment comment) {
        Comment[] updatedComments = Arrays.copyOf(comments, comments.length + 1);
        updatedComments[comments.length] = comment;
        comments = updatedComments;
        numberOfComments++;

    }

    public void addLike(User like) {
        User[] updatedLikes = Arrays.copyOf(likes, likes.length + 1);
        updatedLikes[likes.length] = like;
        likes = updatedLikes;
        numberOfLikes++;
    }
}
