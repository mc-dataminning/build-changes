import java.util.Collection;
import java.util.Locale;

public class gqh extends RuntimeException {
   private final Collection<gqg.a> a;

   public gqh(gqg.a $$0, Collection<gqg.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<gqg.a> a() {
      return this.a;
   }
}
