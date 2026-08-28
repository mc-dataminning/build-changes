import java.util.Locale;

public record gyx(alb b, String c) {
   public static final String a = "inventory";

   public gyx(alb b, String c) {
      c = a(c);
      this.b = b;
      this.c = c;
   }

   public static gyx a(alb $$0) {
      return new gyx($$0, "inventory");
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
