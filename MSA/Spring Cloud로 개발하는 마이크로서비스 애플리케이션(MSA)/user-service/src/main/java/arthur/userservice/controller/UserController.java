package arthur.userservice.controller;

import arthur.userservice.controller.dto.UserDto;
import arthur.userservice.service.UserService;
import arthur.userservice.vo.Greeting;
import arthur.userservice.vo.RequestUser;
import arthur.userservice.vo.ResponseUser;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class UserController {

    private final Environment env;
    private final Greeting greeting;
    private final UserService userService;

    @GetMapping("health_check")
    public String status() {
        return "It's working in User Service";
    }

    @GetMapping("welcome")
    public String welcome() {
        return greeting.getMessage();
    }

    @PostMapping("users")
    public ResponseEntity createUser(@RequestBody RequestUser requestUser) {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        UserDto dto = mapper.map(requestUser, UserDto.class);
        UserDto createdUser = userService.createUser(dto);

        ResponseUser responseUser = mapper.map(createdUser, ResponseUser.class);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(responseUser);
    }
}
