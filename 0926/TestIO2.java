/*
File 
isFile        : �s�ɮ�
isDirectory   : �s�ؿ�
contains("")  : ���]�t��
*/

import java.io.*;

public class TestIO2{
    public static void main (String args[]){
        File file  = new File("C:\\");        // C�ѤU�����n
        File [] fs = file.listFiles();
        
        //isFile
        System.out.println("�ɮצC��:");
        for(File f:fs){
            if(f.isFile()&& f.getName().contains(".txt")){      //&& f.getName() .contains("") �ݦW�r�]�t""��         
                System.out.println(f);
            }
        }
        //isDirectory
        System.out.println("�ؿ�:");
        for(File f:fs){
            if(f.isDirectory()){
                System.out.println(f);
            }
        }
    }
}
