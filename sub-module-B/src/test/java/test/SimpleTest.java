package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class SimpleTest {

    @Test
    public void test() throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream("src/test/resources/hello.txt")) {
            Assertions.assertNotNull(fileInputStream);
        }
    }
}
