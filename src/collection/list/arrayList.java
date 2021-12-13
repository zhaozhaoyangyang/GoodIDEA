package collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("你好");
        strings.add("嘟嘟");
        strings.add("嘀嘀");


        ArrayList<Integer> Integer = new ArrayList<>(); //存放整数类型·
        ArrayList<Character> characters = new ArrayList<>(); //存放字符类型·
        /**
         * 加get(0) 数字代表下标 获取
         * set(index,值) 修改
         * remove(index)   删除
         * size()  计算大小
         * for  可以迭代（每一次结果会作为下一次值）
         * 不加就是数组
         */
        //System.out.println(strings);
        //System.out.println(strings.get(0));
        //System.out.println(strings.set(1,"世界"));
        //System.out.println(strings.remove(2));
        //System.out.println(strings.size());
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
        System.out.println("============================");
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("============================");
        Iterator<String> it = strings.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        /**基本类型   包装引用类型
         * boolean	Boolean
         * byte	    Byte
         * short	Short
         * int	    Integer
         * long   	Long
         * float	Float
         * double	Double
         * char	    Character
         * BigInteger、BigDecimal 用于高精度的运算，BigInteger 支持任意精度的整数，也是引用类型，但它们没有相对应的基本类型
         */
    }
}
