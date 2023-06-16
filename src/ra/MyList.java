package ra;

public abstract class MyList<E,T>{
    public abstract boolean save(E e);
    public abstract boolean delete(T t);
    public abstract E findById(T t);

}
