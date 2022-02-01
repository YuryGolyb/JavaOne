package LessonFive;

/**
 * Created by Golub Yurii
 * Date: 28.01.2022
 */
public class Employee {

    private String name;
    private String position;
    private String mail;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String name,String position,String mail,String phoneNumber,int salary,int age){
        this.name=name;
        this.position=position;
        this.mail=mail;
        this.phoneNumber=phoneNumber;
        this.salary=salary;
        this.age=age;
    }

    public void info(){
        System.out.println(name+"|"+position+"|"+mail+"|"+phoneNumber+"|"+salary+"|"+age);
    }

    public void ageOver40(){
        if(age>40){
            System.out.println(name+"|"+position+"|"+mail+"|"+phoneNumber+"|"+salary+"|"+age);
        }
    }
}