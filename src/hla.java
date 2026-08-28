import java.util.Collection;
import java.util.Locale;

public class hla extends RuntimeException {
   private final Collection<hkz.a> a;

   public hla(hkz.a $$0, Collection<hkz.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<hkz.a> a() {
      return this.a;
   }
}
