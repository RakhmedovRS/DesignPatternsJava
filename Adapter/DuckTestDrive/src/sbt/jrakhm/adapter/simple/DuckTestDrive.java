package sbt.jrakhm.adapter.simple;

/**
 * @author rassoll
 * @created 06.06.2017
 * @$Author$
 * @$Revision$
 */
public class DuckTestDrive
{
    public static void main(String[] args)
    {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("Turkey says ...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says ...");
        testDuck(duck);

        System.out.println("\nTurkeyAdapter says ...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck)
    {
        duck.quack();
        duck.fly();
    }

}
