import java.util.Collection;
import java.util.Locale;

public class hky extends RuntimeException {
   private final Collection<hkx.a> a;

   public hky(hkx.a $$0, Collection<hkx.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<hkx.a> a() {
      return this.a;
   }
}
