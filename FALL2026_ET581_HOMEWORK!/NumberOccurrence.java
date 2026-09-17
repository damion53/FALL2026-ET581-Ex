public class NumberOccurrence {
    public static void main(String[] args){
        String text = "one two one two one";
        int first = text.indexOf("one");
        int second = text.indexOf("one", first + 1);

        System.out.println(second);

    }
   
}
