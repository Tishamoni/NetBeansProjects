
package oop;


public class teacher {
    String name,gender;
    int phone;
    /*void setinformation(String n,String m,int phn){
        name=n;
        gender=m;
        phone=phn;
        
        
        
    }*/
    teacher(String n,String m,int phn){
        name=n;
        gender=m;
        phone=phn;
    }
    
    
    void displayformation(){
        System.out.println("Name: "+name);
        System.out.println("gender: "+gender);
        System.out.println("Phone: "+phone); 
        
        
    }
}
