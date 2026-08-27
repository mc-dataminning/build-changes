import java.util.Collection;
import java.util.Locale;

public class gnt extends RuntimeException {
   private final Collection<gns.a> a;

   public gnt(gns.a $$0, Collection<gns.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<gns.a> a() {
      return this.a;
   }
}
