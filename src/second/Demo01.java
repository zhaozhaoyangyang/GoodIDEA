package second;

public class Demo01 {
    public static void main(String[] args) {
        /////////////////////继承 super  and   this
        Animals animals = new Animals();
        animals.eat();
        Panda panda = new Panda();
        panda.all();
    }
    static class Animals {
        void eat() {
            System.out.println("吃吃吃");
        }
    }

    static class Panda extends Animals {
        void eat() {
            System.out.println("熊猫");
        }
        void all() {
            this.eat();//调用自己的eat
            super.eat();//调用父类的eat
        }
    }
}
