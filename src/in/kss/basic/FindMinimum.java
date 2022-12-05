package in.kss.basic;


public class FindMinimum {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,-154,45,-65};
        int result = findingMinimum( array);
        System.out.println("Result : "+result);
    }
    public static int findingMinimum(int[] array) {
        if(array.length==0){
            return -1;
        }
        int min = array[0];

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < min) {
//                min = array[i];
//            }
//        }

        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
