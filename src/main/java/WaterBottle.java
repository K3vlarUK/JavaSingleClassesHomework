public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

//    Add a drink function that takes 10 from the volume each time it is called.
    public void drink(){
        this.volume -= 10;
    }

//    Create an empty function that brings the volume down to 0.
    public void emptyBottle(){
        this.volume = 0;
    }

//    Create a fill function that fills the volume back to 100.
    public void fillBottle(){
        this.volume = 100;
    }
}
