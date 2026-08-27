import java.util.Collection;
import java.util.Locale;

public class ggz extends RuntimeException {
   private final Collection<ggy.a> a;

   public ggz(ggy.a $$0, Collection<ggy.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<ggy.a> a() {
      return this.a;
   }
}
