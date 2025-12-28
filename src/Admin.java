public class Admin extends User{

    public Admin(String username){
        super(username);
    }

    public void banUser(Profile profile){
        System.out.println("Admin "+ getUsername() + " banned user " + profile.getUsername());
    }
    public void deletePost(Profile profile, Post p){
        /// profile.getPosts().remove(p);

        System.out.println("Admin "+ getUsername() + " deleted a post from " + profile.getUsername());
    }

    @Override
    public String getRole(){
        return "Admin";
    }

    @Override
    public void printProfile() {
        System.out.println("Admin: " + getUsername() + ", Bio: " + getBio());
    }

}
