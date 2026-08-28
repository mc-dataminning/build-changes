import java.util.Collection;
import java.util.Locale;

public class gwz extends RuntimeException {
   private final Collection<gwy.a> a;

   public gwz(gwy.a $$0, Collection<gwy.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<gwy.a> a() {
      return this.a;
   }
}
