import java.util.Objects;

public class BoxFactory {public static <T extends Fruit> Box<T> getBox(Class<T> clazz) {
    if (Objects.equals(clazz, Fruit.class)) { //запрещаем создавать экземпляры, параметризированные базовым классом
        throw new IllegalArgumentException("Wrong class");
    }
    return new Box<>();
}
}

