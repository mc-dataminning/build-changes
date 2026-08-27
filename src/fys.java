import java.util.Collection;
import java.util.Locale;

public class fys extends RuntimeException {
   private final Collection<fyr.a> a;

   public fys(fyr.a $$0, Collection<fyr.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<fyr.a> a() {
      return this.a;
   }
}
