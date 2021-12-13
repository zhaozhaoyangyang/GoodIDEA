package file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        //test();
        //test2();
        //test3();
        //test5();
        //test6();
        //test7();
        //七太长了，没有练习，太长了！！！
    }

    public static void test() {
        //1. \代表window操作系统下一级访问路径  / 代表linux操作系统访问路径
        File file = new File("G:/云盘");
        System.out.println(file);
        //2. 创建file实例 并指定抽象路径的父路径 和子路径
        File git = new File("G：/云盘", "Git");
        System.out.println(git);
        //3. 创建file实例 并指定抽象路径的父路径 和子路径
        File file1 = new File(git, "bin");
        System.out.println(file1);

    }

    public static void test2() throws IOException /*一般在读写数据的时候会出现这种问题。*/ {
        //创建一个文件 createNewFile()
        File file = new File("E://a.txt");
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
        //创建目录  mkdir()
        File file1 = new File("E://a");
        boolean mkdir = file1.mkdir();
        System.out.println(mkdir);
        //创建多级目录
        File file2 = new File("E://b//c");
        boolean mkdir1 = file2.mkdirs();
        System.out.println(mkdir1);
    }

    //这个不懂？？？？？？？？？？待解决
    public static void test3() throws IOException {
        //相对路径
        File file = new File("E//a.txt");
        boolean newFile = file.createNewFile();
        //System.out.println(newFile);
        //绝对路径
        File file1 = new File("E://b//c");
        boolean newFile1 = file1.createNewFile();
        //System.out.println(newFile1);

    }

    public static void test5() throws IOException {
        //删除文件
        File file = new File("E://a.txt");
        file.createNewFile();
        System.out.println(file.delete());
        //删除目录
        File file1 = new File("E:d");
        file1.mkdir();
        file1.delete();
        //
        File file2 = new File("E://aaa//ccc//bbb");
        file2.mkdirs();
        file2.delete();//只会删除bbb
        //file2.getParentFile().getParentFile().delete(); 实测没用
        System.out.println(file2);

    }

    public static void test6() throws  IOException {
        File file = new File("E:\\1\\2\\3");
        file.mkdirs();
        file.renameTo(new File("E:\\1\\2\\0"));//只能更改最后一个文件夹
        //修改文件名
        File file1 = new File("E://x.txt");
        file1.createNewFile();
        file1.renameTo(new File("E://b.txt"));
        //剪切操作
        file1.renameTo(new File("E://1//b.txt"));
    }
    public static void test7() throws IOException {
        File file = new File("c://a.txt");
        file.delete();
        //1.以e开头开头的方法
        //1.1判断file是否存在
        boolean exists = file.exists();
        System.out.println(exists);
        //2.以is开头的方法
        //2.1是否是绝对路径
        System.out.println(file.isAbsolute());
        //2.2是否是目录
        System.out.println(file.isDirectory());
        //2.3是否是文件
        System.out.println(file.isFile());
        //2.4是否是隐藏文件
        System.out.println(file.isHidden());
        //3.以can开头的方法
        //3.1 是否是可以执行的文件
        System.out.println(file.canExecute());
        //3.2是否是可读文件
        System.out.println(file.canRead());
        //3.3是否是可写文件
        System.out.println(file.canWrite());
        //4.以get开头的方法
        File fi = new File("c:\\");
        //4.1获得绝对路径 String类型
        System.out.println(fi.getAbsolutePath());
        //4.2获得剩余空间字节
        System.out.println(fi.getFreeSpace()/(double)(1024*1024*1024));
        //4.3获得文件或者目录的名字
        File file2  = new File("c:\\aa");
        System.out.println(file2.getName());
        //4.4获得当前路径
        System.out.println(fi.getPath());
        //4.4 当前路径总共空间大小 单位字节
        System.out.println(fi.getTotalSpace()/(double)(1024*1024*1024));
        //4.5 获得绝对路径 返回值是File类型
        System.out.println(fi.getAbsoluteFile());
        //4.6获得父路径返回值file
        System.out.println(fi.getParentFile());
        //4.7获得绝对路径返回字符串
        System.out.println(fi.getParent());
        //5.以l开头的方法
        //5.1返回的是当前路径的子目录 返回值是字符串数组
        String[] list = fi.list();
        for(String str : list) {
            System.out.println(str);
        }
        //5.2返回当前路径的子目录返回值是File[]
        File[] files = fi.listFiles();
        for(File f : files) {
            System.out.println(f);
        }
        //5.3 返回当前路径的最后修改时间
        System.out.println(
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").
                        format(new Date(fi.lastModified())));
        File file4 = new File("c:\\aa.txt");
        //5.4返回当前文件内容的字节大小
        System.out.println(file4.length());
    }

}
