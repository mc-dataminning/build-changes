import java.util.Locale;

public record hdz(alz b, String c) {
   public static final String a = "inventory";

   public hdz(alz b, String c) {
      c = a(c);
      this.b = b;
      this.c = c;
   }

   public static hdz a(alz $$0) {
      return new hdz($$0, "inventory");
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
