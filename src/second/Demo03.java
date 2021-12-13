package second;

public class Demo03 {
    /////implements  关键字
    public static void main(String[] args) {

    }
    public interface A{
        public void eat();
    }

    public interface B{
        public void eat();
    }
    public  class C implements A,B{
        public void eat() {

        }
    }

}
