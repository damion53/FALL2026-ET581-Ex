public class AppleString {
   public AppleString() {
   }

   public static void main(String[] var0) {
      String var1 = "I like Apple pie";
      String var2 = var1.toLowerCase();
      int var3 = var2.indexOf("apple");
      System.out.println(var1.substring(var3));
   }
}
