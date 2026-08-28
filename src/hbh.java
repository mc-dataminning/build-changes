import java.util.Collection;
import java.util.Locale;

public class hbh extends RuntimeException {
   private final Collection<hbg.a> a;

   public hbh(hbg.a $$0, Collection<hbg.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<hbg.a> a() {
      return this.a;
   }
}
