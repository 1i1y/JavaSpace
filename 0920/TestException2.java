/*
處理例外 - 說明跑法版
try{} catch{} catch{} finally{"「一定處理區塊」"}…
*/
import static java.lang.Integer.*;
public class TestException2{
    public static void main(String args[]){
        try{
            int num = Integer.parseInt(args[0]);
            System.out.println(100/num);
            System.out.println("1.         try 程式區塊");
        }
        catch( ArrayIndexOutOfBoundsException aie){
            System.out.println("2-1. catch aie 例外區塊");
        }
        catch( NumberFormatException ne){
            System.out.println("2-2. catch  ne 例外區塊");
        }
        /*  測試例外狀況
        catch( ArithmeticException ae){
            System.out.println("2-3. catch  ae 例外區塊");
        }
        */
        finally{
            System.out.println("3.     finally 程式區塊");
            System.out.println("「這區塊不管怎麼樣都會印~」");
            System.out.println(MAX_VALUE);     //大於10碼的數字就變文字了
        }
        System.out.println    ("4.        標準程式區塊!");
    }
}