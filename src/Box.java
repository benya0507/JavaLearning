import java.util.function.Function;
public class Box<T> {
    T content;
    public Box(T content) {
        this.content = content;
    }
    public T getContent() {
        return content;
    }

    public <R> R transform(Function<T, R> function)  {
        return function.apply(content);
    }
}
