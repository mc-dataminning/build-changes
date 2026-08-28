import java.util.Locale;

public record gss(akr b, String c) {
   public static final String a = "inventory";

   public gss(akr b, String c) {
      c = a(c);
      this.b = b;
      this.c = c;
   }

   public static gss a(String $$0, String $$1) {
      return new gss(akr.b($$0), $$1);
   }

   public static gss a(akr $$0) {
      return new gss($$0, "inventory");
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
