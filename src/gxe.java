import java.util.Collection;
import java.util.Locale;

public class gxe extends RuntimeException {
   private final Collection<gxd.a> a;

   public gxe(gxd.a $$0, Collection<gxd.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<gxd.a> a() {
      return this.a;
   }
}
