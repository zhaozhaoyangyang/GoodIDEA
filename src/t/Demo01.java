package t;

public class Demo01 {
    /**
     * E - Element (在集合中使用，因为集合中存放的是元素)
     * T - Type（Java 类）
     * K - Key（键）
     * V - Value（值）
     * N - Number（数值类型）
     * ？ - 表示不确定的 java 类
     */

    public static void main(String[] args) {
        Integer[] arr ={1,2,3,4,5};
        Double[] arr1 = {1.0,2.0,3.0,4.0,5.0};
        Character[] arr2 = {'h','e','l','l','o'};
        generic(arr);
        generic(arr1);
        generic(arr2);
        System.out.println("=============================================");
        /**
         * ①d格式：用来输出十进制整数。有以下几种用法：
         *   %d：按整型数据的实际长度输出。
         *   %md：m为指定的输出字段的宽度。如果数据的位数小于m，则左端补以空格，若大于m，则按实际位数输出。
         *   %ld：输出长整型数据。
         *   f格式：用来输出实数（包括单、双精度），以小数形式输出。有以下几种用法：
         *   %f：不指定宽度，整数部分全部输出并输出6位小数。
         *   %m.nf：输出共占m列，其中有n位小数，如数值宽度小于m左端补空格。
         *   %-m.nf：输出共占n列，其中有n位小数，如数值宽度小于m右端补空格。
         * ⑧e格式：以指数形式输出实数。可用以下形式：//在实践中没有运行出来。
         *   %e：数字部分（又称尾数）输出6位小数，指数部分占5位或4位。
         *   %m.ne和%-m.ne：m、n和”-”字符含义与前相同。此处n指数据的数字部分的小数位数，m表示整个输出数据所占的宽度。
         * ⑨g格式：自动选f格式或e格式中较短的一种输出，且不输出无意义的零。 //在实践中没有运行出来。
         */
        System.out.printf("%d %d和%d中最大的值是%d\n\n",3,4,5,max(3,4,5));
        System.out.printf("%.1f %.1f和%.1f的最大值为%.1f\n\n",6.66,7.77,8.88,max(6.66,7.7,8.88) );
        System.out.printf("%s %s和%s中最大值是%s\n\n","apple","origin","brannan",max("apple","origin","brannan"));
    }

    public static <E> void generic(E[] inputArray){
        for (E e : inputArray) {
            System.out.print(e + "\t");
        }
        System.out.println();
    }
    /**
     * Comparable
     * 该类支持排序”。此外，“实现Comparable接口的类的对象”可以用作“有序映射(如TreeMap)”中的键或“有序集合(TreeSet)”中的元素，而不需要指定比较器。
     * 接口中通过x.compareTo(y)来比较x和y的大小。若返回负数，意味着x比y小；返回零，意味着x等于y；返回正数，意味着x大于y。
     * Comparable相当于“内部比较器”，而Comparator相当于“外部比较器”。
     * <T extends Comparable<? super T>>下限
     * <T extends Comparable<T>> 上限   有范围
     */
    public static  <T extends Comparable<T>> T max(T x, T y , T z ){
        T max = x;
        if(y.compareTo(max)>0){
            max = y;
        }
        if(z.compareTo(max)>0){
            max = z;
        }
        return max;
    }

}
