package hello.springmvc.basic;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class HelloData {
    private String userName;
    private int age;

    public HelloData(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }
}
