package day054.kargo;

public class Box {

    private double width;
    private double height;
    private double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box() {
        this(50,50,80);
    }

    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public double getDepth() {
        return depth;
    }

    public double getVolume(){
        return width*height*depth;
    }

    @Override
    public String toString() {
        return String.format("Box [%5.2f x %5.2f x %5.2f]",width,height,depth);
    }
}
