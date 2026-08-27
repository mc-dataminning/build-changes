import java.util.Collection;
import java.util.Locale;

public class gmw extends RuntimeException {
   private final Collection<gmv.a> a;

   public gmw(gmv.a $$0, Collection<gmv.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<gmv.a> a() {
      return this.a;
   }
}
