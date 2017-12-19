/*
Properties 是跟資料庫連接用的
會把電腦內的key都抓出來
*/

import java.util.*;

public class TestColl5{
    public static void main (String args[]){
        Properties ps = System.getProperties();
        
        System.out.println( ps.get("java.runtime.name"));//版本名
        System.out.println( ps.get("java.vm.version"));  //抓出所有的key
        
        for ( Object key : ps.keySet()){
            System.out.println( "Key=" + key + ",Value=" +ps.get(key)); 
        }
    }
}