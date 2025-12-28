public class User {
    private String username;
    private String bio = "No bio yet";

    public User(String username) {
        this.username= username;
    }

    public String getUsername(){
        return username;
    }
    public String getBio(){
        return bio;
    }
    public void setBio(String bio){
        if (bio != null && !bio.isEmpty()) this.bio = bio;
    }

    public String getRole(){
        return "no Role";
    }
    public void printProfile(){
        System.out.println("User: " + username + ", Bio: " + bio);
    }
    @Override
    public String toString(){
        return getRole() + ": " + username;
    }
    @Override
    public boolean equals(Object obj){
    if (this == obj) return true;
    if (!(obj instanceof User)) return false;
    User user = (User) obj;
    return username.equals(user.username);
    }

    @Override
    public int hashCode(){
        return username.hashCode();
    }


}
