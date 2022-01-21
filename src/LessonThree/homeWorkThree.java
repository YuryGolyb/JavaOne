package LessonThree;

import java.util.Arrays;

/**
 * Created by Golub Yurii
 * Date: 20.01.2022
 */
public class homeWorkThree {

    public static void main(String[] args){
        changeValuesIntoArray();
        System.out.println("**********");
        emptyArray();
        System.out.println("**********");
        numbersLessSix();
        System.out.println("**********");
        diagonalValues();
        System.out.println("**********");
        enterValuesIntoArray(13,13);
        System.out.println("**********");
        checkMaxMinValuesIntoArray();
        System.out.println("**********");


    }


    public static void changeValuesIntoArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++){
            if(array[i]>0){
                array[i]=array[i]-1;
            }else{
                array[i]=array[i]+1;
            }
        }
        System.out.println(Arrays.toString(array));

    }

    public static void emptyArray(){
        int[] array = new int[100];
        for(int i =0; i <array.length;i++){
            array[i] = i+1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void numbersLessSix(){
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for(int i = 0;i < array.length;i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            } else {
                array[i] = array[i];
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void diagonalValues(){
        String[][] array= new String[10][10];
        for( int i = 0;i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                if(i==j || i+j==(array.length-1)){
                    array[i][j] = "[" +1+ "]";
                }else{
                    array[i][j] = "[" + " " + "]";
                }
            }
        }
        for( int i = 0;i < array.length; i++){
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void enterValuesIntoArray(int len, int initialValue){
        int[] array= new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i]=initialValue;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void checkMaxMinValuesIntoArray(){
        int[] array= {30,20,40,5,23,685,4,123,0,-34};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max)
                max = array[i];
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]<min)
                min = array[i];
        }
        System.out.println( "max value- " + max);
        System.out.println( "min value- " + min);
    }
}