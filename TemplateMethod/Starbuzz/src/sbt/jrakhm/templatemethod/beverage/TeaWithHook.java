package sbt.jrakhm.templatemethod.beverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author rassoll
 * @created 08.06.2017
 * @$Author$
 * @$Revision$
 */
public class TeaWithHook extends CaffeineBeverageWithHook
{
    @Override
    void brew()
    {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments()
    {
        System.out.println("Adding Lemon");
    }

    @Override
    boolean customerWantsCondiments()
    {
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private String getUserInput()
    {
        String answer = null;

        System.out.print("Would you like lemon with your tea (y/n)? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            answer = in.readLine();

        }
        catch (IOException e)
        {
            System.err.println("IO error trying to read your answer");
        }
        if(answer == null)
        {
            return "no";
        }

        return answer;
    }
}
