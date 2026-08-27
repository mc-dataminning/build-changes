import java.util.Collection;
import java.util.Locale;

public class fye extends RuntimeException {
   private final Collection<fyd.a> a;

   public fye(fyd.a $$0, Collection<fyd.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<fyd.a> a() {
      return this.a;
   }
}
