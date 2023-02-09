package arthur.userservice.controller.dto;

import java.util.Date;
import lombok.Data;

@Data
public class UserDto {

    private String email;
    private String name;
    private String password;
    private String userId;
    private Date createdAt;

    private String encryptedPassword;
}
