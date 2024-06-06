package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Seperate test class for testing the posts (addPost())
class PostTest {

    //Defining few variables that have huge content that will be used in some test cases
    //Defining a variable postTitleMoreThan250 (postName greater than 250 characters)
    String postTitleMoreThan250 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent imperdiet a " +
            "dolor at malesuada. Nam a elit luctus, ultricies turpis eu, facilisis velit. Maecenas tempus augue " +
            "vel tristique accumsan. Morbi dictum massa ac hendrerit";

    //Defining a variable validBodyText (valid postBody for valid inputs)
    String validBodyText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent imperdiet a " +
            "dolor at malesuada. Nam a elit luctus, ultricies turpis eu, facilisis velit. Maecenas tempus augue " +
            "vel tristique accumsan. Morbi dictum massa ac hendrerit efficitur ahsidhi mans, dsflj kdkkd alsal +" +
            "asdkhab ei qhs abena sc akkef aq xkxk ehap lskdap dm v, qpkefm cnxv kjn qpepc zlkcv akjf akjf";


    //Defining a variable postBodyLessThan250_1 (postBody less than 250 characters)
    String postBodyLessThan250_1 = "This post body is definitely less than 250 characters for sure";

    //Defining a variable postBodyLessThan250_2 (postBody less than 250 characters)
    String postBodyLessThan250_2 = "This is too short 12345!@##$%%";

    //Defining a variable postBodyLessThan300 (postBody less than 300 characters)
    String postBodyLessThan300 = "This body text is less than 300 characters";

    @Test
    void testAddPost_testcase1() {
        //Test Case 1: Checking the addPost() function with valid Inputs

        //Test Case 1_Test Data 1
        Post postTestCase1Data1 = new Post(1,"Sample post Title", validBodyText, "[tag1,tag2,tag3]",
                "Easy","Ordinary");
        assertTrue(postTestCase1Data1.addPost());

        //Test Case 1_Test Data 2
        Post posttestCase1Data2 = new Post(2,"Another post Title", validBodyText, "[tag1,tag2]",
                "Difficult","Highly Needed");
        assertTrue(posttestCase1Data2.addPost());

        //Test Case 1_Test Data 3
        Post posttestCase1Data3 = new Post(3,"Third post Title", validBodyText, "[tag1,tag2,tag3,tag4,tag5]",
                "Very Difficult","Immediately Needed");
        assertTrue(posttestCase1Data3.addPost());
    }

    @Test
    void testAddPost_testcase2() {
        //Test Case 2: Checking the addPost() function with invalid postName

        //Test Case 2_Test Data 1
        //Having the title less than 10 characters
        Post posttestCase2Data1 = new Post(1, "Title", validBodyText, "[tag1,tag2,tag3]",
                "Easy", "Ordinary");
        assertTrue(posttestCase2Data1.addPost());

        //Test Case 2_Test Data 2
        //Having the title more than 250 characters
        Post posttestCase2Data2 = new Post(2, postTitleMoreThan250, validBodyText, "[tag1,tag2,tag3]",
                "Easy", "Ordinary");
        assertTrue(posttestCase2Data2.addPost());

        //Test Case 2_Test Data 3
        //Starting the first five characters as numbers
        Post posttestCase2Data3 = new Post(3, "12345Title", validBodyText, "[tag1,tag2]",
                "Difficult", "Highly Needed");
        assertTrue(posttestCase2Data3.addPost());

        //Test Case 2_Test Data 4
        //Starting the first five characters as special characters
        Post posttestCase2Data4 = new Post(4, "!@#$% Title", validBodyText, "[tag1,tag2,tag3,tag4,tag5]",
                "Very Difficult", "Immediately Needed");
        assertTrue(posttestCase2Data4.addPost());
    }

    @Test
    void testAddPost_testcase3() {
        //Test Case 3: Checking the addPost() function with invalid postBody

        //Test Case 3_Test Data 1
        //Having the postBody less than 250 characters
        Post posttestCase3Data1 = new Post(1, "Sample post Title", postBodyLessThan250_1, "[tag1,tag2,tag3]",
                "Easy", "Ordinary");
        assertTrue(posttestCase3Data1.addPost());

        //Test Case 3_Test Data 2
        //Having the postBody less than 250 characters (different set of characters)
        Post posttestCase3Data2 = new Post(2, "Sample post Title", postBodyLessThan250_2, "[tag1,tag2]",
                "Difficult", "Highly Needed");
        assertTrue(posttestCase3Data2.addPost());
    }

    @Test
    void testAddPost_testcase4() {
        //Test Case 4: Checking the addPost() function with invalid postName and invalid postBody

        //Test Case 4_Test Data 1
        //Having the postBody less than 250 characters and a postName greater than 250 characters
        Post posttestCase4Data1 = new Post(1, postTitleMoreThan250, postBodyLessThan250_1, "[tag1,tag2,tag3]",
                "Easy", "Ordinary");
        assertTrue(posttestCase4Data1.addPost());

        //Test Case 4_Test Data 2
        //Having the postBody less than 250 characters and the postName less than 10 characters
        Post posttestCase4Data2 = new Post(2, "Title", postBodyLessThan250_2, "[tag1,tag2]",
                "Difficult", "Highly Needed");
        assertTrue(posttestCase4Data2.addPost());
    }

    @Test
    void testAddPost_testcase5() {
        //Test Case 5: Checking the addPost() function with invalid postTags

        //Test Case 5_Test Data 1
        //Having less than 2 tags
        Post posttestCase5Data1 = new Post(1, "Sample post Title", validBodyText, "[tag1]",
                "Difficult", "Immediately Needed");
        assertTrue(posttestCase5Data1.addPost());

        //Test Case 4_Test Data 2
        //Having more than 5 tags
        Post posttestCase5Data2 = new Post(2, "Another post Title", validBodyText, "[tag1,tag2,tag3,tag4,tag5,tag6]",
                "Difficult", "Highly Needed");
        assertTrue(posttestCase5Data2.addPost());

        //Test Case 4_Test Data 3
        //Having tags less than 2 characters
        Post posttestCase5Data3 = new Post(3, "Third post Title", validBodyText, "[t,g]",
                "Difficult", "Highly Needed");
        assertTrue(posttestCase5Data3.addPost());

        //Test Case 4_Test Data 4
        //Having tags more than 10 characters
        Post posttestCase5Data4 = new Post(4, "Fourth post Title", validBodyText, "[thistagisbig,thistagiswrong,thistagishuge]",
                "Difficult", "Highly Needed");
        assertTrue(posttestCase5Data4.addPost());

        //Test Case 4_Test Data 5
        //Having tags with uppercase characters
        Post posttestCase5Data5 = new Post(5, "Fifth post Title", validBodyText, "[TAG1,TAG2,TAG3,TAG4]",
                "Difficult", "Highly Needed");
        assertTrue(posttestCase5Data5.addPost());
    }

    @Test
    void testAddPost_testcase6() {
        //Test Case 6: Checking the addPost() function with invalid postType conditions

        //Test Case 6_Test Data 1
        //Having the more than 3 tags for the postType "Easy"
        Post posttestCase6Data1 = new Post(1, "Sample body Title", validBodyText, "[tag1,tag2,tag3,tag4]",
                "Easy", "Ordinary");
        assertTrue(posttestCase6Data1.addPost());

        //Test Case 6_Test Data 2
        //Having the postBody less than 300 characters and postType as "Very Difficult"
        Post posttestCase6Data2 = new Post(2, "Another post Title", postBodyLessThan300, "[tag1,tag2]",
                "Very Difficult", "Highly Needed");
        assertTrue(posttestCase6Data2.addPost());

        //Test Case 6_Test Data 3
        //Having the postBody less than 300 characters and postType as "Difficult"
        Post posttestCase6Data3 = new Post(3, "Third post Title", postBodyLessThan300, "[tag1,tag2,tag3]",
                "Difficult", "Highly Needed");
        assertTrue(posttestCase6Data3.addPost());
    }

    @Test
    void testAddPost_testcase7() {
        //Test Case 7: Checking the addPost() function with invalid postEmergency conditions

        //Test Case 7_Test Data 1
        //Having the postEmergency as "Highly Needed" and postType as "Easy"
        Post posttestCase7Data1 = new Post(1, "Sample post Title", validBodyText, "[tag1,tag2,tag3]",
                "Easy", "Highly Needed");
        assertTrue(posttestCase7Data1.addPost());

        //Test Case 7_Test Data 2
        //Having the postEmergency as "Highly Needed" and postType as "Easy"
        Post posttestCase7Data2 = new Post(2, "Another post Title", validBodyText, "[tag1,tag2]",
                "Easy", "Immediately Needed");
        assertTrue(posttestCase7Data2.addPost());

        //Test Case 7_Test Data 3
        //Having the postEmergency as "Highly Needed" and postType as "Easy"
        Post posttestCase7Data3 = new Post(3, "Third post Title", validBodyText, "[tag1,tag2,tag3,tag4]",
                "Very Difficult", "Ordinary");
        assertTrue(posttestCase7Data1.addPost());

        //Test Case 7_Test Data 4
        //Having the postEmergency as "Highly Needed" and postType as "Easy"
        Post posttestCase7Data4 = new Post(4, "Fourth post Title", validBodyText, "[tag1,tag2,tag3]",
                "Difficult", "Ordinary");
        assertTrue(posttestCase7Data2.addPost());
    }
}
