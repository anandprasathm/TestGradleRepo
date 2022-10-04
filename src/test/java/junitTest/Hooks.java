package junitTest;

import org.junit.jupiter.api.BeforeAll;

public class Hooks extends BaseClass {

    @BeforeAll
    public void AddConnectionString()
    {
        connectionString = "Success!";
    }
}
