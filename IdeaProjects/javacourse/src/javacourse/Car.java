package javacourse;
//my first java project

import java.sql.SQLOutput;

/*my first project
java
3/2/2026
class => variables and methods
variables is المتغيرات is set a name to save in the memory
methods

object is a copy from the class
 */
public class Car {
//    public int model;
//    public float price;
//
//    public short max_speed;
//
//
//    public void Speed(int s){
//
//        System.out.println("Speed :"+s);
//    }
    public int speed;

    public Car(int s){

this.speed=s;

    }
    public void setSpeed(int s){
        this.speed=s;


        switch (s){
            case 100:
                System.out.println("be carful");
                break;
            case 120:
                System.out.println("slow down");
                break;
            case 50:
                System.out.println("good driver");
            default:
                System.out.println("okay");

        }
    }

public int getSpeed(){

    return this.speed;

}


    }



