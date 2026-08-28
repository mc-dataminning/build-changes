import java.util.Locale;

public record hbj(all b, String c) {
   public static final String a = "inventory";

   public hbj(all b, String c) {
      c = a(c);
      this.b = b;
      this.c = c;
   }

   public static hbj a(all $$0) {
      return new hbj($$0, "inventory");
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
