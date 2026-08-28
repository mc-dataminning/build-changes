import java.util.Collection;
import java.util.Locale;

public class hko extends RuntimeException {
   private final Collection<hkn.a> a;

   public hko(hkn.a $$0, Collection<hkn.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<hkn.a> a() {
      return this.a;
   }
}
