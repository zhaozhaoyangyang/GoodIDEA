package first;

public class Demo01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i + " ");
        }
        System.out.println("========最大======");
        int nu = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>nu);
            nu = arr[i];
        }
        System.out.println(nu);
        System.out.println("========高--->低======");

        long i = 2000000000000L;
        int a = (int) i;
        System.out.println(a);

        System.out.println("====高--->低==========");

        int b = 128;
        byte c = (byte) b;
        System.out.println(c);

        System.out.println("====低--->高==========");
        byte d = 127;
        int e = (int) d;
        System.out.println(e);

    }

}
