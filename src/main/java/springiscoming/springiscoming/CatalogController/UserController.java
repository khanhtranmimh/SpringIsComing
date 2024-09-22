package springiscoming.springiscoming.CatalogController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import springiscoming.springiscoming.CatalogEntity.UserEntity;
import springiscoming.springiscoming.Dtos.UserRequestDto;
import springiscoming.springiscoming.Service.UserService;

import java.util.List;

@RestController
@RequestMapping("/api/users")
class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public UserEntity createUser(@RequestBody UserRequestDto user) {
        var userEntity = new UserEntity();
        userEntity.email = user.email;
        userEntity.homeTown = user.homeTown;
        userEntity.yearOfBirth = user.yearOfBirth;
        userEntity.name = user.name;

        return userService.createUser(userEntity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody()
    public void delete(@PathVariable("id") Long id) {
        userService.deleteUserById(id);
    }
}
