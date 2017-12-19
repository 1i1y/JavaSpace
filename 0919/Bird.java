/*
Override -只能改寫成大於等於原本的存取範圍
通常搭配 super. ()
*/
public class Bird{
    String name;
    //private String name; 這樣小雞就叫不到名字了
    
    /*
    大                                     class
    | public     不限制                   |  V
    | protected  有繼承關係就取用的到     |
    | default    同一個package            |  V
    | private    同一個class              |
    小
    */
    
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return "[["+name+"]]";
    }

    void walk(){
        System.out.println(getName()+"會走路!");
    }
}
