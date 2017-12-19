// 只會從0開始一直加上去的bug

public class Bug{
    public static void main(String args[]){
        int i = 0;
        while(true){
            System.out.print(i++);
        }
    }
}