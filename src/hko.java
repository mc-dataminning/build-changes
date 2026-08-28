import java.util.Locale;

public record hko(ale a, String b) {
   public hko(ale a, String b) {
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

   public ale b() {
      return this.a;
   }

   public String c() {
      return this.b;
   }
}
