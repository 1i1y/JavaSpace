/*
�B�z�ҥ~
try{} catch{} catch{} finally{}�K
*/
public class TestException5{
    public static void main(String args[]){
        try{
            int num = Integer.parseInt(args[0]);
            System.out.println(10000/num);
        }
        catch(Exception e){     //��Ҧ���Exception�����~�A�U���d�Ť]�i�A�N�O�����D���F����Ӥw
        System.out.println("�P�ǧA��J�o��:"+ e.getMessage() +" �O�����~");      //���o��J���e
        }
        
        finally{
            System.out.println("catch ���g�A�����N�䤣���~");
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

����
Exception
*/