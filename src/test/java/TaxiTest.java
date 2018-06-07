import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaxiTest {


    @Test
    public void shouldReturnThePriceForThreeKilometerOfAMiniRide() {
        Cab cab = new Mini(50);
        assertEquals(50, cab.calculateFare(3), 0.001);
    }

    @Test
    public void shouldReturnThePriceForTenKilometerOfAMiniRide() {
        Cab cab = new Mini(50);
        assertEquals(120, cab.calculateFare(10), 0.001);
    }

    @Test
    public void shouldReturnThePriceFor35KilometerOfAMiniRide() {
        Cab cab = new Mini(50);
        assertEquals(360, cab.calculateFare(35), 0.001);
    }


    @Test
    public void shouldReturnThePriceForThreeKilometerOfASedanRide() {
        Cab cab = new Sedan(80);
        assertEquals(80, cab.calculateFare(5), 0.001);
    }

    @Test
    public void shouldReturnThePriceForTenKilometerOfASedanRide() {
        Cab cab = new Sedan(80);
        assertEquals(164, cab.calculateFare(10), 0.001);
    }

    @Test
    public void shouldReturnThePriceFor35KilometerOfAMSedanRide() {
        Cab cab = new Sedan(80);
        assertEquals(390, cab.calculateFare(35), 0.001);
    }


}
