//��TestHello �ϥ�
package com.oracle;

public class Hello{
//class Hello{        ��package,�u���public  
    public static void main (String args[]){
        Hello h = new Hello();
        h.sayHello(); //�m�p���R�W
    }  
    /*
    main �S�g���v�T
    �U���g���
    */
    public void sayHello(){
        System.out.println("Hello!");        
    }
}
//javac -d . Hello.java
//java com.oracle.Hello

