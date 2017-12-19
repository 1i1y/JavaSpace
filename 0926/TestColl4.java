/*
Map - HashMap : ("key","value")
增加: put / 取用: get

key - keySet -> Set
value        -> Collection

*/

import java.util.*;

public class TestColl4{
    public static void main (String args[]){
        Map m = new HashMap();
        //put,增加
        m.put("Lang","Java");
        m.put("Vers",18.3);
        
        System.out.println(m);
        //get,取用          給key,印value
        System.out.println(m.get("Lang"));
        System.out.println(m.get("Vers"));
        
        
        
        //1. while 印出
        Set ks = m.keySet();
        Iterator it = ks.iterator();
        // => 設一個set叫ks, 是來自m的keySet, 用iterator取出ks
        // => Iterator it = m.keySet().iterator();

        while(it.hasNext()){
            Object o = it.next();
            System.out.print( "Key=" + o );
            System.out.println( ",Value=" + m.get(o) );
        }
        
        
        //2. for 印出
        for ( Object key : m.keySet()){
            System.out.println( "Key=" + key + ",Value=" +m.get(key)); 
        }
    }
}