package arthur.userservice.vo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Greeting {

    private final String message;

    public Greeting(@Value("${greeting.message}") String message) {
        this.message = message;
    }
}
