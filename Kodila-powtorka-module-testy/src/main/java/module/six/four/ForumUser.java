package module.six.four;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ForumUser {
    private String name;
    private String realName;
    private List<Post> postList = new ArrayList<>();
    private List<Comment> commentList = new LinkedList<>();

    public ForumUser(String name, String realName) {
        this.name = name;
        this.realName = realName;
    }
    public void addPost(String author, String postBody){


    }
    public void addComment(Post post,String author, String commentBody){

    }
    public int getPostQuantity(){
        return 0;
    }
    public int getCommentQuantity(){
        return 0;
    }
    public Post getPost(int postNumber){
        return null;
    }

    public Comment getComment(int commentNumber) {
        return null;
    }


    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }
}
