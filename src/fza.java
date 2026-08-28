import java.util.Locale;

public enum fza {
   a("chat"),
   b("skin"),
   c("username");

   private final String d;

   private fza(final String $$0) {
      this.d = $$0.toUpperCase(Locale.ROOT);
   }

   public String a() {
      return this.d;
   }
}
