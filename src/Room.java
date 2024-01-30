public class Room {
    public int length;
    public int width;
    public int height;
    public int windows;
    public int doors;

    public Room(){
        this.length = 0;
        this.width = 0;
        this. height = 0;
        this. windows = 0;
        this. doors = 0;
    }

    //getter and setter for length
    public void setLength(int length){
        this.length = length;
    }

    public int getLength(){
        return this.length;
    }

    //getter and setter for width
    public void setWidth(int width){
        this.width = width;
    }

    public int getWidth(){
        return this.width;
    }

    //getter and setter for height
    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return this.height;
    }

    //getter and setter for windows
    public void setWindows(int windows){
        this.windows = windows;
    }

    public int getWindows(){
        return this.windows;
    }

    //getter and setter for doors
    public void setDoors(int doors){
        this.doors = doors;
    }

    public int getDoors(){
        return this.doors;
    }

    public String paint(){
        int wallsCeilArea = (2 * this.width * this.height) + (2 * this.length * this.height) + (this.width * this.length);
        int noPaint = (this.windows * 15) + (this.doors * 21);
        int paintArea = wallsCeilArea - noPaint;
        int gallons = paintArea / 350;
        double quarts = 0;
        if(paintArea%350!=0){
            quarts = (paintArea%350)/87.5;
        }
        return gallons + " gallons and " + String.format("%.2f",quarts) + " quarts";
    }
}
