/*
�B�z�ҥ~ - �����]�k��
try{} catch{} catch{} finally{"�u�@�w�B�z�϶��v"}�K
*/
import static java.lang.Integer.*;
public class TestException2{
    public static void main(String args[]){
        try{
            int num = Integer.parseInt(args[0]);
            System.out.println(100/num);
            System.out.println("1.         try �{���϶�");
        }
        catch( ArrayIndexOutOfBoundsException aie){
            System.out.println("2-1. catch aie �ҥ~�϶�");
        }
        catch( NumberFormatException ne){
            System.out.println("2-2. catch  ne �ҥ~�϶�");
        }
        /*  ���ըҥ~���p
        catch( ArithmeticException ae){
            System.out.println("2-3. catch  ae �ҥ~�϶�");
        }
        */
        finally{
            System.out.println("3.     finally �{���϶�");
            System.out.println("�u�o�϶����ޫ��˳��|�L~�v");
            System.out.println(MAX_VALUE);     //�j��10�X���Ʀr�N�ܤ�r�F
        }
        System.out.println    ("4.        �зǵ{���϶�!");
    }
}