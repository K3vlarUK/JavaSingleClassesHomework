public class Printer {

    private int paper;
    //    Add a toner volume property to the class.
    private int tonerVolume;

    public Printer(int paper, int tonerVolume){
        this.paper = paper;
        this.tonerVolume = tonerVolume;
    }

    public int remainingPaper(){
        return this.paper;
    }

    public int remainingToner(){
        return this.tonerVolume;
    }

//    Add a method to print that takes in a number of pages and number of copies.

    public void printDocument(int pages, int copies){
        int totalPagesRequired = pages * copies;
        //    The print method will only run if the printer has enough paper. If it runs it will reduce the value of the paper left by number of copies * number of pages.
        if (totalPagesRequired <= this.paper && pages <= this.tonerVolume) {
            this.paper -= totalPagesRequired;
            //    Modify the printer so that it reduces the toner by 1 for each page printed.
            this.tonerVolume -= pages;
        }
    }



}
