package day054.tasks;

public class Ball {

    // Task 6
    private double radius;
    private String color;
    private boolean hasPattern;

    // Task 8
    public Ball(double radius, String color, boolean hasPattern) {
        setRadius(radius);  // Task 11
        setColor(color);    // Task 11
        this.hasPattern = hasPattern;
    }
    public Ball() {
        this(1.0,"Black",false);  // Task 12
    }

    // Task 7
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (radius<1.0) radius = 1.0;   // Task 9
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        if (color==null || color.isEmpty() || color.isBlank()) color = "Black";  // Task 10
        this.color = color.trim();
    }

    public boolean isHasPattern() {
        return hasPattern;
    }
    public void setHasPattern(boolean hasPattern) {
        this.hasPattern = hasPattern;
    }

    // Task 13
    public double getVolume(){
        return ((double)4/3)*Math.PI*Math.pow(radius,3);
    }

    // Task 14
    @Override
    public String toString() {
        return String.format("Ball(r:%2.1f - v:%4.1f)",getRadius(),getVolume());
    }
}
