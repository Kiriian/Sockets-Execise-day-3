package Exercise3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author sofus
 */
public class EchoClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost",4321);
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        out.println("UPPER#Hello world");
        System.out.println(in.readLine());
    }
    
}
