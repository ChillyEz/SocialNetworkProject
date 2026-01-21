import com.sun.source.tree.TryTree;

import java.util.ArrayList;
import java.sql.*;

public class Main{
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql://localhost:5432/socialnetwork";
        String username = "postgres";
        String password = "0000";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            CRUD crud = new CRUD(conn);

            crud.addUser(new Profile("alex", 20));

            User alex = crud.readUser("alex");
            System.out.println("USER: " + alex.getUsername() + "/" + alex.getBio());

            crud.updateUserBio("alex", "NEW bio!");

            crud.deleteUser("alex");

        } catch (Exception e) {
            e.printStackTrace();
        }



        SocialNetwork network = new SocialNetwork("MySocial");
        network.welcome();
        System.out.println();


        Profile user1= new Profile("Alex",17);
        Profile user2 = new Profile("Amir",21);
        Profile user3 = new Profile("Arman",19);
        Profile user4 = new Profile("Zhangeldin", 22);
        Admin admin = new Admin("SuperAdmin");

        user2.setBio("Student of AITU");
        user3.setBio("Java developer");
        admin.setBio("SuperAdmin");


        network.addUser(user1);
        network.addUser(user2);
        network.addUser(user3);
        network.addUser(user4);
        network.addUser(admin);
///
        System.out.println("===Фильтр По возрасту===");
        ArrayList<Profile> adults = network.filterByAge(20);
        for(Profile p : adults) {
            System.out.println( "Username: " + p.getUsername() + " age: " + p.getAge());
        }
        System.out.println();

        network.showUser();
    }
}