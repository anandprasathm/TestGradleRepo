package junitTest;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FirstTest extends BaseClass{

    @Test
    public void printConnectionString() throws IOException {
        FileInputStream fis = new FileInputStream("src/test/java/test.properties");
        Properties prop = new Properties();
        prop.load(fis);
        System.out.println(connectionString);
        System.out.println(prop.getProperty("url"));
    }
}
