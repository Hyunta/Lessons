package tobyspring.helloboot;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@HelloBootTest
class DataSourceTest {

    @Autowired
    DataSource dataSource;

    @Test
    @DisplayName("contents")
    void connect() throws SQLException {
        Connection connection = dataSource.getConnection();
        connection.close();
    }
}
