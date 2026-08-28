import java.util.Collection;
import java.util.Locale;

public class gqj extends RuntimeException {
   private final Collection<gqi.a> a;

   public gqj(gqi.a $$0, Collection<gqi.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<gqi.a> a() {
      return this.a;
   }
}
