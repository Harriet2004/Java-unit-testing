package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PostTest {

    @Test
    void testAddPost_testcase1() {
        //Test Case 1: Checking the addPost() function with valid Inputs
        //Defining a variable validBodyText
        String validBodyText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent imperdiet a " +
                "dolor at malesuada. Nam a elit luctus, ultricies turpis eu, facilisis velit. Maecenas tempus augue " +
                "vel tristique accumsan. Morbi dictum massa ac hendrerit efficitur. Duis dapibus, lorem at porta " +
                "venenatis, leo enim varius eros, eget laoreet mi urna a nulla. Pellentesque habitant morbi tristique " +
                "senectus et netus et malesuada fames ac turpis egestas. Maecenas sagittis egestas nisl vel convallis." +
                " Nam euismod elementum ultrices. Praesent vitae odio at felis aliquam cursus. Sed placerat eros " +
                "magna, ac vestibulum tellus scelerisque ultrices. Quisque in diam non ipsum iaculis porta quis at " +
                "lectus. Sed est nisi, condimentum ac rhoncus sit amet, viverra rutrum sapien. Nunc mi risus, " +
                "tristique ac turpis vitae, dapibus faucibus magna. Sed euismod tincidunt tortor vitae porttitor. " +
                "Cras imperdiet dolor vitae lorem posuere ultricies. In hac habitasse platea dictumst. Donec non " +
                "nulla at orci tempus tincidunt sit amet quis purus. Suspendisse potenti. Phasellus nisl lectus, " +
                "placerat eget nibh in, fermentum lobortis sem.Vivamus finibus cursus gravida. Donec vehicula eget " +
                "nulla convallis laoreet. Aenean tempus suscipit arcu ac bibendum. Nullam sed nunc in ante gravida " +
                "venenatis. Nullam sagittis nisi ante, id ultrices risus auctor eget. Donec eget lacinia massa, " +
                "ultrices ultricies libero. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec sit " +
                "amet tellus maximus elit lacinia pulvinar a sit amet dolor. Sed posuere bibendum lacus et molestie. " +
                "Fusce tincidunt, odio sit amet lacinia mollis, arcu eros blandit est, eget pulvinar mauris magna " +
                "nec mauris. Aliquam ultricies semper commodo. Praesent egestas metus ut sapien bibendum posuere. " +
                "In tempus aliquam est, sed ultricies nulla aliquam eget. Aliquam sit amet egestas diam. Pellentesque " +
                "fringilla vestibulum nulla, finibus lobortis neque cursus sit amet. Proin gravida ac ante ac " +
                "tincidunt. Nulla a dignissim nisi, ac gravida orci. Ut eleifend aliquet finibus. Morbi fringilla " +
                "ipsum at imperdiet commodo. Nulla tristique dui odio, eget bibendum mauris feugiat sed. Ut eget " +
                "nisi luctus, luctus urna.";

        //Test Case 1_Test Data 1
        Post posttestCase1Data1 = new Post(1,"Sample post Title", validBodyText, "[tag1,tag2,tag3]",
                "Easy","Ordinary");
        assertTrue(posttestCase1Data1.addPost());

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
        //Test Case 2: Checking the addPost() function with invalid postName and other valid inputs
        //Defining a variable validBodyText
        String validBodyText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent imperdiet a " +
                "dolor at malesuada. Nam a elit luctus, ultricies turpis eu, facilisis velit. Maecenas tempus augue " +
                "vel tristique accumsan. Morbi dictum massa ac hendrerit efficitur. Duis dapibus, lorem at porta " +
                "venenatis, leo enim varius eros, eget laoreet mi urna a nulla. Pellentesque habitant morbi tristique " +
                "senectus et netus et malesuada fames ac turpis egestas. Maecenas sagittis egestas nisl vel convallis." +
                " Nam euismod elementum ultrices. Praesent vitae odio at felis aliquam cursus. Sed placerat eros " +
                "magna, ac vestibulum tellus scelerisque ultrices. Quisque in diam non ipsum iaculis porta quis at " +
                "lectus. Sed est nisi, condimentum ac rhoncus sit amet, viverra rutrum sapien. Nunc mi risus, " +
                "tristique ac turpis vitae, dapibus faucibus magna. Sed euismod tincidunt tortor vitae porttitor. " +
                "Cras imperdiet dolor vitae lorem posuere ultricies. In hac habitasse platea dictumst. Donec non " +
                "nulla at orci tempus tincidunt sit amet quis purus. Suspendisse potenti. Phasellus nisl lectus, " +
                "placerat eget nibh in, fermentum lobortis sem.Vivamus finibus cursus gravida. Donec vehicula eget " +
                "nulla convallis laoreet. Aenean tempus suscipit arcu ac bibendum. Nullam sed nunc in ante gravida " +
                "venenatis. Nullam sagittis nisi ante, id ultrices risus auctor eget. Donec eget lacinia massa, " +
                "ultrices ultricies libero. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec sit " +
                "amet tellus maximus elit lacinia pulvinar a sit amet dolor. Sed posuere bibendum lacus et molestie. " +
                "Fusce tincidunt, odio sit amet lacinia mollis, arcu eros blandit est, eget pulvinar mauris magna " +
                "nec mauris. Aliquam ultricies semper commodo. Praesent egestas metus ut sapien bibendum posuere. " +
                "In tempus aliquam est, sed ultricies nulla aliquam eget. Aliquam sit amet egestas diam. Pellentesque " +
                "fringilla vestibulum nulla, finibus lobortis neque cursus sit amet. Proin gravida ac ante ac " +
                "tincidunt. Nulla a dignissim nisi, ac gravida orci. Ut eleifend aliquet finibus. Morbi fringilla " +
                "ipsum at imperdiet commodo. Nulla tristique dui odio, eget bibendum mauris feugiat sed. Ut eget " +
                "nisi luctus, luctus urna.";

        //Test Case 2_Test Data 1
        //Having the title less than 10 characters
        Post posttestCase2Data1 = new Post(1, "Title", validBodyText, "[tag1,tag2,tag3]",
                "Easy", "Ordinary");
        assertTrue(posttestCase2Data1.addPost());

        //Test Case 2_Test Data 2
        //Starting the first five characters as numbers
        Post posttestCase2Data2 = new Post(2, "12345Title", validBodyText, "[tag1,tag2]",
                "Difficult", "Highly Needed");
        assertTrue(posttestCase2Data2.addPost());

        //Test Case 2_Test Data 3
        //Starting the first five characters as special characters
        Post posttestCase2Data3 = new Post(3, "!@#$% Title", validBodyText, "[tag1,tag2,tag3,tag4,tag5]",
                "Very Difficult", "Immediately Needed");
        assertTrue(posttestCase2Data3.addPost());
    }

    @Test
    void testAddPost_testcase3() {
        //Test Case 3: Checking the addPost() function with invalid postBody, postName and other valid inputs
        //Defining a variable InValidBodyText
        String InValidBodyText_1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce auctor, nibh eget " +
                "imperdiet placerat, sem enim dignissim mauris, nec iaculis ante purus quis arcu. Donec ut elit eget " +
                "dui vulputate iaculis. Etiam eu ante auctor, ornare orci id, condimentum libero. Interdum et";

        String InValidBodyText_2 = "This is too short";

        String InvalidNameText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce auctor, nibh eget " +
                "imperdiet placerat, sem enim dignissim mauris, nec iaculis ante purus quis arcu. Donec ut elit eget " +
                "dui vulputate iaculis. Etiam eu ante auctor, ornare orci id, condimentum libero. Interdum et " +
                "malesuada fames ac ante ipsum primis in faucibus. Donec auctor est ac elementum maximus. Pellentesque " +
                "lacinia mi et magna eleifend, at tempus augue molestie. Quisque pellentesque, erat eget porta " +
                "dignissim, dui ipsum gravida nisl, vel accumsan nunc ex vel massa. Sed imperdiet, leo sit amet " +
                "commodo pellentesque, ex elit scelerisque purus, sed mollis magna leo ut ligula. Quisque id neque " +
                "erat. Curabitur dictum varius tortor, at venenatis diam ornare et. Donec id urna sed mauris ultricies " +
                "eleifend. Suspendisse commodo dignissim lectus vel tristique. Aenean ornare eros lobortis mauris " +
                "tincidunt tincidunt. Donec iaculis venenatis gravida. Pellentesque dolor sem, tincidunt id urna " +
                "tempor, fringilla pharetra ipsum. Nam cursus faucibus nulla vel vulputate. Aliquam semper aliquam " +
                "risus, vitae suscipit velit mollis a. Curabitur bibendum porttitor ex eu tempor. Phasellus maximus " +
                "nunc quis sem ultrices aliquet. Nam ipsum lacus, pretium et faucibus in, posuere ac nisi. Nam eget " +
                "tristique ex. Proin nec nisi porttitor turpis laoreet pulvinar sit amet vitae mauris. Morbi dapibus " +
                "euismod euismod. Nam sed risus non erat vestibulum viverra. Mauris dictum tincidunt velit eget vulputate. " +
                "Aenean luctus purus in pellentesque luctus. Ut in quam in erat faucibus auctor. Vivamus pharetra malesuada " +
                "velit, at fermentum est bibendum vitae. Sed porta nibh arcu, id facilisis nisi tincidunt sit amet. " +
                "Suspendisse rhoncus velit et erat consequat, id dapibus ante rutrum. In nec ante id diam elementum dapibus. " +
                "Nullam ultricies lacinia libero, at fermentum nunc lobortis blandit. Sed et dui eu leo gravida eleifend. " +
                "Donec et metus laoreet, maximus dolor eget, luctus sapien. Phasellus vel lectus ultricies, mollis turpis ac, " +
                "venenatis magna. Cras. sohoie risus luctus sso e lorea nam asdo eorae";

        //Test Case 3_Test Data 1
        //Having the postBody less than 250 characters and a postName greater than 250 characters
        Post posttestCase3Data1 = new Post(1, InvalidNameText, InValidBodyText_1, "[tag1,tag2,tag3]",
                "Easy", "Ordinary");
        assertTrue(posttestCase3Data1.addPost());

        //Test Case 3_Test Data 2
        //Having the postBody less than 250 characters and the postName less than 10 characters
        Post posttestCase3Data2 = new Post(2, "Title", InValidBodyText_2, "[tag1,tag2]",
                "Difficult", "Highly Needed");
        assertTrue(posttestCase3Data2.addPost());
    }

    @Test
    void testAddPost_testcase4() {
        //Test Case 4: Checking the addPost() function with invalid postTags and other valid Inputs
        //Defining a variable validBodyText
        String validBodyText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent imperdiet a " +
                "dolor at malesuada. Nam a elit luctus, ultricies turpis eu, facilisis velit. Maecenas tempus augue " +
                "vel tristique accumsan. Morbi dictum massa ac hendrerit efficitur. Duis dapibus, lorem at porta " +
                "venenatis, leo enim varius eros, eget laoreet mi urna a nulla. Pellentesque habitant morbi tristique " +
                "senectus et netus et malesuada fames ac turpis egestas. Maecenas sagittis egestas nisl vel convallis." +
                " Nam euismod elementum ultrices. Praesent vitae odio at felis aliquam cursus. Sed placerat eros " +
                "magna, ac vestibulum tellus scelerisque ultrices. Quisque in diam non ipsum iaculis porta quis at " +
                "lectus. Sed est nisi, condimentum ac rhoncus sit amet, viverra rutrum sapien. Nunc mi risus, " +
                "tristique ac turpis vitae, dapibus faucibus magna. Sed euismod tincidunt tortor vitae porttitor. " +
                "Cras imperdiet dolor vitae lorem posuere ultricies. In hac habitasse platea dictumst. Donec non " +
                "nulla at orci tempus tincidunt sit amet quis purus. Suspendisse potenti. Phasellus nisl lectus, " +
                "placerat eget nibh in, fermentum lobortis sem.Vivamus finibus cursus gravida. Donec vehicula eget " +
                "nulla convallis laoreet. Aenean tempus suscipit arcu ac bibendum. Nullam sed nunc in ante gravida " +
                "venenatis. Nullam sagittis nisi ante, id ultrices risus auctor eget. Donec eget lacinia massa, " +
                "ultrices ultricies libero. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec sit " +
                "amet tellus maximus elit lacinia pulvinar a sit amet dolor. Sed posuere bibendum lacus et molestie. " +
                "Fusce tincidunt, odio sit amet lacinia mollis, arcu eros blandit est, eget pulvinar mauris magna " +
                "nec mauris. Aliquam ultricies semper commodo. Praesent egestas metus ut sapien bibendum posuere. " +
                "In tempus aliquam est, sed ultricies nulla aliquam eget. Aliquam sit amet egestas diam. Pellentesque " +
                "fringilla vestibulum nulla, finibus lobortis neque cursus sit amet. Proin gravida ac ante ac " +
                "tincidunt. Nulla a dignissim nisi, ac gravida orci. Ut eleifend aliquet finibus. Morbi fringilla " +
                "ipsum at imperdiet commodo. Nulla tristique dui odio, eget bibendum mauris feugiat sed. Ut eget " +
                "nisi luctus, luctus urna.";

        //Test Case 4_Test Data 1
        //Having less than 2 tags
        Post posttestCase4Data1 = new Post(1, "Sample post Title", validBodyText, "[tag1]",
                "Difficult", "Immediately Needed");
        assertTrue(posttestCase4Data1.addPost());

        //Test Case 4_Test Data 2
        //Starting the first five characters as numbers
        Post posttestCase4Data2 = new Post(2, "Another post Title", validBodyText, "[tag1,tag2,tag3,tag4,tag5,tag6v]",
                "Difficult", "Highly Needed");
        assertTrue(posttestCase4Data2.addPost());
    }

    @Test
    void testAddPost_testcase5() {
        //Test Case 5: Checking the addPost() function with invalid postType conditions
        //Defining a variable validBodyText
        String validBodyText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent imperdiet a " +
                "dolor at malesuada. Nam a elit luctus, ultricies turpis eu, facilisis velit. Maecenas tempus augue " +
                "vel tristique accumsan. Morbi dictum massa ac hendrerit efficitur. Duis dapibus, lorem at porta " +
                "venenatis, leo enim varius eros, eget laoreet mi urna a nulla. Pellentesque habitant morbi tristique " +
                "senectus et netus et malesuada fames ac turpis egestas. Maecenas sagittis egestas nisl vel convallis." +
                " Nam euismod elementum ultrices. Praesent vitae odio at felis aliquam cursus. Sed placerat eros " +
                "magna, ac vestibulum tellus scelerisque ultrices. Quisque in diam non ipsum iaculis porta quis at " +
                "lectus. Sed est nisi, condimentum ac rhoncus sit amet, viverra rutrum sapien. Nunc mi risus, " +
                "tristique ac turpis vitae, dapibus faucibus magna. Sed euismod tincidunt tortor vitae porttitor. " +
                "Cras imperdiet dolor vitae lorem posuere ultricies. In hac habitasse platea dictumst. Donec non " +
                "nulla at orci tempus tincidunt sit amet quis purus. Suspendisse potenti. Phasellus nisl lectus, " +
                "placerat eget nibh in, fermentum lobortis sem.Vivamus finibus cursus gravida. Donec vehicula eget " +
                "nulla convallis laoreet. Aenean tempus suscipit arcu ac bibendum. Nullam sed nunc in ante gravida " +
                "venenatis. Nullam sagittis nisi ante, id ultrices risus auctor eget. Donec eget lacinia massa, " +
                "ultrices ultricies libero. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec sit " +
                "amet tellus maximus elit lacinia pulvinar a sit amet dolor. Sed posuere bibendum lacus et molestie. " +
                "Fusce tincidunt, odio sit amet lacinia mollis, arcu eros blandit est, eget pulvinar mauris magna " +
                "nec mauris. Aliquam ultricies semper commodo. Praesent egestas metus ut sapien bibendum posuere. " +
                "In tempus aliquam est, sed ultricies nulla aliquam eget. Aliquam sit amet egestas diam. Pellentesque " +
                "fringilla vestibulum nulla, finibus lobortis neque cursus sit amet. Proin gravida ac ante ac " +
                "tincidunt. Nulla a dignissim nisi, ac gravida orci. Ut eleifend aliquet finibus. Morbi fringilla " +
                "ipsum at imperdiet commodo. Nulla tristique dui odio, eget bibendum mauris feugiat sed. Ut eget " +
                "nisi luctus, luctus urna.";

        String bodyTextLessThan300 = "This body text is less than 300 characters";

        //Test Case 5_Test Data 1
        //Having the more than 3 tags for the postType "Easy"
        Post posttestCase5Data1 = new Post(1, "Sample body Title", validBodyText, "[tag1,tag2,tag3,tag4]",
                "Easy", "Ordinary");
        assertTrue(posttestCase5Data1.addPost());

        //Test Case 5_Test Data 2
        //Having the postBody less than 300 characters and postType as "Very Difficult"
        Post posttestCase5Data2 = new Post(2, "Another post Title", bodyTextLessThan300, "[tag1,tag2]",
                "Very Difficult", "Highly Needed");
        assertTrue(posttestCase5Data2.addPost());

        //Test Case 5_Test Data 3
        //Having the postBody less than 300 characters and postType as "Difficult"
        Post posttestCase5Data3 = new Post(3, "Third post Title", bodyTextLessThan300, "[tag1,tag2,tag3]",
                "Difficult", "Highly Needed");
        assertTrue(posttestCase5Data3.addPost());
    }

    @Test
    void testAddPost_testcase6() {
        //Test Case 6: Checking the addPost() function with invalid postEmergency conditions
        //Defining a variable validBodyText
        String validBodyText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent imperdiet a " +
                "dolor at malesuada. Nam a elit luctus, ultricies turpis eu, facilisis velit. Maecenas tempus augue " +
                "vel tristique accumsan. Morbi dictum massa ac hendrerit efficitur. Duis dapibus, lorem at porta " +
                "venenatis, leo enim varius eros, eget laoreet mi urna a nulla. Pellentesque habitant morbi tristique " +
                "senectus et netus et malesuada fames ac turpis egestas. Maecenas sagittis egestas nisl vel convallis." +
                " Nam euismod elementum ultrices. Praesent vitae odio at felis aliquam cursus. Sed placerat eros " +
                "magna, ac vestibulum tellus scelerisque ultrices. Quisque in diam non ipsum iaculis porta quis at " +
                "lectus. Sed est nisi, condimentum ac rhoncus sit amet, viverra rutrum sapien. Nunc mi risus, " +
                "tristique ac turpis vitae, dapibus faucibus magna. Sed euismod tincidunt tortor vitae porttitor. " +
                "Cras imperdiet dolor vitae lorem posuere ultricies. In hac habitasse platea dictumst. Donec non " +
                "nulla at orci tempus tincidunt sit amet quis purus. Suspendisse potenti. Phasellus nisl lectus, " +
                "placerat eget nibh in, fermentum lobortis sem.Vivamus finibus cursus gravida. Donec vehicula eget " +
                "nulla convallis laoreet. Aenean tempus suscipit arcu ac bibendum. Nullam sed nunc in ante gravida " +
                "venenatis. Nullam sagittis nisi ante, id ultrices risus auctor eget. Donec eget lacinia massa, " +
                "ultrices ultricies libero. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec sit " +
                "amet tellus maximus elit lacinia pulvinar a sit amet dolor. Sed posuere bibendum lacus et molestie. " +
                "Fusce tincidunt, odio sit amet lacinia mollis, arcu eros blandit est, eget pulvinar mauris magna " +
                "nec mauris. Aliquam ultricies semper commodo. Praesent egestas metus ut sapien bibendum posuere. " +
                "In tempus aliquam est, sed ultricies nulla aliquam eget. Aliquam sit amet egestas diam. Pellentesque " +
                "fringilla vestibulum nulla, finibus lobortis neque cursus sit amet. Proin gravida ac ante ac " +
                "tincidunt. Nulla a dignissim nisi, ac gravida orci. Ut eleifend aliquet finibus. Morbi fringilla " +
                "ipsum at imperdiet commodo. Nulla tristique dui odio, eget bibendum mauris feugiat sed. Ut eget " +
                "nisi luctus, luctus urna.";

        //Test Case 6_Test Data 1
        //Having the title less than 10 characters
        Post posttestCase6Data1 = new Post(1, "Sample body Title", validBodyText, "[tag1,tag2,tag3]",
                "Easy", "Highly Needed");
        assertTrue(posttestCase6Data1.addPost());

        //Test Case 6_Test Data 2
        //Starting the first five characters as numbers
        Post posttestCase6Data2 = new Post(2, "Another body Title", validBodyText, "[tag1,tag2]",
                "Difficult", "Ordinary");
        assertTrue(posttestCase6Data2.addPost());
    }
}
