package module.six.four;

public class Comment {
    private Post post ;
    private String  commentBody;
    private String author;

    public Comment(Post post, String commentBody, String author) {
        this.post = post;
        this.commentBody = commentBody;
        this.author = author;
    }

    public Post getPost() {
        return post;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comment comment = (Comment) o;

        if (post != null ? !post.equals(comment.post) : comment.post != null) return false;
        if (commentBody != null ? !commentBody.equals(comment.commentBody) : comment.commentBody != null) return false;
        return author != null ? author.equals(comment.author) : comment.author == null;
    }

    @Override
    public int hashCode() {
        int result = post != null ? post.hashCode() : 0;
        result = 31 * result + (commentBody != null ? commentBody.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }
}
