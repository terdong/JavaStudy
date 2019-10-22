package day15.generic;

public class GenericOperator<T> {
    public T t;

    public GenericOperator(T t){
        this.t = t;
    }

    public T getT(){
        return t;
    }
}
