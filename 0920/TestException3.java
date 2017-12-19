/*
�B�z�ҥ~
try{} catch{} catch{} finally{}�K
printStackTrace �L�X���~�T��
*/
public class TestException{
    public static void main(String args[]){
        try{
            int num = Integer.parseInt(args[0]);
            System.out.println(100/num);
        }
        catch( ArrayIndexOutOfBoundsException aie){
            System.out.println("�P�ǨS�ѼơA�Ѽ�:"); //�o���٨S�񭫽Ƶ����j��
            aie.printStackTrace();                   //printStackTrace �L�X���~�T��
        }
        catch( NumberFormatException ne){
            System.out.println("�P�Ǩ����O�Ʀr�ڡA�Ѽ�:");
            ne.printStackTrace(); 
        }
        catch( ArithmeticException ae){
            System.out.println("�P�ǡu0�v����A�Ѽ�:");
            ae.printStackTrace(); 
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