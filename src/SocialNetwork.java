import java.util.ArrayList;

public class SocialNetwork {
    private String name;
    private ArrayList<Profile> users;

    public SocialNetwork(String name){
        this.name = name;
        users = new ArrayList<>();
    }
    public void welcome(){
        System.out.println("Welcome to " + name);
    }

    public void addUser(Profile profile){
        users.add(profile);
    }

    public void showUser(){
        System.out.println("User in " + name + ":");
        for (Profile profile : users){
            profile.printProfile();
        }
    }
}
