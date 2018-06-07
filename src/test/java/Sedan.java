public class Sedan extends Cab {

    public Sedan(int base_price) {
        super(base_price);
    }

    public double  calculateFare(double distance) {

        if(distance > 5 && distance <= 15)
            return (base_price + (distance - 3) * 12);
        else if(distance < 100 &&  distance > 15)
            return (base_price + 15 *10 + (distance - 15) * 8);
        if(distance > 100) {
            return distance * 10;
        }
        else
            return base_price;
    }
}
