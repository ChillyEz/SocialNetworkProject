public class Profile {
    private String username;
    private int age;

    public Profile(String username, int age) {
        this.username= username;
        this.age = age;
    }

    public String getUsername(){
        return username;
    }
    public int getAge() {
        return age;
    }
    public void printProfile(){
        System.out.println("User: " + username + ", Age:" + age);
    }



}
