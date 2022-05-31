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

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
