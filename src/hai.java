import java.util.Locale;

public record hai(alh b, String c) {
   public static final String a = "inventory";

   public hai(alh b, String c) {
      c = a(c);
      this.b = b;
      this.c = c;
   }

   public static hai a(alh $$0) {
      return new hai($$0, "inventory");
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
