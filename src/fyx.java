import java.util.Locale;

public enum fyx {
   a("chat"),
   b("skin"),
   c("username");

   private final String d;

   private fyx(final String $$0) {
      this.d = $$0.toUpperCase(Locale.ROOT);
   }

   public String a() {
      return this.d;
   }
}
