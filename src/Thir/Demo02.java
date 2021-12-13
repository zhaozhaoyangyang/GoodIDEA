package Thir;

import java.io.*;

public class Demo02 {
    public static void main(String[] args) {
       /*
            只有目录名
        String fileName="G:"+File.separator;
        File f=new File(fileName);
        String[] str=f.list();
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        */
        /*有目录路径
        String fileName="G:"+File.separator;
        File f=new File(fileName);
        File[] str=f.listFiles();
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
         */
         //isDirectory  检验是否存在目录
       /* String a = "E:" + File.separator;
        File f = new File(a);
        if (f.isDirectory()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        */
            //所有文件目录，慎用！！！
        String fileName="G:"+File.separator;
        File f=new File(fileName);
        print(f);
    }
    public static void print(File f){
        if(f!=null){
            if(f.isDirectory()){
                File[] fileArray=f.listFiles();
                if(fileArray!=null){
                    for (int i = 0; i < fileArray.length; i++) {
                        //递归调用
                        print(fileArray[i]);
                    }
                }
            }
            else{
                System.out.println(f);
            }
        }
    }
}
