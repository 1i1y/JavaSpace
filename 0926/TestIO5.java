/*
BufferedReader �N�����N�@��A�@��@�檺Ū
BufferedWriter                 �@��@�檺�g
*/

import java.io.*;

public class TestIO5{
    public static void main (String args[]) throws Exception {   //�ѤF throws �|�S��k�]!!
    //���N
    //FileReader fr = new FileReader("C:\\JavaSpace\\Test.txt");
    BufferedReader br = new BufferedReader(new FileReader("C:\\JavaSpace\\0926\\Test.txt"));      //Ū��
    BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\JavaSpace\\0926\\Test_bk.txt"));   //�s��
    
    String ln = null;
    while((ln = br.readLine()) != null){                         //�S�����ɫJ�Onull(�w�])
        System.out.println(ln);                                  //�ҥH�����e�N��L
        //System.out.println();
        //bw.write(ln,0,ln.length());                            //�g�Jln,�q0��ln.length()������
        bw.write(ln,3,ln.length()-3);                            //�g�Jln,�q3�Ӧ�m��ln.length()-3�����סA�O�olength-3�_�h�s���F��
        bw.newLine();                                            //�g�J���򥦻��N�S�[��F
    }
    br.close();    
    bw.close();                                                  //�O�o����~
    }
}