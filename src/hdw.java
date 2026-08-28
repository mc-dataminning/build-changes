import java.util.Locale;

public record hdw(alp b, String c) {
   public static final String a = "inventory";

   public hdw(alp b, String c) {
      c = a(c);
      this.b = b;
      this.c = c;
   }

   public static hdw a(alp $$0) {
      return new hdw($$0, "inventory");
   }

   private static String a(String $$0) {
      return $$0.toLowerCase(Locale.ROOT);
   }

   public String a() {
      return this.c;
   }

   @Override
   public String toString() {
      return this.b + "#" + this.c;
   }
}
