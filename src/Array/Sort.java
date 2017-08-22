package Array;

public class Sort {
    public static void main(String[] args) {
        /**
         * 冒泡
         */
        int[] arr = new int[20];
        System.out.println("排序前顺序：");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
            System.out.print(arr[i]+"-");
        }
        //排序
        System.out.println("排序后顺序：");
        for (int i = 0; i < arr.length - 1;i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }

        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"-");
        }



    }
}
