import java.util.ArrayList;

public class Profile extends User{
    private ArrayList<Post> posts;
    private int age;

    public Profile(String username, int age) {
        super(username);
        this.age = age;
        posts = new ArrayList<>();
    }

    public int getAge(){ return age; }
    public void setAge(int age){
        if (age > 0 && age < 150) this.age = age;
    }

    public void addPost(Post post){
        posts.add(post);
    }

    public void showPosts(){
        for(Post p : posts){
            p.printPost();
        }
    }

    @Override
    public String toString(){
        return "User: " + getUsername() + ", age=" + age + ", bio=" + getBio();
    }

    @Override
    public String getRole(){ return "User";}

    @Override
    public void printProfile(){
        System.out.println("User: " + getUsername() + ", Age: " + age +  ", Bio :" + getBio());
    }

    @Override
    public int hashCode(){
        return posts.hashCode();
    }

}
