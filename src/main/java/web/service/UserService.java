package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.List;

@Service
public interface UserService {
    User getUser(long id);
    List<User> getAll();
    void editUser(User user);
    void saveUser(User user);
    void removeUser(long id);
}