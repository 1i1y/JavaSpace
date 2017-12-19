/*
Map - HashMap : ("key","value")
�W�[: put / ����: get

key - keySet -> Set
value        -> Collection

*/

import java.util.*;

public class TestColl4{
    public static void main (String args[]){
        Map m = new HashMap();
        //put,�W�[
        m.put("Lang","Java");
        m.put("Vers",18.3);
        
        System.out.println(m);
        //get,����          ��key,�Lvalue
        System.out.println(m.get("Lang"));
        System.out.println(m.get("Vers"));
        
        
        
        //1. while �L�X
        Set ks = m.keySet();
        Iterator it = ks.iterator();
        // => �]�@��set�sks, �O�Ӧ�m��keySet, ��iterator���Xks
        // => Iterator it = m.keySet().iterator();

        while(it.hasNext()){
            Object o = it.next();
            System.out.print( "Key=" + o );
            System.out.println( ",Value=" + m.get(o) );
        }
        
        
        //2. for �L�X
        for ( Object key : m.keySet()){
            System.out.println( "Key=" + key + ",Value=" +m.get(key)); 
        }
    }
}