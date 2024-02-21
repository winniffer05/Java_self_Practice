package day13_practice_task;

public class PhoneClient {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("iphone","12","XL","black",1200);
        System.out.println(iphone);
         iphone.Call();
         iphone.Text();



    }
}
