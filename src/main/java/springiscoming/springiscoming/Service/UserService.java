package springiscoming.springiscoming.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springiscoming.springiscoming.CatalogEntity.UserEntity;
import springiscoming.springiscoming.Repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }

    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }
}
