package collection.list;

import java.util.*;

public class iteratoe {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("小明");
        list.add("小红");
        list.add("小黑");
        System.out.println(list.size());
        System.out.println(list.toString());
        ListIterator a = list.listIterator();
        while (a.hasNext()) {
            System.out.println(a.next());
        }
        while(a.hasPrevious()){
            System.out.println(a.previous());
        }
        /**
         * l使用范围不同，Iterator可以应用于所有的集合，Set、List和Map和这些集合的子类型。而ListIterator只能用于List及其子类型。
         * lListIterator有add方法，可以向List中添加对象，而Iterator不能。
         * lListIterator和Iterator都有hasNext()和next()方法，可以实现顺序向后遍历，但是ListIterator有hasPrevious()和previous()方法，
         * 可以实现逆向（顺序向前）遍历。 Iterator不可以。
         * lListIterator可以定位当前索引的位置，nextIndex()和previousIndex()可以实现。Iterator没有此功能。
         * l都可实现删除操作，但是ListIterator可以实现对象的修改，set()方法可以实现。Iterator仅能遍历，不能修改。
         *
         */
    }
}
