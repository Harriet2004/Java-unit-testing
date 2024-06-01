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
        if (!isValidPost()) {
            return false;
        }
        try (BufferedWriter writer  = new BufferedWriter (new FileWriter("post.txt",true))) {
            writer.write("\n" + "Post ID:" + this.postID + "\n");
            writer.write("Title:" + this.postTitle + "\n");
            writer.write("Body:" + this.postBody + "\n");
            writer.write("Tags: ");
            for (String tag: this.postTags) {
                writer.write(tag + " ");
            }
            writer.write("\n");
            writer.write("Type:" + this.postTypes + "\n");
            writer.write("Emergency:" + this.postEmergency + "\n");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private ArrayList<String> parseTags(String postTags) {
        ArrayList<String> tags = new ArrayList<>();
        int size = postTags.length();
        if (size > 1 && postTags.charAt(0) == ('[') && postTags.charAt(size - 1) == (']')) {
            String[] tagList = postTags.substring(1, postTags.length() - 1).split(",");
            for (String tag : tagList) {
                tags.add(tag.trim());
            }
        }
        return tags;
    }

    public boolean addComment(int Id, String commentText) {
        if (!isValidComment(commentText)) {
            return false;
        }

        comments.add(commentText);
        try (BufferedWriter writer  = new BufferedWriter (new FileWriter("post.txt",true))) {
            writer.write("Post ID" + Id + ": ");
            writer.write(commentText + "\n");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private boolean isValidPost() {
        if (postTitle.length() < 10 || postTitle.length() > 250) {
            return false;
        }

        for (int i = 0; i < Math.min(postTitle.length() , 5); i++) {
            char c = postTitle.charAt(i);
            if (!Character.isLetter(c)) {
                return false;
            }
        }

        if (postBody.length() < 250) {
            return false;
        }

        if (postTags.size() < 2 || postTags.size() > 5) {
            return false;
        }

        for (String tag : postTags) {
            if (tag.length() < 2 || tag.length() > 10 || !tag.equals(tag.toLowerCase())) {
                return false;
            }
        }

        if (postTypes.equals("Easy") && postTags.size() > 3) {
            return false;
        }

        if ((postTypes.equals("Difficult") || postTypes.equals("Very Difficult")) && postBody.length() < 300) {
            return false;
        }

        if ((postEmergency.equals("Immediately Needed") || postEmergency.equals("Highly Needed")) && postTypes.equals("Easy")) {
            return false;
        }

        if (postEmergency.equals("Ordinary") && (postTypes.equals("Very Difficult") || postTypes.equals("Difficult"))) {
            return false;
        }
        return true;
    }

    private boolean isValidComment(String commentText) {
        if (commentText.length() < 4 || commentText.length() > 10 || !Character.isUpperCase(commentText.charAt(0))) {
            return false;
        }

        if (comments.size() > 5 || ((postTypes.equals("Easy") || postEmergency.equals("Ordinary")) && comments.size() > 3)) {
            return false;
        }
        return true;
    }
}
