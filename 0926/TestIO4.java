/*
Reader Writer            -> 文字優 io4
InputStream OutputStram  -> 可圖片 io3
*/

import java.io.*;                                                                    //預設都會叫的是 import java.lang*;

public class TestIO4{
    public static void main(String args[])throws Exception{                          // throws 丟出例外，不是好方法
        FileReader fr = new FileReader("C:\\JavaSpace\\googlelogo.png");             // 讀入("")的檔案，會是文字的編碼
        FileWriter fw = new FileWriter("C:\\JavaSpace\\googlelogofw.png");           // 轉出的檔案位址
        
        int ch = -1;
        while ( ( ch = fr.read()) != -1) {                                           // 編碼沒有負的，所以有內容就一定是正的
            System.out.print((char)ch);                                              // 讀出的是文字的編碼，所以再加(char)轉回文字
            fw.write(ch);                                                            // 轉出。
        } 
        
        fr.close();                                                                  // 記得關兩位
        fw.close();                                                                  // 有開有關，再開不難       
    }
}