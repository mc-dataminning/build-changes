import java.util.Collection;
import java.util.Locale;

public class gja extends RuntimeException {
   private final Collection<giz.a> a;

   public gja(giz.a $$0, Collection<giz.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<giz.a> a() {
      return this.a;
   }
}
