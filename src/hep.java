import java.util.Collection;
import java.util.Locale;

public class hep extends RuntimeException {
   private final Collection<heo.a> a;

   public hep(heo.a $$0, Collection<heo.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<heo.a> a() {
      return this.a;
   }
}
