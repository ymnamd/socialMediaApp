package com.company;

public class Main {

    public static void main(String[] args) {
	    System.out.println(111);
        User yameen = new User("ymn", "yameen", "yameen@gmail.com", "password");
        User someone = new User("somebody", "random", "random@gmail.com", "password1");

        Post dayOut = new Post("At the zoo", yameen);
        yameen.addPost(dayOut);
        Comment wow = new Comment("wow very nice", someone);
        Comment yes = new Comment("yes", yameen);
        yameen.getPosts()[0].addComment(wow);
        yameen.getPosts()[0].getComments()[0].addReply(yes);

        System.out.println(yameen.getPosts()[0].getComments()[0].getReplies()[0].getContent());
        
    }
}
