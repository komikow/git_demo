package by.it.academy;

import static org.junit.Assert.assertTrue;

import by.it.academy.printing.PrintService;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    public static void main(String[] args) {
        PrintService printService = new PrintService();
        printService.print();
    }
}
