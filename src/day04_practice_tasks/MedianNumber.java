package day04_practice_tasks;

public class MedianNumber {

    public static void main(String[] args) {

int a = 10 , b =15 , c=20;

 if ((a<b && b<c) || (c<b && b<a  )){
     System.out.println(b + "  is the middle number");
 } else if ((b<a && a<c)|| ( c < a && a <b)) {
     System.out.println(a + "is the middle number");
 }


 }


    }

