/*
File
能否   讀   or   取 
    canRead   canWrite
*/
import java.io.*;

public class TestIO1{
    public static void main(String args[]){
        File file = new File("C:\\JavaSpace\\Test.txt");
        System.out.println("Read:"+ file.canRead());
        System.out.println("Write:"+ file.canWrite());    //可能唯讀
        System.out.println("Length:"+ file.length());
    }
}
