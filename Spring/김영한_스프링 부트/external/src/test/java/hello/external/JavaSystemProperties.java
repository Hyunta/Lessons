package hello.external;

import java.util.Properties;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JavaSystemProperties {

    public static void main(String[] args) {

        System.setProperty("hello_key", "hello_value");
        String value = System.getProperty("hello_key");
        log.info("hello_key = {}", value);

        Properties properties = System.getProperties();
        for (Object key : properties.keySet()) {
            log.info("prop {}={}", key, System.getProperty(key.toString()));
        }

        String url = System.getProperty("url");
        String password = System.getProperty("password");
        String username = System.getProperty("username");

        log.info("url={}", url);
        log.info("password={}", password);
        log.info("username={}", username);
    }
}
