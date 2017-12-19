public class GcTest{
    String name;
    GcTest(String name){
        this.name = name;
        System.out.println(name + "被建立...");
    }
    protected void finalize(){
        System.out.println(name + "被回收...");
    }
    public static void main(String args[]){
        GcTest g1 = new GcTest("G1");
        GcTest g2 = new GcTest("G2");
        GcTest g3 = new GcTest("G3");
        
        g1=null;
        g2=null;
        g3=null;
        
        //System.gc();
        while(true); 
    }
}