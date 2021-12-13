package collection.list;

import java.util.LinkedList;

/**
 * 以下情况使用 ArrayList :
 * 频繁访问列表中的某一个元素。
 * 只需要在列表末尾进行添加和删除元素操作。
 *
 * 以下情况使用 LinkedList :
 * 你需要通过循环迭代来访问列表中的某些元素。
 * 需要频繁的在列表开头、中间、末尾等位置进行添加和删除元素操作。
 */
public class linkedList {
    public static void main(String[] args) {
        //LinkedList<E> list = new LinkedList(Collection<? extends E> c); // 使用集合创建链表
        LinkedList<String> llit = new LinkedList<String>();
        llit.add("小花");
        llit.add("小丽");
        llit.add("小明");
        //列表开头addFirst，列表结尾addLast
        llit.addFirst("棒棒");
        llit.addLast("牛叔");
        //移除列表开头结尾元素 removeFirst,removeLase
        llit.removeFirst();
        llit.removeLast();
        //获取列表头尾 getFirst,getLast
        llit.getFirst();
        llit.getLast();
        System.out.println(llit.size());
        System.out.println(llit.toString());
    }
}
