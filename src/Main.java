public class Main{
    public static void main(String[] args) {

        SocialNetwork network = new SocialNetwork("MySocial");
        network.welcome();

        Profile user1= new Profile("Alex",21git);
        Profile user2 = new Profile("Amir",20);

        user2.setBio("Student of AITU");

        network.addUser(user1);
        network.addUser(user2);


        ///
        network.showUser();
    }
}