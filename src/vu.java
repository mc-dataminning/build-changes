import java.util.Locale;

public class vu extends IllegalArgumentException {
   public vu(vt $$0, String $$1) {
      super(String.format(Locale.ROOT, "Error parsing: %s: %s", $$0, $$1));
   }

   public vu(vt $$0, int $$1) {
      super(String.format(Locale.ROOT, "Invalid index %d requested for %s", $$1, $$0));
   }

   public vu(vt $$0, Throwable $$1) {
      super(String.format(Locale.ROOT, "Error while parsing: %s", $$0), $$1);
   }
}
