/*
處理例外
try{} catch{} catch{} finally{}…
printStackTrace 印出錯誤訊息
*/
public class TestException{
    public static void main(String args[]){
        try{
            int num = Integer.parseInt(args[0]);
            System.out.println(100/num);
        }
        catch( ArrayIndexOutOfBoundsException aie){
            System.out.println("同學沒參數，參數:"); //這裡還沒放重複答的迴圈
            aie.printStackTrace();                   //printStackTrace 印出錯誤訊息
        }
        catch( NumberFormatException ne){
            System.out.println("同學那不是數字啊，參數:");
            ne.printStackTrace(); 
        }
        catch( ArithmeticException ae){
            System.out.println("同學「0」怎麼算，參數:");
            ae.printStackTrace(); 
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

*/