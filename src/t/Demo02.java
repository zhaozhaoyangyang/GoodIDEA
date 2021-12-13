package t;
//泛型类
public class Demo02<T> {

    private T t;

    public T get() {
        return t;
    }
    public void add(T t){
        this.t = t;
    }

    public static void main(String[] args) {
        Demo02<Integer> a = new Demo02<Integer>();
        Demo02<String> b = new Demo02<>();  //可省略
        a.add(1); //a.add(new Integer(1));
        b.add("你好");  //可省略
        System.out.println("integer类型\t" + a.get());
        System.out.println("String类型\t" + b.get());
    }

}
