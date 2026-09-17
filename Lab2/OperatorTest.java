public class OperatorTest {
    public static void main(String [] args){
        int b = 2;
        System.out.println(a == b);
        boolean result = a != b;
        System.out.println(result);
        System.out.println(!result); // not operator

        boolean x = true, y = false;
        System.out.println( x && y ); // and
        System.out.println( x || y ); // or

        //String compare
        String str1 = "abc";
        String str2 ="bcd";
        boo lean strEqual = str1.equals(str2);
        System.out.println("strEqual: " + strEqual);
        
    }
}