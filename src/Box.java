public class Box<T> {
    T content;
    public Box(T content) {
        this.content = content;
    }
    public T getContent() {
        return content;
    }

    /*public T transform(Function<T, R>)  {
        return content;
    }*/
}
