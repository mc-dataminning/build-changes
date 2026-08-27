import java.util.Collection;
import java.util.Locale;

public class ghx extends RuntimeException {
   private final Collection<ghw.a> a;

   public ghx(ghw.a $$0, Collection<ghw.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<ghw.a> a() {
      return this.a;
   }
}
