/*
���J��Ʈw�X�ʵ{��:
1�B
java -classpath .;C:\JavaSpace\mysql-connector-java-5.1.44-bin.jar TestJDBC1
     -classpath .;
     
2�B
java -cp .;C:\JavaSpace\* TestJDBC1
�̵u�g�k
*/
public class TestJDBC1{
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("���\���J��Ʈw�X�ʵ{��");
        }
        catch(ClassNotFoundException cnfe){
            System.out.println("�L�k���J��Ʈw�X�ʵ{���K");
        }
    }
}