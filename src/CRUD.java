import java.sql.*;


public class CRUD {
    private final Connection conn;

    public CRUD(Connection conn) {
        this.conn = conn;
    }

    public void addUser(Profile profile) throws SQLException {
        String sql = "INSERT INTO users (username, bio, role, age) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, profile.getUsername());
            ps.setString(2, profile.getBio());
            ps.setString(3,"PROFILE");
            ps.setInt(4, profile.getAge());
            ps.executeUpdate();
        }
    }

    public void AddUser(Admin admin) throws SQLException {
        String sql = "INSERT INTO users (username, bio, role, age) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, admin.getUsername());
            ps.setString(2, admin.getBio());
            ps.setString(3, "ADMIN");
            ps.setNull(4, Types.INTEGER);
            ps.executeUpdate();
        }
    }



    public User readUser(String username) throws SQLException{
        String sql = "SELECT * FROM users WHERE username = ?";
        try(PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1,username);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new User(rs.getString("username"));

                }
            }
        }
        return null;
    }

    public void updateUserBio(String username, String bio) throws SQLException{
        String sql = "UPDATE users SET bio = ? WHERE username = ?";
        try(PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, bio);
            ps.setString(2, username);
            ps.executeUpdate();
        }
    }


    public void deleteUser(String username) throws SQLException{
        String sql = "DELETE FROM users WHERE username = ?";
        try(PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, username);
            ps.executeUpdate();
        }
    }
}
