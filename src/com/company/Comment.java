package com.company;
import java.util.Arrays;

public class Comment {
    private String content;
    private User commenter;
    private User[] likes;
    private int numberOfLikes;
    private int numberOfReplies;
    private Comment[] replies;

    // Constructor
    public Comment(String content, User commenter) {
        this.content = content;
        this.commenter = commenter;
        this.likes = new User[0];
        this.numberOfLikes = likes.length;
        this.replies = new Comment[0];
        this.numberOfReplies = replies.length;
    }

    // Getters
    public String getContent() {
        return content;
    }

    public User getCommenter() {
        return commenter;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public int getNumberOfReplies() {
        return numberOfReplies;
    }

    public Comment[] getReplies() {
        return replies;
    }

    public User[] getLikes() {
        return likes;
    }

    // Method to add likes
    public void addLike(User like) {
        User[] updatedLikes = Arrays.copyOf(likes, likes.length + 1);
        updatedLikes[likes.length] = like;
        likes = updatedLikes;
        numberOfLikes++;
    }

    // Method to add a reply to the comment
    public void addReply(Comment reply) {
        // Create a new array to accommodate the new reply
        Comment[] updatedReplies = Arrays.copyOf(replies, replies.length + 1);
        updatedReplies[replies.length] = reply;
        replies = updatedReplies;
    }
}
