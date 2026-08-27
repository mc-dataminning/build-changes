import java.util.Collection;
import java.util.Locale;

public class ged extends RuntimeException {
   private final Collection<gec.a> a;

   public ged(gec.a $$0, Collection<gec.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<gec.a> a() {
      return this.a;
   }
}
