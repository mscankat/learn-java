public class Discount {
    float discount = 0;
    public Discount(int age){
        if(age<12){
            discount = 0.5f;
        } else if (age<24) {
            discount = 0.1f;
        } else if (age>65) {
            discount = 0.3f;
        }
    }
    public Discount(FlightType type){
        if(type == FlightType.roundTrip){
            discount = 0.2f;
        }
    }
    public float getDiscount(){
        return discount;
    }
}
