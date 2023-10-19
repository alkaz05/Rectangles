public class Rectangle {
    double w, l;

    public Rectangle(double w, double l) {
        this.w = w;
        this.l = l;
    }

    public double getArea(){
        return w*l;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "" + w +
                " x " + l +
                '}';
    }
}
