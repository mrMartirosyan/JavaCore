package homework.Lesson11;

public class Box {
    double width;
    double height;
    double depth;

    double vol() {
        return width * height * depth;
    }

    int square(int i) {
        return i * i;
    }

    Box(double weight, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
