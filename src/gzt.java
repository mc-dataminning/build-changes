import java.util.Locale;

public record gzt(ale b, String c) {
   public static final String a = "inventory";

   public gzt(ale b, String c) {
      c = a(c);
      this.b = b;
      this.c = c;
   }

   public static gzt a(ale $$0) {
      return new gzt($$0, "inventory");
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
