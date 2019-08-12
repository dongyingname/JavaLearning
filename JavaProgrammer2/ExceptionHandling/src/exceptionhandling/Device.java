/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.io.IOException;

/**
 *
 * @author yingd
 */
public class Device implements AutoCloseable{

    String header = null;

    public void open() throws IOException {
        header = "OPENED";
        System.out.println("Device Opened");
        throw new IOException("Unknown");
    }

    public String read() throws IOException {
        return "";
    }

    @Override
    public void close() {
        System.out.println("Closing device");
        header = null;
        throw new RuntimeException("rte");
    }

    public static void main(String[] args) throws Exception {
        try (Device d = new Device()) {
            throw new Exception("test");
        }
    }

}
