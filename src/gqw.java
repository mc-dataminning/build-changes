import java.util.Collection;
import java.util.Locale;

public class gqw extends RuntimeException {
   private final Collection<gqv.a> a;

   public gqw(gqv.a $$0, Collection<gqv.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<gqv.a> a() {
      return this.a;
   }
}
