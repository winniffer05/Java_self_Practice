package day7_practice_task;

public class AddressClient {

    public static void main(String[] args) {

        Address address = new Address();
        address.buildingNumber = 2825;
        address.street = "Valencia Dr circle";
        address.city = "Austin";
        address.state = "TX";
        address.zipCode = "73735";


        System.out.println(address.buildingNumber + " " +address.street);
        System.out.println(address.city +" "+address.state+ " "+address.zipCode);




    }

}
