import java.util.ArrayList;

public class SocialNetwork {
    private String name;
    private ArrayList<User> users;

    public SocialNetwork(String name) {
        this.name = name;
        users = new ArrayList<>();
    }

    public void welcome() {
        System.out.println("Welcome to " + name);
    }

    public void addUser(User user) {
        if (!users.contains(user)) users.add(user);
    }

    public void showUser() {
        System.out.println("User in " + name + ":");
        for (User user : users) {
            System.out.println(user.getUsername() +  " (" + user.getRole() + ")");
        }
    }

    public User findUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public ArrayList<Profile> filterByAge(int minAge){
        ArrayList<Profile> result = new ArrayList<>();

        for(User user : users) {
            if (user instanceof Profile) {
                Profile profile = (Profile) user;
                if(profile.getAge() >= minAge){
                    result.add(profile);
                }
            }
        }
        return result;
    }
}
