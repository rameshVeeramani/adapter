package org.adapater;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DummyDuck dd = new DummyDuck();
        TestDuck(dd);

        Mduck ddd = new Mduck();
        TestDuck(ddd);


        Duck td = new TurkeyAdapater(new Turkey());
        TestDuck(td);



        System.out.println( "Hello World!" );
    }

    public static boolean TestDuck(Duck d) {
        d.fly();
        d.quack();
        return  true;
    }
}
