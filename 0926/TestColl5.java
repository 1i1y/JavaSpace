/*
Properties �O���Ʈw�s���Ϊ�
�|��q������key����X��
*/

import java.util.*;

public class TestColl5{
    public static void main (String args[]){
        Properties ps = System.getProperties();
        
        System.out.println( ps.get("java.runtime.name"));//�����W
        System.out.println( ps.get("java.vm.version"));  //��X�Ҧ���key
        
        for ( Object key : ps.keySet()){
            System.out.println( "Key=" + key + ",Value=" +ps.get(key)); 
        }
    }
}