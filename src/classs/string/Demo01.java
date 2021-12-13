package classs.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        //new Demo01().test1();
        //new Demo01().test2();
        //new Demo01().test3();
        //new Demo01().test4();
        //new Demo01().test5();
        /*try {
            new Demo01().test6();
        } catch (UnsupportedEncodingException e) {
            System.out.println("抛出异常" + e);
        }*/
        //new Demo01().test7();
        //new Demo01().test8();
        //去头尾空格
        /*String s = new Demo01().myTrim(" 123 ");
        System.out.println(s);
        */
        /*
        反转
        String a = "this is a dog";
        String all = reverse1(a);
        System.out.println(all);
        */
        /*
        a在b出现的次数
        String a = "a";
        String b = "asdasdasd";
        int num = num(b, a);
        System.out.println(num);
        */
        String  a = "a";
        String b = "asdasdasd";
        Demo01 aa = new Demo01();
        int c = aa.num(b,a);
        System.out.println(c);


    }


    public void test1() {
        String s = "Hello,World!";
        System.out.println(s.length());
        System.out.println(s.charAt(4)); //下标
        System.out.println(s.isEmpty());   //是否为空字符串
        System.out.println(s.toLowerCase());  //全部大写
        System.out.println(s.toUpperCase()); //全部小写
        System.out.println(s.trim());   //去空格
        String m = "Hello,World!";
        System.out.println(m.equals(s));  //比较字符串内容是否相同
        System.out.println(s.concat("111")); //末尾添加
        System.out.println(s.compareTo(m));  //比大小，相等返回0，否则负数
        System.out.println(s.substring(0));  //截取字符串
        System.out.println(s.substring(0, 5));
        System.out.println("========================================================" + "\n");
    }

    public void test2() {
        String str = "notatall";
        System.out.println(str.endsWith("ll")); //测试此字符串是否以指定的后缀结束
        System.out.println(str.startsWith("no")); //测试此字符串是否以指定的前缀开始
        System.out.println(str.startsWith("at", 3));//：测试此字符串从指定索引开始的子字符串是否以指定前缀开始
        System.out.println("========================================================" + "\n");

    }

    public void test3() {
        String s2 = "helloword";
        System.out.println(s2.length());
        System.out.println(s2.contains("o"));//true   包含
        System.out.println(s2.indexOf("h"));//0  第一次出现索引
        System.out.println(s2.indexOf("o", 5));//6 第五位之后出现的第一个o
        System.out.println(s2.lastIndexOf("o"));//6
        System.out.println(s2.lastIndexOf("l", 8));//3  第八位之前的字符串里，最后一次出现的次数
    }

    public void test4() {
        String s = "你好";
        String name = s.replace("你", "我"); //替换
        System.out.println(name);

        String ss = "1hello212world456mysql123";  //全部替换
        String sss = ss.replaceAll("\\d+", ",").replaceAll("^,|,$", "");
        System.out.println(sss); //第一个杠是1 212 456 123  第二个杠是1 212的2 456的4 123的1

        String str = "13245";
        boolean isTrue = str.matches("\\d+"); //查看是否全部由数字组成
        System.out.println(isTrue);

        String str1 = "hello|world|java";
        String str2 = "hello.java.world";
        String[] arr = str1.split("\\|"); //分割字符串
        for (String s1 : arr) {
            System.out.print(s1 + "\t");
        }
        System.out.println();
        String[] arr1 = str2.split("\\.");
        for (String s1 : arr1) {
            System.out.print(s1 + "\t");
        }

    }

    //转换
    public void test5() {
        String str = "123";      //数字转字符串
        int a = Integer.parseInt(str); //String -->int  Integer.parseInt  Integer.valueOf().intValue()
        System.out.println(a + "\t" + "int");

        int b = 123;               //字符串转数字
        String str1 = String.valueOf(b); //int-->string  b+""  String.valueOf()  integer.toString()
        System.out.println(str1 + "\t" + "String");
        System.out.println(str1.equals("123"));

        //String 与字符数组的转换
        String c = "hello";
        char[] chars = c.toCharArray();  //分解字符串
        for (char aChar : chars) {
            System.out.print(aChar + "\t");
        }
        System.out.println();

       /* 1,   int[] aaa = new int[3];
          1,1  int[] aaa = new int[]{1,2,3};
          2,   int arr1[];
               data = new int[0];
        */
        char[] array = new char[]{'h', 'e', 'l', 'l', 'o'};  //合并字符
        String d = new String(array);
        System.out.println(d);
    }

    //编码，解码
    public void test6() throws UnsupportedEncodingException {
        //编码
        String str = "你好Java";
        byte[] arr = str.getBytes();   //getBytes() 默认·
        System.out.println(Arrays.toString(arr));//[-28, -67, -96, -27, -91, -67, 74, 97, 118, 97]

        byte[] arr1 = str.getBytes("gbk");  //"gbk"
        System.out.println(Arrays.toString(arr1));//'gbk' [-60, -29, -70, -61, 74, 97, 118, 97]

        //解码
        String str1 = new String(arr);  // 默认
        System.out.println(str1 + "\t" + "str1"); //你好Java	str1

        String str2 = new String(arr1);
        System.out.println(str2);   // ���Java 解码错误，出现中文乱码,原因：编码和解码不一致

        String str3 = new String(arr1, "gbk"); //你好Java	str1
        System.out.println(str3);
    }

    //.String -->StringBuffer、StringBuilder: 调用StringBuffer、StringBuilder构造器
    public void test7() {
        String str = "hello";
        StringBuffer a = new StringBuffer(str);
        System.out.println(a);  //hello

        StringBuilder b = new StringBuilder(str);
        System.out.println(b);  //hello

        a.append("haha");
        System.out.println(a);  //StringBuffer是可变的字符串，多线程，更安全，不会产生新对象

        b.append("nana");
        System.out.println(b);
    }

    //.StringBuffer、StringBuilder -->String:
    public void test8() {
        StringBuffer a = new StringBuffer("hello, StringBuffer");
        System.out.println(a);
        StringBuilder b = new StringBuilder("hello, StringBuilder");
        System.out.println(b);
        System.out.println("=====================================");
        String str = new String(a);
        System.out.println(str);
        String str1 = new String(b);
        System.out.println(str1);
        System.out.println("=====================================");
        System.out.println(a.toString());
        System.out.println(b.toString());
    }

    //trim去头尾空格
    public String myTrim(String str) {
        if (str != null) {
            int start = 0;
            int end = str.length() - 1;

            while (start < end && str.charAt(start) == ' ') {
                start++;
            }
            while (start < end && str.charAt(end) == ' ') {
                end--;
            }
            if (str.charAt(start) == ' ') {
                return "";
            }
            return str.substring(start, end + 1);
        }
        return null;
    }
    //反转数组 //
    public static String reverse1(String str) {
        if (str != null) {
            char[] arr = str.toCharArray();
            for (int i = 0, j = str.length()-1; i < j; i++, j--) {
                char num = arr[i];
                arr[i] = arr[j];
                arr[j] = num;
            }
            return new String(arr);
        }
        return null;

    }

    //字符串出现次数
    public  int num(String max , String min){
        if(max.length()>=min.length()){
            int count = 0;
            int index = 0;
            while((index = max.indexOf(min,index)) != -1){
                index += min.length();
                count++;
            }
            return count;

        }else{
            return 0;
        }

    }

}
