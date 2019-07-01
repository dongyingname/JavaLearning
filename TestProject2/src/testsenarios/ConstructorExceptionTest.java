/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsenarios;

import java.io.*;


/**
 *
 * @author yingd
 */
public class ConstructorExceptionTest {

}

class PortConnector {

    public PortConnector(int port) throws IOException {
    }
    
    void method1() throws Exception{
        
    }
}

class CleanConnector extends PortConnector {

    public CleanConnector(int port) throws  Exception {
        super(port);
    }
    @Override
    void method1() throws ArithmeticException{
        
    }
}
