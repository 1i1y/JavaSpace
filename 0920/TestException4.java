/*
Throwable
    \ Error
    \ Exception
        \ RuntimeException
*/


public class TestException4{
    //public static void main (String args[]){
    public static void main (String args[]) throws Exception{      //����~�T���q�W��
        System.out.println("�~��:"+ getBalance(-10000));
    }
    //static int getBalance(int m) throws RuntimeException{
    static int getBalance(int m) throws Exception{
        //...
        if(m<0){
            throw new RuntimeException("�~�겧�`");
        }
        return m;
    }
}