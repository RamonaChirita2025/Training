public class Square {
    public int side;

//    Constructor
    public Square (int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    public int getArea(){
        return side * side;
    }
}
