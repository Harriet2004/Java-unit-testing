package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


//Seperate test class for testing the comments (addComment())
class CommentTest {

    //Defining a variable validBodyText (valid postBody for valid inputs) which will be used in the test cases
    String validBodyText = "Lroororem ipsum dolor sit amet, consectetur adipiscing elit. Praesent imperdiet a " +
            "dolor at malesuada. Nam a elit luctus, ultricies turpis eu, facilisis velit. Maecenas tempus augue " +
            "vel tristique accumsan. Morbi dictum massa ac hendrerit efficitur ahsidhi mans, dsflj kdkkd alsal +" +
            "asdkhab ei qhs abena sc akkef aq xkxk ehap lskdap dm v, qpkefm cnxv kjn qpepc zlkcv akjf akjf";

    @Test
    void testAddComment_testcase1() {
        //Test Case 1: Checking the addComment() function with valid Inputs

        //Adding a valid post for the comments test case
        Post testingPostData_1 = new Post(1,"Sample post Title", validBodyText, "[tag1,tag2,tag3]",
                "Difficult","Highly Needed");
        assertTrue(testingPostData_1.addPost());

        //Test Case 1_Test Data 1
        String commenttestCase1Data1 = "Amazing post, found it useful!";
        //Test Case 1_Test Data 2
        String commenttestCase1Data2 = "Valid information found from this post.";
        //Test Case 1_Test Data 3
        String commenttestCase1Data3 = "Cool post! Enjoyed it a lot.";

        assertTrue(testingPostData_1.addComment(commenttestCase1Data1));
        assertTrue(testingPostData_1.addComment(commenttestCase1Data2));
        assertTrue(testingPostData_1.addComment(commenttestCase1Data3));

    }

    @Test
    void testAddComment_testcase2() {
        //Test Case 2: Checking the addComment() function with invalid comments inputs (comments with less than 4 words)

        //Adding a valid post for the comments test case
        Post testingPostData_2 = new Post(2,"Sample post Title", validBodyText, "[tag1,tag2,tag3]",
                "Easy","Ordinary");
        assertTrue(testingPostData_2.addPost());

        //Test Case 2_Test Data 1
        String commenttestCase2Data1 = "Amazing!";
        //Test Case 2_Test Data 2
        String commenttestCase2Data2 = "Valid";
        //Test Case 2_Test Data 3
        String commenttestCase2Data3 = "Cool one!";

        assertTrue(testingPostData_2.addComment(commenttestCase2Data1));
        assertTrue(testingPostData_2.addComment(commenttestCase2Data2));
        assertTrue(testingPostData_2.addComment(commenttestCase2Data3));
    }

    @Test
    void testAddComment_testcase3() {
        //Test Case 3: Checking the addComment() function with invalid comments inputs (comments with more than 10 words)

        //Adding a valid post for the comments test case
        Post testingPostData_3 = new Post(3,"Sample post Title", validBodyText, "[tag1,tag2]",
                "Easy","Ordinary");
        assertTrue(testingPostData_3.addPost());

        //Test Case 3_Test Data 1
        String commenttestCase3Data1 = "What a post! I found everything that I wanted from this.";
        //Test Case 3_Test Data 2
        String commenttestCase3Data2 = "Not an interesting post, could be much better info from this";
        //Test Case 3_Test Data 3
        String commenttestCase3Data3 = "Wow wow wow wow wow! This is really good and amazing, good job!";

        assertTrue(testingPostData_3.addComment(commenttestCase3Data1));
        assertTrue(testingPostData_3.addComment(commenttestCase3Data2));
        assertTrue(testingPostData_3.addComment(commenttestCase3Data3));
    }

    @Test
    void testAddComment_testcase4() {
        //Test Case 4: Checking the addComment() function with invalid comments inputs (comments where first character not uppercase)

        //Adding a valid post for the comments test case
        Post testingPostData_4 = new Post(4,"Fourth Title", validBodyText, "[tag1,tag2]",
                "Easy","Ordinary");
        assertTrue(testingPostData_4.addPost());

        //Test Case 4_Test Data 1
        String commenttestCase4Data1 = "amazing post, found it useful!";
        //Test Case 4_Test Data 2
        String commenttestCase4Data2 = "valid information found from this post.";
        //Test Case 4_Test Data 3
        String commenttestCase4Data3 = "cool post! Enjoyed it a lot.";

        assertTrue(testingPostData_4.addComment(commenttestCase4Data1));
        assertTrue(testingPostData_4.addComment(commenttestCase4Data2));
        assertTrue(testingPostData_4.addComment(commenttestCase4Data3));
    }

    @Test
    void testAddComment_testcase5() {
        //Test Case 5: Checking the addComment() function with invalid comments inputs (adding more than 5 comments)

        //Adding a valid post for the comments test case
        Post testingPostData_5 = new Post(5,"Great post Title", validBodyText, "[tag1,tag2,tag3,tag4]",
                "Difficult","Immediately Needed");
        assertTrue(testingPostData_5.addPost());

        //Test Case 5_Test Data 1
        String commenttestCase5Data1 = "Amazing post, found it useful!";
        //Test Case 5_Test Data 2
        String commenttestCase5Data2 = "Valid information found from this post.";
        //Test Case 5_Test Data 3
        String commenttestCase5Data3 = "Cool post! Enjoyed it a lot.";
        //Test Case 5_Test Data 4
        String commenttestCase5Data4 = "This is great! Keep posting more stuff.";
        //Test Case 5_Test Data 5
        String commenttestCase5Data5 = "Great work! loved it a lot.";

        //Adding these comments over the limit of 5 comments and testing
        //Test Case 5_Test Data 6
        String commenttestCase5Data6 = "The first comment that will not be added.";
        //Test Case 5_Test Data 7
        String commenttestCase5Data7 = "The second comment that will not be added.";
        //Test Case 5_Test Data 8
        String commenttestCase5Data8 = "The third comment that will not be added.";

        //Firstly adding 5 valid comments to the valid post above
        assertTrue(testingPostData_5.addComment(commenttestCase5Data1));
        assertTrue(testingPostData_5.addComment(commenttestCase5Data2));
        assertTrue(testingPostData_5.addComment(commenttestCase5Data3));
        assertTrue(testingPostData_5.addComment(commenttestCase5Data4));
        assertTrue(testingPostData_5.addComment(commenttestCase5Data5));
        //Adding these comments over the limit of 5 comments and testing
        assertTrue(testingPostData_5.addComment(commenttestCase5Data6));
        assertTrue(testingPostData_5.addComment(commenttestCase5Data7));
        assertTrue(testingPostData_5.addComment(commenttestCase5Data8));
    }

    @Test
    void testAddComment_testcase6() {
        //Test Case 6: Checking the addComment() function with invalid inputs (adding more than 3 comments for “Easy” and “Ordinary” posts)

        //Adding a valid post for the comments test case
        Post testingPostData_6 = new Post(6,"Similar post Title", validBodyText, "[tag1,tag2]",
                "Easy","Ordinary");
        assertTrue(testingPostData_6.addPost());

        //Test Case 6_Test Data 1
        String commenttestCase6Data1 = "Amazing post, found it useful!";
        //Test Case 6_Test Data 2
        String commenttestCase6Data2 = "Valid information found from this post.";
        //Test Case 6_Test Data 3
        String commenttestCase6Data3 = "Cool post! Enjoyed it a lot.";

        //Adding these comments over the limit of 3 comments for "Easy" and "Ordinary" posts
        //Test Case 6_Test Data 4
        String commenttestCase6Data4 = "The first comment that will not be added.";
        //Test Case 6_Test Data 5
        String commenttestCase6Data5 = "The second comment that will not be added.";
        //Test Case 6_Test Data 6
        String commenttestCase6Data6 = "The third comment that will not be added.";

        //Firstly adding 3 valid comments to the valid post above of type "Easy" and "Ordinary"
        assertTrue(testingPostData_6.addComment(commenttestCase6Data1));
        assertTrue(testingPostData_6.addComment(commenttestCase6Data2));
        assertTrue(testingPostData_6.addComment(commenttestCase6Data3));
        //Adding these comment over the limit of 3 comments for "Easy" and "Ordinary" posts
        assertTrue(testingPostData_6.addComment(commenttestCase6Data4));
        assertTrue(testingPostData_6.addComment(commenttestCase6Data5));
        assertTrue(testingPostData_6.addComment(commenttestCase6Data6));
    }
}
