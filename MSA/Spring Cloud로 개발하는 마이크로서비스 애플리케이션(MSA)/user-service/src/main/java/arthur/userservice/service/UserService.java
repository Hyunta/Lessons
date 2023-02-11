package arthur.userservice.service;

import arthur.userservice.controller.dto.UserDto;
import arthur.userservice.jpa.UserEntity;

public interface UserService {

    UserDto createUser(UserDto userDto);

    UserDto getUserByUserId(String userId);

    Iterable<UserEntity> getUserByAll();
}
