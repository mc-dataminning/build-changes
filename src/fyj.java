import java.util.Collection;
import java.util.Locale;

public class fyj extends RuntimeException {
   private final Collection<fyi.a> a;

   public fyj(fyi.a $$0, Collection<fyi.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<fyi.a> a() {
      return this.a;
   }
}
