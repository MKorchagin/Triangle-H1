package logic;/* Create a class that describes a triangle. It should be defined by using three points which describe the vertexes of this triangle.
   Create a method that is able to calculate the are of the triangle:
                it should return a double value (an area) and
                it should throw and exception if the area could not be calculated (for example if the triangle is self-intersecting).
   Create a simple class which will use the triangle class.*/

public class Triangle {

    public void start () {
        double x1 = UIUtils.inputNumber("Please, enter X coordinate for first point: ");
        double y1 = UIUtils.inputNumber("Please, enter Y coordinate for first point: ");
        double x2 = UIUtils.inputNumber("Please, enter X coordinate for second point: ");
        double y2 = UIUtils.inputNumber("Please, enter Y coordinate for second point: ");
        double x3 = UIUtils.inputNumber("Please, enter X coordinate for third point: ");
        double y3 = UIUtils.inputNumber("Please, enter Y coordinate for third point: ");
System.out.println(" ");
        System.out.println("First point: "+x1+"; "+y1);
        System.out.println("Second point: "+x2+"; "+y2);
        System.out.println("Third point: "+x3+"; "+y3);

        //The area - formula from https://www.mathopenref.com/coordtrianglearea.html

        double area = Math.abs(((x1*(y2-y3)) + (x2*(y3-y1)) + (x3*(y1-y2)))/2);
System.out.println(" ");
        if (area == 0) System.out.println("Sorry, but this is not the triangle. Please, try again.");
        else System.out.println("Area of the triangle = " +area);
    }
}
