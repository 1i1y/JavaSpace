/*
Reader Writer            -> 文字優 io4
InputStream OutputStram  -> 可圖片 io3
*/

import java.io.*;                                                                    //預設都會叫的是 import java.lang*;

public class TestIO3{
    public static void main(String args[])throws Exception{                          // throws 丟出例外
        FileInputStream  fis = new FileInputStream("C:\\JavaSpace\\googlelogo.png");       // 讀入("")的檔案，會是文字的編碼，大量用buffer
        FileOutputStream fos = new FileOutputStream("C:\\JavaSpace\\googlelogofos.png");   // 轉出的檔案位址
        
        int ch = -1;
        while ( ( ch = fis.read()) != -1) {                                          // 編碼沒有負的，所以有內容就一定是正的
            System.out.print((char)ch);                                              // 讀出的是文字的編碼，所以再加(char)轉回文字
            fos.write(ch);                                                           // 轉出。不管是 Intput 或是 Output 都是要求 Int
        }
        
        fis.close();                                                                 // 記得關兩位
        fos.close();                                                                 // 有開有關，再開不難       
    }
}