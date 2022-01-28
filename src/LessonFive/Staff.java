package LessonFive;

/**
 * Created by Golub Yurii
 * Date: 28.01.2022
 */
public class Staff {
    public static void main(String[] args) {

//        Employee pers1 = new Employee("Jack Daniels", "PR-manager", "rws@ru", "555-57-34-34", 180000, 44);
//        Employee pers2 = new Employee("Johny Walker", "HR", "qw@tu", "555-7775-23", 150000, 28);
//        Employee pers3 = new Employee("William Lawson", "junior QA", "wer@qw", "555-55-55-21", 150000, 30);
//        Employee pers4 = new Employee("Jim Beam", "middle QA", "ghtyh@er", "555-55-55-21", 200000, 36);
//        Employee pers5 = new Employee("George Ballantines", "senior QA", "fgh@qq", "555-55-55-21", 280000, 42);
//
//        pers1.info();
//        pers2.info();
//        pers3.info();
//        pers4.info();
//        pers5.info();
//        System.out.println("***********");

        Employee[] staff= new Employee[5];
        staff[0]= new Employee("Jack Daniels", "PR-manager", "rws@ru", "555-57-34-34", 180000, 44);
        staff[1]= new Employee("Johny Walker", "HR", "qw@tu", "555-7775-23", 150000, 28);
        staff[2]= new Employee("William Lawson", "junior QA", "wer@qw", "555-55-55-21", 150000, 30);
        staff[3]= new Employee("Jim Beam", "middle QA", "ghtyh@er", "555-55-55-21", 200000, 36);
        staff[4]= new Employee("George Ballantines", "senior QA", "fgh@qq", "555-55-55-21", 280000, 42);


        System.out.println("****************  ALL STAFF  ****************");
        for (int i = 0; i < staff.length; i++) {
            staff[i].info();
        }
        System.out.println();
        System.out.println("***************  AGE OVER 40  ***************");

        for (int i = 0; i < staff.length; i++) {
            staff[i].ageOver40();
        }
    }
}