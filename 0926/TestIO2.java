/*
File 
isFile        : 叫檔案
isDirectory   : 叫目錄
contains("")  : 有包含的
*/

import java.io.*;

public class TestIO2{
    public static void main (String args[]){
        File file  = new File("C:\\");        // C槽下的都要
        File [] fs = file.listFiles();
        
        //isFile
        System.out.println("檔案列表:");
        for(File f:fs){
            if(f.isFile()&& f.getName().contains(".txt")){      //&& f.getName() .contains("") 看名字包含""的         
                System.out.println(f);
            }
        }
        //isDirectory
        System.out.println("目錄:");
        for(File f:fs){
            if(f.isDirectory()){
                System.out.println(f);
            }
        }
    }
}
