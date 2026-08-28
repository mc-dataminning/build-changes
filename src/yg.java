import java.util.Locale;

public class yg extends IllegalArgumentException {
   public yg(yf $$0, String $$1) {
      super(String.format(Locale.ROOT, "Error parsing: %s: %s", $$0, $$1));
   }

   public yg(yf $$0, int $$1) {
      super(String.format(Locale.ROOT, "Invalid index %d requested for %s", $$1, $$0));
   }

   public yg(yf $$0, Throwable $$1) {
      super(String.format(Locale.ROOT, "Error while parsing: %s", $$0), $$1);
   }
}
