public class ShapesClasses {

    public static void main (String [] args) {
//  For one parameter using constructors or method:
     Square square = new Square(Integer.parseInt(args [0]));
     square.setSide(Integer.parseInt(args[0]));
     System.out.println("Square area is: " + square.getArea());
     System.out.println();


//   For many parameters using constructor or method:
    for (String s:args){
      Square squareString = new Square(Integer.parseInt(s));
      squareString.setSide(Integer.parseInt(s));
      System.out.println("Square area is: " + squareString.getArea());
      System.out.println();
      }

// with parameters given from Program arguments
        double length = Double.parseDouble(args[0]);
        double width = Double.parseDouble(args[1]);
        Rectangle rectangle = new Rectangle(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
        System.out.println("The area of a rectangle having length " + length + " " + "and width " + width + " is: " + rectangle.getArea());
        System.out.println ("The perimeter of a rectangle having length " + length + " " + "and width " + width + " is: " + rectangle.getPerimeter());
        System.out.println("The diagonal of a rectangle with length "+ length+ " and width "+ width+ " is: " + rectangle.getDiagonal());
        System.out.println("The length is: " + Double.parseDouble(args[0]));
        System.out.println("The width is: " + Double.parseDouble(args[1]));
        System.out.println();

// with parameters when creating the instance
        Rectangle rectangleSecondOption = new Rectangle(5,7);
//        System.out.println("The area is: " + rectangleSecondOption.getArea());
//        System.out.println("The perimeter is: " + rectangleSecondOption.getPerimeter());
//        System.out.println("The diagonal is: " + rectangleSecondOption.getDiagonal());
        System.out.println(rectangleSecondOption);
    }
}


