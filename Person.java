/*
    Maddison Chin
    CMP129-80235
    Week 2, Lab 2
    Lab Assignment 4 Part A
    21 September 2026
*/

public class Person {
    
    //declare variables
    private String name;
    private int age;
    private String email;

    public void setName(String name){
        this.name = name;
    }   //end of setName

    public String getName(){
        return name;
    }   //end of getName

    public void setAge(int age){
        this.age = age;
    }   //end of setAge

    public int getAge(){
        return age;
    }   //end of getAge

    public void setEmail(String email){
        this.email = email;
    }   //end of setEmail

    public String getEmail(){
        return email;
    }   //end of getEmail

    //create displayInfo method to print organized person info
    public void displayInfo(){
        //display title to user
        System.out.print("Person Information\n");
        //create separation for title
        System.out.print("-----------------------\n");
        //display name of person
        System.out.println("Name: " + name);
        //display age of person
        System.out.println("Age: " + age);
        //display email of person
        System.out.println("Email: " + email);
        //display line to separate person 1 info from person 2
        System.out.print("________________________________\n");
    }   //end of displayInfo 

}   //end of class
