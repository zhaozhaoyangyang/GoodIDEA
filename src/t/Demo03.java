package t;

import java.util.ArrayList;
import java.util.List;

//类型通配符
public class Demo03 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Number> numbers = new ArrayList<>();
        integers.add(1);
        strings.add("你好");
        numbers.add(218);
        test(integers);
        test(strings);
        test(numbers);

        /**
         * 因为 getUperNumber() 方法中的参数已经限定了参数泛型上限为 Number，所以泛型为 String 是不在这个范围之内，所以会报错。
         * 类型通配符下限通过形如 List<? super Number> 来定义，表示类型只能接受 Number 及其上层父类类型，如 Object 类型的实例。
         * super  继承父类  下限                            number和string同级
         */
        //test1(strings);
        test1(integers);
        test1(numbers);


    }
    //collection 下面三大接口  set   queue  list   //map  单独  待了解
    //因为test的方法是List类型的 所以 name，age，number 都可以作为这个方法的实参，这就是通配符的作用。
    public static void test(List<?> data) {
        System.out.println("data：" + data.get(0));
    }

    public static void test1(List<? extends Number> data){
        System.out.println("data：" + data.get(0));
    }

}
