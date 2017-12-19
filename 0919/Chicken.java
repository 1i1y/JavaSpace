public class Chicken extends Bird{
//Chicken繼承Bird的所有功能，然後再加自己的
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
    //super 父類別的
    
    void wu(){
        System.out.println(super.name+"咕咕叫!");
    }
    
}
