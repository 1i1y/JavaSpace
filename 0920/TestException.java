/*
�B�z�ҥ~
try{} catch{} catch{} finally{}�K
*/
public class TestException{
    public static void main(String args[]){
        try{
            int num = Integer.parseInt(args[0]);
        }
        catch( ArrayIndexOutOfBoundsException aie){
            System.out.println("�P�ǨS�ѼơA�Ѽ�:"); //�o���٨S�񭫽Ƶ����j��
        }
        catch( NumberFormatException ne){
            System.out.println("�P�Ǩ����O�Ʀr�ڡA�Ѽ�:");
        }
        catch( ArithmeticException ae){
            System.out.println("�P�ǡu0�v����A�Ѽ�:");
        }
    }
}

/*
���D�@����:

�S�g�Ѽ�  java TestException
ArrayIndexOutOfBoundsException

�g���r��  java TestException abc
NumberFormatException

�g0�S�k�� java TestException 0
ArithmeticException

*/