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

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    Box(){
        width=-1;
        height=-1;
        depth=-1;
    }

    Box (double len){
        width=height=depth=len;
    }

}
