import java.util.Collection;
import java.util.Locale;

public class hbe extends RuntimeException {
   private final Collection<hbd.a> a;

   public hbe(hbd.a $$0, Collection<hbd.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<hbd.a> a() {
      return this.a;
   }
}
