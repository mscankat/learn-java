import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance(km):");
        int distance = scanner.nextInt();
        Ticket ticket =new Ticket(distance);
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        Passenger passenger = new Passenger(age);
        Discount ageDiscount = new Discount(passenger.getAge());
        System.out.println("(1)=> One Way, (2)=> Round Trip:");
        FlightType flightType = FlightType.values()[scanner.nextInt()-1];
        Discount typeDiscount = new Discount(flightType);
        float ageDiscounted = (float) (ticket.getPrice() - ticket.getPrice()*ageDiscount.getDiscount());
        float typeDiscounted = (float) ageDiscounted - ageDiscounted*typeDiscount.getDiscount();
        if(flightType == FlightType.roundTrip){
            typeDiscounted *=2;
        }

        System.out.println("Price for the ticket is: "+ typeDiscounted + "EUR");
    }
}
