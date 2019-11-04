import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(25, 20);
    }

    @Test
    public void paperRemaining(){
        assertEquals(25, printer.remainingPaper());
    }

    @Test
    public void tonerRemaining(){
        assertEquals(20, printer.remainingToner());
    }

    @Test
    public void canPrintOffPagesAndCopies__Success(){
        printer.printDocument(3, 2);
        assertEquals(19, printer.remainingPaper());
    }

    @Test
    public void canPrintOffPagesAndCopies__Failure(){
        printer.printDocument(8, 4);
        assertEquals(25, printer.remainingPaper());
    }

    @Test
    public void hasEnoughToner(){
        printer.printDocument(5, 1);
        assertEquals(15, printer.remainingToner());
    }

    @Test
    public void notEnoughToner(){
        printer.printDocument(24, 1);
        assertEquals(20, printer.remainingToner());
    }

}
