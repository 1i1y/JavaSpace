/*
Reader Writer            -> ��r�u io4
InputStream OutputStram  -> �i�Ϥ� io3
*/

import java.io.*;                                                                    //�w�]���|�s���O import java.lang*;

public class TestIO3{
    public static void main(String args[])throws Exception{                          // throws ��X�ҥ~
        FileInputStream  fis = new FileInputStream("C:\\JavaSpace\\googlelogo.png");       // Ū�J("")���ɮסA�|�O��r���s�X�A�j�q��buffer
        FileOutputStream fos = new FileOutputStream("C:\\JavaSpace\\googlelogofos.png");   // ��X���ɮצ�}
        
        int ch = -1;
        while ( ( ch = fis.read()) != -1) {                                          // �s�X�S���t���A�ҥH�����e�N�@�w�O����
            System.out.print((char)ch);                                              // Ū�X���O��r���s�X�A�ҥH�A�[(char)��^��r
            fos.write(ch);                                                           // ��X�C���ެO Intput �άO Output ���O�n�D Int
        }
        
        fis.close();                                                                 // �O�o�����
        fos.close();                                                                 // ���}�����A�A�}����       
    }
}