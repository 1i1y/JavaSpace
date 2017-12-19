/*
Throwable
    \ Error
    \ Exception
        \ RuntimeException
*/


public class TestException4{
    //public static void main (String args[]){
    public static void main (String args[]) throws Exception{      //把錯誤訊息從上丟
        System.out.println("薪資:"+ getBalance(-10000));
    }
    //static int getBalance(int m) throws RuntimeException{
    static int getBalance(int m) throws Exception{
        //...
        if(m<0){
            throw new RuntimeException("薪資異常");
        }
        return m;
    }
}