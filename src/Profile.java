public class Profile {
    private String username;
    private int age;
    private String bio = "No bio yet";

    public Profile(String username, int age) {
        this.username= username;
        if (age >= 18 && age <150) {
            this.age = age;
        }else {
            this.age = 0;
            System.out.println("Failure: Your age is out of range");
        }
    }

    public String getUsername(){
        return username;
    }
    public int getAge() {
        return age;
    }
    public String getBio(){
        return bio;
    }
    public void setBio(String bio){
        if (bio != null && !bio.isEmpty()) {
            this.bio = bio;
        }
    }
    public void printProfile(){
        System.out.println("User: " + username + ", Age: " + age + ", Bio: " + bio);
    }
}
