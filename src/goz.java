import java.util.Collection;
import java.util.Locale;

public class goz extends RuntimeException {
   private final Collection<goy.a> a;

   public goz(goy.a $$0, Collection<goy.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<goy.a> a() {
      return this.a;
   }
}
