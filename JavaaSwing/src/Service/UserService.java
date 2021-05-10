package Service;

import UserModel.User;
import center.UserCenter;
import java.util.List;

/**
 *
 * @author Nguyễn Xuân Thành
 */
public class UserService {

    private UserCenter userCenter;

    public UserService() {
        userCenter = new UserCenter();
    }

    public List<User> getAllUsers() {
        return userCenter.getAllUsers();
    }

    public void addUser(User user) {
        userCenter.addUser(user);
    }
    public void deleteUser(int id){
        userCenter.deleteUser(id);
    }
    public User getUserById(int id){
        return userCenter.getUserById(id);
    }
    public void UpdateUser(User user){
        userCenter.UpdateUser(user);
    }
}
