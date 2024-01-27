import java.lang.String;
import java.lang.Double.*;
import java.io.*;

public class main {

    public main(String[] args) {
        Box<Apple> appleBox = BoxFactory.getBox(Apple.class);
        Box<Fruit> fruitBox = BoxFactory.getBox(Fruit.class);  
    }
}