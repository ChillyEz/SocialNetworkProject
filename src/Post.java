public class Post {
    private String content ;
    private int likes;

    public Post(String content){
        this.content = content ;
    }
    public String getContent() {
        return content;
    }
    public int getLikes(){
        return likes;
    }
    public void Like(){
        likes++;
    }
    public void printPost(){
        System.out.println("Post: " + content + " | likes: " + likes);
    }
}
