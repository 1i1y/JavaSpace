//zoo裡的Chicken直接繼承Bird,所以Chicken程式只有一行的
public class zoo{
    public static void main(String args[]){
        Bird b= new Bird();
        b.setName("小鳥兒");
        b.walk();
        //b.wu(); 小孩的屬性爸爸不能用
 
        Chicken c= new Chicken();
        c.setName("小雞兒");
        c.walk(); 
        c.wu();
        
        
    }
}
