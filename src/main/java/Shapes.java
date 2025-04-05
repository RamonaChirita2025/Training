public class Shapes {
    public static void main(String[] args) {

        drawShapeOutline(4, 10);

        drawShapeOutline(5);

        drawShapeCorners(4, 10);

        drawShapeCorners(5);

        drawFullShape(6,9);

    }

    private static void drawShapeCorners(int height, int width) {
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                if (h == 0 && w == 0) {
                    System.out.print("*");
                } else if (h == 0 && w == width-1) {
                    System.out.print("*");
                } else if (h == height-1 && w == 0){
                    System.out.print("*");
                } else if (h == height-1 && w == width-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static void drawShapeCorners(int side) {
        drawShapeCorners(side, side);
    }

    public static void drawShapeOutline(int height, int width) {
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                if (h == 0 || h == (height - 1)) {
                    System.out.print("*");
                } else if (w == 0 || (w == width - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void drawShapeOutline(int side) {
        drawShapeOutline(side, side);
    }

        public static void drawFullShape ( int height, int width){
            for (int x = 0; x < height; x++) {
                for (int i = 0; i < width; i++) {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }











