package LessonSix;

/**
 * Created by Golub Yurii
 * Date: 01.02.2022
 */
public class Dogs extends Animals{

    private int maxRunningDistance;
    private int maxSwimmingDistance;

    public Dogs(String name,String breed,String color,int age,int runningSpeed){
        super(name,breed,color,age,runningSpeed);
        this.maxRunningDistance = 500;
        this.maxSwimmingDistance= 10;
    }
    @Override
    public void runningCompetitions(int distance) {
        if(distance<=maxRunningDistance){
            System.out.println("Dog "+name+" ran " + distance+ " meters");
        }else{
            System.out.println("Sorry, dog "+name+" can't run this distance");
        }
    }
    @Override
    public void timeRunningCompetitions(int distance) {
        if(distance <= maxRunningDistance){
            System.out.println("Dog "+name+" ran " + distance+ " meters for "+ distance/runningSpeed+" min" );
        }else {
            System.out.println("Sorry, dog "+name+" can't run this distance");
        }
    }

    @Override
    public void swimming(int distance) {
        if(distance>maxSwimmingDistance){
            System.out.println("Sorry, dog "+name+ " can't swim this distance");
        }else{
            System.out.println("Dog "+name+" swam "+distance+" meters");
        }
    }
}