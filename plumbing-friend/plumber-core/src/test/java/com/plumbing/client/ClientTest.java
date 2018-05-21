package com.plumbing.client;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ClientTest {
    @Before
    @After
    public void printIt() {
        System.out.println("Hello");
    }


    @Test()
    public void TestEmptyEmail() {
        Client client = new Client();
        client.setClientEmail("");
    }

}
