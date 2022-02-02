package LessonSix;

/**
 * Created by Golub Yurii
 * Date: 01.02.2022
 */
public class Cats extends Animals{

    private int maxRunningDistance;
    private int maxSwimmingDistance;

    public Cats(String name,String breed,String color,int age,int runningSpeed){
        super(name,breed,color,age,runningSpeed);
        this.maxRunningDistance = 200;
        this.maxSwimmingDistance=0;
    }

    @Override
    public void runningCompetitions(int distance) {
        if(distance<=maxRunningDistance){
                System.out.println( "Cat "+name+" ran " + distance+ " meters");
            }else{
            System.out.println("Sorry, cat "+name+" can't run this distance");
        }
    }

    @Override
    public void timeRunningCompetitions(int distance) {
        if(distance <= maxRunningDistance){
            System.out.println("Cat "+name+" ran " + distance+ " meters for "+ distance/runningSpeed+" min" );
        }else {
            System.out.println("Sorry, cat "+name+" can't run this distance");
        }
    }

    @Override
    public void swimming(int distance) {
        if(distance>maxSwimmingDistance){
            System.out.println("Sorry, cats can't swim");
        }
    }
}