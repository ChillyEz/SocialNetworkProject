public class Main{
    public static void main(String[] args) {

        SocialNetwork network = new SocialNetwork("MySocial");
        network.welcome();

        Profile user1= new Profile("Alex",18);
        Profile user2 = new Profile("Amir",20);

        Post post1 = new Post("Hello world!");
        Post post2 = new Post("Me first post");

        post1.Like();
        post2.Like();
        post1.Like();

        if(post1.getLikes() > post2.getLikes()) {
            System.out.println("Post: " + post1.getContent() + "Has more likes than post: " + post2.getContent());
        }
    }
}