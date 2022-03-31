import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 24/04/20.
 */
public class ClassTest {
    Class c;
    @Before
    public void setup() throws Exception{
       c= new Class();
        System.out.print("this method is running hgggod");

    }



    @Test
    public void makeSure2and2is4(){
        int result = c.sum(2,2);
        assertEquals(4,result);
    }


    @Test
    public void makeSure7and3is10(){
        int result = c.sum(7,3);
        assertEquals(10,result);
    }

    @Test
    public void makeSure12and3is4(){
        int result = c.divide(12,3);
        assertEquals(4,result);
    }

    @Test(expected = ArithmeticException.class)
    public void makeSure12andd3is4(){
        int result = c.divide(12,0);
        assertEquals(4,result);

    }
    @Test
    public void makeSure60andd3isf(){
        char result = c.StudentGrade(101);
        assertEquals('g',result);
}}