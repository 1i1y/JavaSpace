public class Chicken extends Bird{
//Chicken�~��Bird���Ҧ��\��A�M��A�[�ۤv��
    String crest;
    
    void setCrest(String crest){
        this.crest = crest;
    }
    String getCrest(){
        return crest;
    }
    
    String getName(){
        return "*"+super.getName()+"*";
    }
    //super �����O��
    
    void wu(){
        System.out.println(super.name+"�B�B�s!");
    }
    
}
