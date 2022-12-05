package in.kss.basic;

public class SearchInRange {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,54,45,65};
        int target = 45;
        int result = findInrange( array,target,1, 8);
        System.out.println("Result : "+result);
    }
    public static int findInrange(int[] array,int target,int startRange, int endRange){
        if(array.length==0){
            return -1;

        }
        for (int i = startRange; i < endRange; i++) {
            if(array[i]==target){
                return i;

            }

        }
        return -1;
    }
}
