//給TestHello 使用
package com.oracle;

public class Hello{
//class Hello{        跨package,只能用public  
    public static void main (String args[]){
        Hello h = new Hello();
        h.sayHello(); //駝峰式命名
    }  
    /*
    main 沒寫不影響
    下面寫怎麼做
    */
    public void sayHello(){
        System.out.println("Hello!");        
    }
}
//javac -d . Hello.java
//java com.oracle.Hello

