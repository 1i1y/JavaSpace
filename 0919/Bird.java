/*
Override -�u���g���j�󵥩�쥻���s���d��
�q�`�f�t super. ()
*/
public class Bird{
    String name;
    //private String name; �o�ˤp���N�s����W�r�F
    
    /*
    �j                                     class
    | public     ������                   |  V
    | protected  ���~�����Y�N���Ϊ���     |
    | default    �P�@��package            |  V
    | private    �P�@��class              |
    �p
    */
    
    void setName(String name){
        this.name = name;
    }
    String getName(){
        return "[["+name+"]]";
    }

    void walk(){
        System.out.println(getName()+"�|����!");
    }
}
