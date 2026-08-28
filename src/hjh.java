import java.util.Locale;

public record hjh(ald a, String b) {
   public hjh(ald a, String b) {
      b = a(b);
      this.a = a;
      this.b = b;
   }

   private static String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }

   public String a() {
      return this.b;
   }

   @Override
   public String toString() {
      return this.a + "#" + this.b;
   }

   public ald b() {
      return this.a;
   }

   public String c() {
      return this.b;
   }
}
