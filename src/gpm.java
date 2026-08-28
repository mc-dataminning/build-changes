import java.util.Collection;
import java.util.Locale;

public class gpm extends RuntimeException {
   private final Collection<gpl.a> a;

   public gpm(gpl.a $$0, Collection<gpl.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<gpl.a> a() {
      return this.a;
   }
}
