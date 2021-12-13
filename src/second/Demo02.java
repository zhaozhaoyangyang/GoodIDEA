package second;

public class Demo02 {
    ///////private封装
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setName("熊猫");
        boss.setAge(18);
        boss.userinfo();

    }
    static class Boss {
        private String name;
        private int age;

        public void setName(String n) {
            name = n;
        }
        public String getName() {
            return name;
        }
        public void setAge(int a) {
            if (0 < a && a < 150) {
                age = a;
            } else {
                age = 0;
            }
        }

        public int getAge() {
            return age;
        }

        public void userinfo() {
            System.out.println("姓名：" + name + " " + "年龄：" + age);
        }
    }
}
