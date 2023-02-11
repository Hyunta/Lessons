package arthur.userservice.controller.dto;

import arthur.userservice.vo.ResponseOrder;
import java.util.Date;
import java.util.List;
import lombok.Data;

@Data
public class UserDto {

    private String email;
    private String name;
    private String password;
    private String userId;
    private Date createdAt;

    private String encryptedPassword;

    private List<ResponseOrder> orders;
}
