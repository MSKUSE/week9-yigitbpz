public class Rectangle extends Shape{

    private int sideA, sideB;

    public Rectangle(){
        super();
    }
    public Rectangle(String color, int sideA, int sideB){
        super(color);
        this.sideA = 1;
        this.sideB = 1;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public double perimeter() {
        return 2*(sideA + sideB);
    }

    @Override
    public String toString() {
        return super.toString() +
                " Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) obj;
        return sideA == rectangle.sideA && sideB == rectangle.sideB;
    }

}
