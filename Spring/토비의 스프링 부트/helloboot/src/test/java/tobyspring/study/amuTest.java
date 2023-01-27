package tobyspring.study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class amuTest {

    @Test
    @DisplayName("contents")
    void name() {
        StringBuilder stringBuilder = new StringBuilder();
        Member arthur = new Member("arthur", 30);
        String s = stringBuilder.append(arthur.name)
                .append("\t")
                .append(arthur.age)
                .toString();
        System.out.println("s = " + s);
    }

    class Member {

        private final String name;
        private final int age;

        public Member(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
