/*
BufferedReader 就像串串燒一般，一行一行的讀
BufferedWriter                 一行一行的寫
*/

import java.io.*;

public class TestIO5{
    public static void main (String args[]) throws Exception {   //忘了 throws 會沒辦法跑!!
    //串串燒
    //FileReader fr = new FileReader("C:\\JavaSpace\\Test.txt");
    BufferedReader br = new BufferedReader(new FileReader("C:\\JavaSpace\\0926\\Test.txt"));      //讀檔
    BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\JavaSpace\\0926\\Test_bk.txt"));   //存檔
    
    String ln = null;
    while((ln = br.readLine()) != null){                         //沒有的時侯是null(預設)
        System.out.println(ln);                                  //所以有內容就能印
        //System.out.println();
        //bw.write(ln,0,ln.length());                            //寫入ln,從0到ln.length()的長度
        bw.write(ln,3,ln.length()-3);                            //寫入ln,從3個位置到ln.length()-3的長度，記得length-3否則存不了啊
        bw.newLine();                                            //寫入完跟它說就沒加行了
    }
    br.close();    
    bw.close();                                                  //記得關喔~
    }
}