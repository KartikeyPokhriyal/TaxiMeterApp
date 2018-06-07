public class SUV extends Cab {
    public SUV(double base_price) {
        super(base_price);
    }

    public double  calculateFare(double distance) {

        if(distance > 5 && distance <= 15)
            return (base_price + (distance - 3) * 15);
        else if(distance > 15)
            return (base_price + 15 * 15 + (distance - 15 - 5) * 12);

            return base_price;
    }
}
