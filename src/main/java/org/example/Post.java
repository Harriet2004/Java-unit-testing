package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class Post {
    private int postID;
    private String postTitle;
    private String postBody;
    private ArrayList<String> postTags;
    private String postTypes;
    private String postEmergency;
    private ArrayList<String> comments;

    //Having a constructor for the class Post for all the variables that are going to be tested
    public Post(int postID, String postTitle, String postBody, String postTags, String postTypes, String postEmergency) {
        this.postID = postID;
        this.postTitle = postTitle;
        this.postBody = postBody;
        this.postTags = parseTags(postTags);
        this.postTypes = postTypes;
        this.postEmergency = postEmergency;
        this.comments = new ArrayList<>();
    }

    public boolean addPost() {
        //Checking through a method isValidPost() to check where it is valid or not, if it is not valid, returns false
        if (!isValidPost()) {
            return false;
        }
        //If it is a valid post, writing the contents to a text file 'post.txt'
        try (BufferedWriter writer  = new BufferedWriter (new FileWriter("post.txt",true))) {
            writer.write("\n" + "Post ID: " + this.postID + "\n");
            writer.write("Title: " + this.postTitle + "\n");
            writer.write("Body: " + this.postBody + "\n");
            writer.write("Tags: ");
            for (String tag: this.postTags) {
                writer.write(tag + " ");
            }
            writer.write("\n");
            writer.write("Type: " + this.postTypes + "\n");
            writer.write("Emergency: " + this.postEmergency + "\n");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    //As the tags are inputed a String ("[tag1,tag2,tag3]"), I am parsing through the String to get the tags inputs
    private ArrayList<String> parseTags(String postTags) {
        ArrayList<String> tags = new ArrayList<>(); //Array List for tags
        int size = postTags.length();
        //Checking if the string starts and end with square bracket to get the tags from it
        if (size > 1 && postTags.charAt(0) == ('[') && postTags.charAt(size - 1) == (']')) {
            //Splitting the String with ',' and getting each tag from the tags String and adding to a String array
            String[] tagList = postTags.substring(1, postTags.length() - 1).split(",");
            //Going through each tag in the list of tags and adding it to the main ArrayList of tags
            for (String tag : tagList) {
                tags.add(tag);
            }
        }
        return tags; //Returning the ArrayList of tags
    }

    public boolean addComment(String commentText) {

        comments.add(commentText); //Firstly adding the String commentText to the ArrayList of comments
        //Checking through a method isValidComment() to check where it is valid or not, if it is not valid, returns false
        if (!isValidComment(commentText)) {
            return false;
        }

        //If it is a valid comment, writing the contents to a text file 'post.txt'
        try (BufferedWriter writer  = new BufferedWriter (new FileWriter("post.txt",true))) {
            writer.write("Comment: ");
            writer.write(commentText + "\n");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean isValidPost() {
        //Checking if the postTitle is less than 10 or more than 250, if it is, it returns false
        if (postTitle.length() < 10 || postTitle.length() > 250) {
            return false;
        }

        //Checking whether the first five characters of postTitle are numbers or special characters, if it is, it returns false
        //Using Math.min so that the for loop iterates till 5 or the length of the title if the title is less than 5 chars
        for (int i = 0; i < Math.min(postTitle.length() , 5); i++) {
            char c = postTitle.charAt(i);
            if (!Character.isLetter(c)) {
                return false; //If any of the characters are not letters, it returns false
            }
        }
        //Checking whether the postBody is less than 250 characters, if it is, returns false
        if (postBody.length() < 250) {
            return false;
        }
        //Checking whether there are less than 2 or more than 5 tags for that particular post, if it does,returns false
        if (postTags.size() < 2 || postTags.size() > 5) {
            return false;
        }
        //Checking whether the tags are less than 2 or more than 10 characters or if there are uppercase characters
        for (String tag : postTags) { //Going through the ArrayList of postTags and checking, if it does, it returns false
            if (tag.length() < 2 || tag.length() > 10 || !tag.equals(tag.toLowerCase())) {
                return false;
            }
        }
        //Checking if there are more than 3 tags for a post of type "Easy", if it does, it returns false
        if (postTypes.equals("Easy") && postTags.size() > 3) {
            return false;
        }
        //Checking if the body of the post is less than 300 characters for a post of type "Difficult" or "Very Difficult"
        if ((postTypes.equals("Difficult") || postTypes.equals("Very Difficult")) && postBody.length() < 300) {
            return false; //If it does, it returns false
        }
        //Checking if a post is of type "Easy" AND of emergency "Immediately Needed" or "Highly Needed"
        if ((postEmergency.equals("Immediately Needed") || postEmergency.equals("Highly Needed")) && postTypes.equals("Easy")) {
            return false; //If it does, it returns false
        }
        //Checking if a post is of emergency "Ordinary" AND of type "Very Difficult" or "Difficult"
        if (postEmergency.equals("Ordinary") && (postTypes.equals("Very Difficult") || postTypes.equals("Difficult"))) {
            return false; //If it does, it returns false
        }
        //If the post passes through all these conditions and is valid, the method returns true and the post is valid
        return true;
    }

    private boolean isValidComment(String commentText) {
        //Checking whether the comments has less than 4 or more than 10 words or if the first character of the comments is uppercase
        //First splitting the comment with " " to get different words, and grabbing its size to get the number of words
        int size = commentText.split(" ").length;
        if (size < 4 || size > 10 || !Character.isUpperCase(commentText.charAt(0))) {
            return false; //If it does, it returns false
        }

        //Checking whether there are more than 5 comments in a post
        //And checking where there are more than 3 comments for a post of type "Easy" or "Ordinary"
        if (comments.size() > 5 || ((postTypes.equals("Easy") || postEmergency.equals("Ordinary")) && comments.size() > 3)) {
            return false; //If it does, it returns false
        }
        return true;
    }
}
