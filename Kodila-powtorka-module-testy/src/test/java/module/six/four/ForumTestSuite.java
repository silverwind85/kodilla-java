package module.six.four;

import org.junit.Assert;
import org.junit.Test;

public class ForumTestSuite {
    @Test
    public void testAddPost() {
        //Given

        ForumUser forumUser = new ForumUser("John", "Ali Bali");
        //When
        forumUser.addPost("Mike", "Hello");
        forumUser.getPost(1).getAuthor();
        //Then
        Assert.assertEquals(1, forumUser.getPostQuantity());
        Assert.assertEquals("Mike", forumUser.getPost(1).getAuthor());
    }

    @Test
    public void testAddComment() {
        //Given
        ForumUser forumUser = new ForumUser("John", "Ali Bali");
        Post post = new Post("Hello", "Mike");
        //When
        forumUser.addComment(post,"Hello","Mike");
        //Then
        Assert.assertEquals(1,forumUser.getCommentQuantity());
        Assert.assertEquals("Mike",forumUser.getComment(1).getAuthor());

    }

    @Test
    public void testGetPostQuantity(){
        //Given
        ForumUser forumUser = new ForumUser("John", "Ali Bali");
        forumUser.addPost("Mike", "Hello");
        //When
        int result = forumUser.getPostQuantity();
        //Then
        Assert.assertEquals(1,result);



    }
    @Test
    public void testGetCommentQuantity(){
        //Given
        ForumUser forumUser = new ForumUser("John", "Ali Bali");
        Post post = new Post("Hello", "Mike");
        forumUser.addComment(post,"Mike", "Hello");
        //When
        int result = forumUser.getPostQuantity();
        //Then
        Assert.assertEquals(1,result);

    }
    @Test
    public void testGetPost(){
        //Given
        ForumUser forumUser = new ForumUser("John", "Ali Bali");
        Post post = new Post("Mike", "Hello");
        forumUser.addPost(post.getAuthor(),post.getPostBody());
        //When
        Post retrievedPost = forumUser.getPost(0);
        //Then
        Assert.assertEquals(1,forumUser.getPostQuantity());

    }
    @Test
    public void testGetComment(){

    }
}

