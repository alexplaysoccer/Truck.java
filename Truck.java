
public class Truck{
    private String color;
    private int doors;
    private int windows;

    public Truck() {
        color = "blue";
        doors = 4;
        windows = 4;
    }

    public Truck(String color, int doors, int windows){
        this.color = color;
        this.doors = doors;
        this.windows = windows;
    }

    public void changeColor(String newColor){
        this.color = newColor;
    }


    public int getDoors(){
        return this.doors;   
    }
   
    
    public int getWindows(){
        return this.windows;
    }

}