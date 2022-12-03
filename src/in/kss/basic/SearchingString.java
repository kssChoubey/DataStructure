package in.kss.basic;
import java.util.Arrays;



public class SearchingString {
    public static void main(String[] args) {
        String name = "Krishna Swaroop Shantanu";
       char target = ' ';
//        int result = searchChar(name,target);
        boolean result = searchChar(name,target);
        System.out.println("name : "+ Arrays.toString(name.toCharArray()));
        System.out.println("Result : "+ result);
    }
    public static boolean searchChar(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }



//    public static boolean searchChar(String name, char target){
//        if(name.length()==0){
//            return false;
//        }
//        for( char ch : name.toCharArray())
//            return true;
//
//        return false;
//    }

//    public static int searchChar(String name, char target){
//         if(name.length()==0){
//             return -1;
//         }
//
//        for (int i = 0; i < name.length(); i++) {
//            if (name.charAt(i)==target) {
//                return i;
//            }
//
//        }
//        return -1;
//    }
}
