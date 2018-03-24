
import java.io.*;  
import java.net.*;  
public class MyClient {  
public static void main(String args[])throws Exception{  
    Socket s=new Socket("localhost",3333);  
    DataInputStream din=new DataInputStream(s.getInputStream()); 
