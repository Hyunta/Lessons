package arthur.userservice.service;

import arthur.userservice.controller.dto.UserDto;

public interface UserService {

    UserDto createUser(UserDto userDto);

}
