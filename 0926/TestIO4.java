/*
Reader Writer            -> ��r�u io4
InputStream OutputStram  -> �i�Ϥ� io3
*/

import java.io.*;                                                                    //�w�]���|�s���O import java.lang*;

public class TestIO4{
    public static void main(String args[])throws Exception{                          // throws ��X�ҥ~�A���O�n��k
        FileReader fr = new FileReader("C:\\JavaSpace\\googlelogo.png");             // Ū�J("")���ɮסA�|�O��r���s�X
        FileWriter fw = new FileWriter("C:\\JavaSpace\\googlelogofw.png");           // ��X���ɮצ�}
        
        int ch = -1;
        while ( ( ch = fr.read()) != -1) {                                           // �s�X�S���t���A�ҥH�����e�N�@�w�O����
            System.out.print((char)ch);                                              // Ū�X���O��r���s�X�A�ҥH�A�[(char)��^��r
            fw.write(ch);                                                            // ��X�C
        } 
        
        fr.close();                                                                  // �O�o�����
        fw.close();                                                                  // ���}�����A�A�}����       
    }
}