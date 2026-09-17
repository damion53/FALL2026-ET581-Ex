public class WordCheck {
    public static void main(String[] args){
        String word = "banana";
        boolean isBetween = (word.compareToIgnoreCase("apple") >= 0) && (word.compareToIgnoreCase("mango") <= 0);
        System.out.println(isBetween);
    }
   
}
