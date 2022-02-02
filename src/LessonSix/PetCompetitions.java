package LessonSix;

/**
 * Created by Golub Yurii
 * Date: 01.02.2022
 */
public class PetCompetitions {
    public static void main(String[] args){
//        Cats cat1 = new Cats("Boris","British-shorthair","grey",3,3);
//        Cats cat2 = new Cats("Vasiliy","Russian-homecat","red",4,4);
//
//        cat1.runningCompetitions(100);
//        cat2.swimming(2);



        Cats[] cats ={
                new Cats("Boris","British-shorthair","grey",3,3),
                new Cats("Vasiliy","Russian-homecat","red",4,4),
                new Cats("Jack","Sphinx","black",3,2),
                new Cats("Molly","Exotic-shorthair","white",2,5),
                new Cats("Poppy","Ragdoll","white-grey",4,6)
        };


        Dogs[] dogs = {
                new Dogs("Karma","Great dane","black",6,16),
                new Dogs("Hammer","Toy terrier","brown",4,10),
                new Dogs("Lexus","German shepherd","brown black",7,14),
        };

        System.out.println("**!!!WELCOME TO PET COMPETITIONS!!!**");
        System.out.println();

        getAllCats(cats);
        getAllDogs(dogs);
        allPets(dogs,cats);


        System.out.println("******Cats running competitions******");
        for (int i = 0; i < cats.length; i++) {
            cats[i].runningCompetitions(200);
        }
        System.out.println("*************************************");
        System.out.println();

        System.out.println("******Dogs running competitions******");

        for (int i = 0; i < dogs.length; i++) {
            dogs[i].runningCompetitions(400);
        }
        System.out.println("*************************************");
        System.out.println();


        System.out.println("***Cats time running competitions****");

        for (int i = 0; i < cats.length; i++) {
            cats[i].timeRunningCompetitions(100);
        }
        System.out.println("*************************************");
        System.out.println();


        System.out.println("***Dogs time running competitions****");

        for (int i = 0; i < dogs.length; i++) {
            dogs[i].timeRunningCompetitions(400);
        }
        System.out.println("*************************************");
        System.out.println();

        System.out.println("************Cats swimming************");

        for (int i = 0; i < cats.length; i++) {
            cats[i].swimming(9);
        }
        System.out.println("*************************************");
        System.out.println();

        System.out.println("************Dogs swimming************");

        for (int i = 0; i < dogs.length; i++) {
            dogs[i].swimming(10);
        }
        System.out.println("*************************************");
        System.out.println();
    }
    private static void getAllCats(Cats[] cats){
        System.out.println("*************All cats****************");
        for (int i = 0; i < cats.length; i++)
            System.out.println((i + 1) + " " + cats[i].getInfo());
        System.out.println("------");
        System.out.println("Total "+cats.length+" cats");
        System.out.println("*************************************");
        System.out.println();
    }

    private static void getAllDogs(Dogs[] dogs){
        System.out.println("*************All dogs****************");
        for (int i = 0; i < dogs.length; i++)
            System.out.println((i + 1) + " " + dogs[i].getInfo());
        System.out.println("------");
        System.out.println("Total "+dogs.length+" dogs");
        System.out.println("*************************************");
        System.out.println();
    }

    private static void allPets(Dogs[] dogs, Cats[] cats){
        System.out.println("************All animals**************");
            System.out.println("Total "+(dogs.length+cats.length) + " animals");
        System.out.println("*************************************");
        System.out.println();
    }
}