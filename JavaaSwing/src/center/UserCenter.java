package center;

import UserModel.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyễn Xuân Thành
 */
public class UserCenter {

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<User>();
        Connection connect = JDBCConnection.getJDBConnection();
        String sql = "SELECT * FROM USERR";

        try {
            PreparedStatement preparedStatement = connect.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                User user = new User();

                user.setId(rs.getInt("ID"));
                user.setName(rs.getString("NAME"));
                user.setPhone(rs.getString("PHONE"));
                user.setUsername(rs.getString("USERNAME"));
                user.setPassword(rs.getString("PASSWORD"));
                user.setAbout(rs.getString("ABOUT"));
                user.setFavorite(rs.getString("FAVORITE"));
                user.setRole(rs.getString("ROLE"));

                users.add(user);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return users;
    }

    public User getUserById(int id) {

        Connection connect = JDBCConnection.getJDBConnection();
        String sql = "SELECT * FROM USERR WHERE ID = ? ";

        try {
            PreparedStatement preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                User user = new User();

                user.setId(rs.getInt("ID"));
                user.setName(rs.getString("NAME"));
                user.setPhone(rs.getString("PHONE"));
                user.setUsername(rs.getString("USERNAME"));
                user.setPassword(rs.getString("PASSWORD"));
                user.setAbout(rs.getString("ABOUT"));
                user.setFavorite(rs.getString("FAVORITE"));
                user.setRole(rs.getString("ROLE"));

                return user;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public void addUser(User user) {
        Connection connect = JDBCConnection.getJDBConnection();
        String sql = "Insert into Userr(name,phone,username,password,about,favorite,role)values(?,?,?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = connect.prepareStatement(sql);

            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getPhone());
            preparedStatement.setString(3, user.getUsername());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.setString(5, user.getAbout());
            preparedStatement.setString(6, user.getFavorite());
            preparedStatement.setString(7, user.getRole());

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void UpdateUser(User user) {
        Connection connect = JDBCConnection.getJDBConnection();
        String sql = "UPDATE USERR SET NAME = ?, PHONE = ?, USERNAME = ?, PASSWORD = ?, ABOUT = ?," + "FAVORITE = ?, ROLE = ? WHERE ID = ?";

        try {
            PreparedStatement preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getPhone());
            preparedStatement.setString(3, user.getUsername());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.setString(5, user.getAbout());
            preparedStatement.setString(6, user.getFavorite());
            preparedStatement.setString(7, user.getRole());
            preparedStatement.setInt(8, user.getId());

            int rs = preparedStatement.executeUpdate();

            System.out.println(rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deleteUser(int id) {
        Connection connect = JDBCConnection.getJDBConnection();
        String sql = "delete from userr where id = ?";

        try {
            PreparedStatement preparedStatement = connect.prepareStatement(sql);

            preparedStatement.setInt(1, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
