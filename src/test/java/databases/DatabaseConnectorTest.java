package databases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class DatabaseConnectorTest {
    @Test
    void getConnection() {
        DatabaseConnector dbConnect = new DatabaseConnector();
        assertNotNull(dbConnect.getConnection());
    }
}