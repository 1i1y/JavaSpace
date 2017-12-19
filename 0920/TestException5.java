/*
處理例外
try{} catch{} catch{} finally{}…
*/
public class TestException5{
    public static void main(String args[]){
        try{
            int num = Integer.parseInt(args[0]);
            System.out.println(10000/num);
        }
        catch(Exception e){     //抓所有的Exception的錯誤，下面留空也可，就是不知道錯了什麼而已
        System.out.println("同學你輸入這個:"+ e.getMessage() +" 是什麼啊~");      //取得輸入內容
        }
        
        finally{
            System.out.println("catch 不寫，錯哪就找不到喔~");
        }
    }
}

/*
問題一覽表:

沒寫參數  java TestException
ArrayIndexOutOfBoundsException

寫成字串  java TestException abc
NumberFormatException

寫0沒法算 java TestException 0
ArithmeticException

有錯
Exception
*/