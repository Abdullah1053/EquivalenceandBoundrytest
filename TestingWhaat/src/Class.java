import java.util.Scanner;

/**
 * Created by user on 24/04/20.
 */

public class Class {
    public int sum(int a,int b){
        return (a+b);
    }

    public int divide(int a,int b){
        if(b==0)
            throw new ArithmeticException("ypu cant divide over 0 man !!!!!???");

        return (a/b);
    }
    public char StudentGrade(int grade){
        if (grade<0 || grade>100 )
            throw  new ArithmeticException("the numbert interd isinvalid");
        if(grade<60 && grade>0)
            return 'f';
        if(grade<80 && grade>60)
            return 'g';

        return 'e';
    }

}

