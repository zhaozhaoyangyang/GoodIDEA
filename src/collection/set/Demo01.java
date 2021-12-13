package collection.set;

import java.util.HashSet;

public class Demo01 {
    public static void main(String[] args) {
        HashSet site = new HashSet();
        site.add("小花");
        site.add("小红");
        site.add("小明");
        //site.add("小明");  重复的元素不会添加
        System.out.println(site.size());
        System.out.println(site.toString());
        System.out.println(site.contains("小绿") + "存不存在");
        System.out.println(site.remove("小明" + "remove删除"));
        System.out.println(site.isEmpty() + "判断是否为空");
        System.out.println(site.toString());
        site.clear();
        System.out.println(site.toString()); //删除的是集合中的地址，对象还在
    }
}
