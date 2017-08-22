package Array;

public class MaxOfArray {
    public static void main(String[] args){
        int[] arr = new int[10];

        /**
         * 为数组每个元素赋予0-99的随机数值
         */
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*100);
        }

        /**
         * 遍历数组每个元素的值
         */
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        /**
         * 找出数组中的最大值
         */
        int max = arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("数组中的最大值是：" + max);

        int[] a1 = new int[11];
        System.arraycopy(arr, 0, a1, 0, 5);
        /**
         * 遍历a1数组
         */
        System.out.println("数组1内容：");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("你的程序消耗了"+(endTime - startTime)+ "毫秒的执行时间！");
    }
}
