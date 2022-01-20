
package oop;

public class Test {
    public static void main(String[] args){
                
    
        teacher teacher1;//object declare
                teacher1=new teacher("Tisha","female",169845);//create
        /*teacher1.name="Tisha";
        teacher1.gender="Female";
        teacher1.phone=169845;*/
        
        /*System.out.println("Name: "+teacher1.name);
        System.out.println("gender: "+teacher1.gender);
        System.out.println("Name: "+teacher1.phone);*/
        //teacher1.setinformation();
        teacher1.displayformation();
        teacher teacher2;//object declare
                teacher2=new teacher("mitu","female",17222);//create
       /* teacher2.name="mitu";
        teacher2.gender="Female";
        teacher2.phone=1722;
        teacher1.setinformation("mitu","female",17222);*/                                                                                                                       
        teacher2.displayformation();
        /*System.out.println("Name: "+teacher2.name);
        System.out.println("gender: "+teacher2.gender);
        System.out.println("Name: "+teacher2.phone);*/
    }
}
    