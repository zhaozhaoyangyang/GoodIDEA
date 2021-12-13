package Thir;

public class Demo01 {
//    private int a = 1;
//    private int b = 2;
    public void num(int a , int b) {
        if(a+b>5){
            System.out.println("嘿嘿");
        }else{
            System.out.println("哈哈");
        }

    }

    public static void main(String[] args) {
        new Demo01().num(1,2);
    }
}
