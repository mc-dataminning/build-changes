import java.util.Locale;

public enum gce {
   a("chat"),
   b("skin"),
   c("username");

   private final String d;

   private gce(final String $$0) {
      this.d = $$0.toUpperCase(Locale.ROOT);
   }

   public String a() {
      return this.d;
   }
}
