import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RushHourTest {
    RushHour c;
    @Before
    public void setup() throws Exception{
        c= new RushHour();
        System.out.print("this method is running g0o0d");

    }

// this is the Equivalence and Boundary Test
    @Test(expected = IllegalArgumentException.class)
    public void EquivalenceandBoundrytest1(){
        String result =c.TrainTicketFare((float) -1);
        assertEquals("Full Fare",result);
    }

    @Test
    public void EquivalenceandBoundrytest2(){
        String result =c.TrainTicketFare((float ) 4.50);
        assertEquals("Full Fare",result);
    }
    @Test
    public void EquivalenceandBoundrytest3(){
        String result =c.TrainTicketFare((float ) 9.49);
        assertEquals("Full Fare",result);
    }
    @Test
    public void EquivalenceandBoundrytest4(){
        String result =c.TrainTicketFare((float ) 9.50);
        assertEquals("Full Fare",result);
    }
    @Test
    public void EquivalenceandBoundrytest5(){
        String result =c.TrainTicketFare((float ) 13);
        assertEquals("Saver Ticket ",result);
    }
    @Test
    public void EquivalenceandBoundrytest6(){
        String result =c.TrainTicketFare((float ) 16.00);
        assertEquals("Full Fare",result);
    }
    @Test
    public void EquivalenceandBoundrytest7(){
        String result =c.TrainTicketFare((float ) 16.1);
        assertEquals("Full Fare",result);
    }
    @Test
    public void EquivalenceandBoundrytest8(){
        String result =c.TrainTicketFare((float ) 18.00);
        assertEquals("Full Fare",result);
    }
    @Test
    public void EquivalenceandBoundrytest9(){
        String result =c.TrainTicketFare((float ) 19.50);
        assertEquals("Full Fare",result);
    }
    @Test
    public void EquivalenceandBoundrytest10(){
        String result =c.TrainTicketFare((float ) 19.51);
        assertEquals("Saver Ticket ",result);
    }
    @Test
    public void EquivalenceandBoundrytest11(){
        String result =c.TrainTicketFare((float ) 21);
        assertEquals("Saver Ticket ",result);
    }

}