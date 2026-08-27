import java.util.Collection;
import java.util.Locale;

public class gbs extends RuntimeException {
   private final Collection<gbr.a> a;

   public gbs(gbr.a $$0, Collection<gbr.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<gbr.a> a() {
      return this.a;
   }
}
