package collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class test {
    public static void main(String[] args) {
        Student s1 = new Student("小王",10);
        Student s2 = new Student("小黑",11);
        Student s3 = new Student("小白",12);
        Collection collection = new ArrayList();
        collection.add(s1);
        collection.add(s2);
        collection.add(s3);
//        collection.remove(s1);
        collection.remove(new Student("小王",10));  //这个是新建的，和上面的没关系
        //collection.clear();  //清空的是集合里面的地址，对象还存在
        System.out.println(collection.size());
        System.out.println(collection.toString());
        Iterator it = collection.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
