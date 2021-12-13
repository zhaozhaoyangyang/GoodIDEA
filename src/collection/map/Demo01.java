package collection.map;

import java.util.HashMap;

public class Demo01 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        //添加的是键值对，put
        hashMap.put(0, "小红");
        hashMap.put(1, "小花");
        hashMap.put(2, "小明");
        //System.out.println(hashMap.size());
        System.out.println(hashMap);
        //使用 get(key) 方法来获取 key 对应的 value:
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.remove(2));
        //Object clone = hashMap.clone();
        // System.out.println(clone);  clone
        //将指定键值对插入
        hashMap.putIfAbsent(18,"平");
        System.out.println(hashMap);
        System.out.println("====获取 key，用keySet(),get(key) 获取对应的 value，如果你只想获取 value，可以使用 values() 方法。=================");
        for (Integer integer : hashMap.keySet()) {
            System.out.println("key:" + integer +"\t"+ "value" + hashMap.get(integer));
        }
        System.out.println("=========只获取values============");
        for (String value : hashMap.values()) {
            System.out.println(value);
        }
    }
}
