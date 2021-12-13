package stream;

import java.io.*;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        //读取控制台输入
       // char a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        do {
//            a= (char)br.read();  //do必须执行一次
//            System.out.println(a);
//        }while (a != 'q'); //输入字符
        String str ;
        System.out.println("this is a dog");
        System.out.println("this is a cat");
        do {
            str = br.readLine();
            System.out.println(str);
        }while (!str.equals("cat")); //输入字符串
    }
}
