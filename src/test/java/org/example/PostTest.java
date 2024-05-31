package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PostTest {

    @Test
    void testaddPost_testcase1() {
        Post posttestcase = new Post(1,"Sample post Title", "Lorem ipsum dolor " +
                "sit amet, consectetur adipiscing elit. Fusce auctor, nibh eget imperdiet placerat, sem " +
                "enim dignissim mauris, nec iaculis ante purus quis arcu. Donec ut elit eget dui vulputate " +
                "iaculis. Etiam eu ante auctor, ornare orci id, condimentum libero. Interdum et malesuada " +
                "fames ac ante ipsum primis in faucibus. Donec auctor est ac elementum maximus. Pellentesque " +
                "lacinia mi et magna eleifend, at tempus augue molestie. Quisque pellentesque, erat eget porta " +
                "dignissim, dui ipsum gravida nisl, vel accumsan nunc ex vel massa. Sed imperdiet, leo sit amet " +
                "commodo pellentesque, ex elit scelerisque purus, sed mollis magna leo ut ligula. Quisque id neque " +
                "erat. Curabitur dictum varius tortor, at venenatis diam ornare et. Donec id urna sed mauris " +
                "ultricies eleifend. Suspendisse commodo dignissim lectus vel tristique. Aenean ornare eros lobortis " +
                "mauris tincidunt tincidunt. Donec iaculis venenatis gravida. Pellentesque dolor sem, tincidunt id " +
                "urna tempor, fringilla pharetra ipsum. Nam cursus faucibus nulla vel vulputate. Aliquam semper " +
                "aliquam risus, vitae suscipit velit mollis a. Curabitur bibendum porttitor ex eu tempor. Phasellus " +
                "maximus nunc quis sem ultrices aliquet. Nam ipsum lacus, pretium et faucibus in, posuere ac nisi. " +
                "Nam eget tristique ex. Proin nec nisi porttitor turpis laoreet pulvinar sit amet vitae mauris. Morbi" +
                "dapibus euismod euismod. Nam sed risus non erat vestibulum viverra. Mauris dictum tincidunt velit " +
                "eget vulputate. Aenean luctus purus in pellentesque luctus. Ut in quam in erat faucibus auctor. " +
                "Vivamus pharetra malesuada velit, at fermentum est bibendum vitae. Sed porta nibh arcu, id facilisis " +
                "nisi tincidunt sit amet. Suspendisse rhoncus velit et erat consequat, id dapibus ante rutrum. In nec " +
                "ante id diam elementum dapibus. Nullam ultricies lacinia libero, at fermentum nunc lobortis blandit. " +
                "Sed et dui eu leo gravida eleifend. Donec et metus laoreet, maximus dolor eget, luctus sapien. " +
                "Phasellus vel lectus ultricies, mollis turpis ac, venenatis magna. Cras.", "[tag1,tag2,tag3]",
                "Easy","Ordinary");

            assertTrue(posttestcase.addPost());
    }
}
