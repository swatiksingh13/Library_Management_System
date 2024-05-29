package in.swatiksingh.library_service_290524.services;

import in.swatiksingh.library_service_290524.models.User;
import in.swatiksingh.library_service_290524.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
    public User save(User user) {
        return userRepository.save(user);
    }

}
