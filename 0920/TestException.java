/*
矪瞶ㄒ
try{} catch{} catch{} finally{}
*/
public class TestException{
    public static void main(String args[]){
        try{
            int num = Integer.parseInt(args[0]);
        }
        catch( ArrayIndexOutOfBoundsException aie){
            System.out.println("厩⊿把计把计:"); //硂柑临⊿狡氮癹伴
        }
        catch( NumberFormatException ne){
            System.out.println("厩êぃ琌计摆把计:");
        }
        catch( ArithmeticException ae){
            System.out.println("厩0或衡把计:");
        }
    }
}

/*
拜肈凝:

⊿糶把计  java TestException
ArrayIndexOutOfBoundsException

糶Θ﹃  java TestException abc
NumberFormatException

糶0⊿猭衡 java TestException 0
ArithmeticException

*/