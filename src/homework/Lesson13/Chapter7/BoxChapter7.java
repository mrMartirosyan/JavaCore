package homework.Lesson13.Chapter7;

public class BoxChapter7 {
    double width;
    double height;
    double depth;

    BoxChapter7(BoxChapter7 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    BoxChapter7(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    BoxChapter7 (){
        width = -1;
        height = -1;
        depth = -1;
    }

    BoxChapter7 (double len){
        width = depth=height = len;
    }

    double volume (){
        return width*height*depth;
    }
}
