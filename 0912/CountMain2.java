//�ϥ�class: Counter.java
public class CountMain2{
	public static void main(String args[]){
		
		Counter c1 = new Counter();
		System.out.println("�ثe�`�H��:"+c1.getSN()+",c1�ۤv�����X:"+c1.getNumber());
		
		Counter c2 = new Counter();
		System.out.println("�ثe�`�H��:"+c1.getSN()+",c1�ۤv�����X:"+c1.getNumber());
		System.out.println("�ثe�`�H��:"+c2.getSN()+",c2�ۤv�����X:"+c2.getNumber());
		
		Counter c3 = new Counter();
		System.out.println("�ثe�`�H��:"+c1.getSN()+",c1�ۤv�����X:"+c1.getNumber());
		System.out.println("�ثe�`�H��:"+c2.getSN()+",c2�ۤv�����X:"+c2.getNumber());
		System.out.println("�ثe�`�H��:"+c3.getSN()+",c3�ۤv�����X:"+c3.getNumber());

	}
}