/*
載入資料庫驅動程式:
1、
java -classpath .;C:\JavaSpace\mysql-connector-java-5.1.44-bin.jar TestJDBC1
     -classpath .;
     
2、
java -cp .;C:\JavaSpace\* TestJDBC1
最短寫法
*/
public class TestJDBC1{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("成功載入資料庫驅動程式");
        }
        catch(ClassNotFoundException cnfe){
            System.out.println("無法載入資料庫驅動程式…");
        }
    }
}