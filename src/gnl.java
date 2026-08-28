import java.util.Locale;

public enum gnl {
   a("chat"),
   b("skin"),
   c("username");

   private final String d;

   private gnl(final String $$0) {
      this.d = $$0.toUpperCase(Locale.ROOT);
   }

   public String a() {
      return this.d;
   }
}
