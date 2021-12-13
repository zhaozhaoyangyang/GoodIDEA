package first;

public class Demo02 {
    public static void main(String[] args) {
        array(new int[]{1,2,3,4,5});
    }

    public static void array(int[] num){
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }

    }
        //反转不懂
    public static int[] arr(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0, j = result.length; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        System.out.println(result);
        return result;

    }
}
