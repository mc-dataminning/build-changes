import java.util.Collection;
import java.util.Locale;

public class hbi extends RuntimeException {
   private final Collection<hbh.a> a;

   public hbi(hbh.a $$0, Collection<hbh.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<hbh.a> a() {
      return this.a;
   }
}
