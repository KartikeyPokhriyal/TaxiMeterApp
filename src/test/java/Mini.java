public class Mini extends Cab {

    double base_price;

    public Mini(double base_price) {
        this.base_price = base_price;
    }

    public double  calculateFare(double distance) {

        if(distance > 3 && distance <= 15)
        return base_price + (distance - 3) * 10;
        else if(distance < 75 &&  distance > 15)
           return (base_price + 15 *10 + (distance - 15) * 8);
        if(distance > 75) {
            return distance * 8;
        }
        else
            return base_price;
    }
}
