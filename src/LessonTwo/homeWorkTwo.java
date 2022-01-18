package LessonTwo;

/**
 * Created by Golub Yurii
 * Date: 17.01.2022
 */
public class homeWorkTwo {
    public static void main(String[] args) {

//        checkSum(int a, int b);
        if (checkSum(10, 5)) {
         System.out.println("True");
        }else {
            System.out.println("False");
        }
        System.out.println("**********");

//        checkNumber(int number);
        if(checkNumber(-23)){
            System.out.println("Positive");
        }else {
            System.out.println("Negative");
        }
        System.out.println("**********");

//        checkNegativeNumber(int number);
        if(checkNegativeNumber(44)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
        System.out.println("**********");

        printString("Hello,world!!!", 3);
        System.out.println("**********");

        System.out.println(checkYear(2020));
        System.out.println("**********");
    }
//    public static void checkSum(int a, int b){
//        if ((a + b) >=10 && (a + b) <=20){
//            System.out.println("True");
//        }else {
//            System.out.println("False");
//        }
    public static boolean checkSum(int a, int b){
        return (a + b) >=10 && (a + b) <=20;
    }

//  public static void checkNumber(int number){
//        if (number >=0){
//            System.out.println("Positive");
//        }else {
//            System.out.println("Negative");
//        }
    public static boolean checkNumber(int number){
        return number >=0;
    }

//  public static void checkNegativeNumber(int number){
//        if (number <0){
//            System.out.println("True");
//        }else {
//            System.out.println("False");
//        }
    public static boolean checkNegativeNumber(int number){
        return number <0;
    }

    public static void printString(String someText, int quantity){
        for(int i = 0; i < quantity; i++)
        System.out.println(someText);
    }

    public static boolean checkYear(int year){
            return (year%4 ==0 && year%100 !=0 || year%400 ==0 );
    }

}