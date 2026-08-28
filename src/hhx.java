import java.util.Collection;
import java.util.Locale;

public class hhx extends RuntimeException {
   private final Collection<hhw.a> a;

   public hhx(hhw.a $$0, Collection<hhw.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<hhw.a> a() {
      return this.a;
   }
}
