package LessonSix;

/**
 * Created by Golub Yurii
 * Date: 01.02.2022
 */
public abstract class Animals {

    protected String breed;
    protected String color;
    protected String name;
    protected int age;
    protected int runningSpeed;

    public Animals(String name,String breed,String color,int age,int runningSpeed){
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.age=age;
        this.runningSpeed=runningSpeed;
    }


    public  abstract void runningCompetitions(int distance);

    public abstract void timeRunningCompetitions(int distance);

    public abstract void swimming(int distance);

    String getInfo(){
         return this.name +  ", "+ this.breed+", "+ this.color;
    }

}