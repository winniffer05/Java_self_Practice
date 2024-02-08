package day04_practice_tasks;

public class ElegibletoVote {

    public static void main(String[] args) {

        int age = 28;
/*
        String results;

        if (age >= 18){

        results = "You are elegible to vote";

            } else results = "You are not elegible to vote";

        System.out.println(results);

    } */


        String results = (age >= 18) ? "You are elegible to vote" : "you are not elegible to vote";

        System.out.println(results);

    }

}