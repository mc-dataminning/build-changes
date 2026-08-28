import java.util.Collection;
import java.util.Locale;

public class heq extends RuntimeException {
   private final Collection<hep.a> a;

   public heq(hep.a $$0, Collection<hep.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<hep.a> a() {
      return this.a;
   }
}
