/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.enum1.example;

import java.util.ArrayDeque;
import java.util.Deque;

enum Planet{
    MERCURY,
    EARTH,
    MARS,
    VENUS,
    JUPITER
}

public class App {

    Deque<Students> studentsDeque = new ArrayDeque<>();

    public static void main(String[] args) {
        App app = new App();
        //app.example1();
        app.example2();
        app.makeExercise();
    }

    void example1(){

        for(Planet planet : Planet.values()){
            System.out.println(planet);
        }

        Planet planete = Planet.JUPITER;

        switch(planete){
            case EARTH:
            case MARS:
                System.out.println("Można wysłać pojazd badawczy");
                break;
            case JUPITER:
                System.out.println("Gazowy olbrzym");
                break;
            default:
                System.out.println("Inna planeta");
        }

    }

    void example2(){
        for(Students student : Students.values())
            System.out.println(student.info());

        Students student = Students.KRZYSZTOF_ZAREBSKI;
        System.out.println(student.getHeight());

        switch(student){
            case KRZYSZTOF_ZAREBSKI:
            case KAMIL_STASICA:
                System.out.println("Krzysztof Zarębski");
                break;
            case KATARZYNA_SKRZYP:
                System.out.println("Krzysztof Zarębski");
            default:
                System.out.println("Wybrano innego studenta...");
                break;
        }

        System.out.println("Informacje o grupie: "+Students.groupInfo);

        studentsDeque.offer(Students.KRZYSZTOF_ZAREBSKI);
        studentsDeque.offer(Students.JOZEF_KUDRYS);
        studentsDeque.offer(Students.KAMIL_STASICA);
        studentsDeque.offer(Students.ARKADIUSZ_KUBINSKI);
        studentsDeque.offer(Students.KATARZYNA_SKRZYP);
    }

    void makeExercise(){
        while(!studentsDeque.isEmpty()) {
            //System.out.println(studentsDeque);
            Students student = studentsDeque.poll();
            student.makeExercise();
        }
    }
}
