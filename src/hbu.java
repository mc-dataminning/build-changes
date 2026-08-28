import java.util.Locale;

public record hbu(alj b, String c) {
   public static final String a = "inventory";

   public hbu(alj b, String c) {
      c = a(c);
      this.b = b;
      this.c = c;
   }

   public static hbu a(alj $$0) {
      return new hbu($$0, "inventory");
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
