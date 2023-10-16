public class Ticket{
    float price;
    int distance;
    public Ticket(int distance){
        this.distance = distance;
        this.price = distance * 0.10f;
    };
    public double getPrice(){
        return price;
    }
}