import java.util.Collection;
import java.util.Locale;

public class fyy extends RuntimeException {
   private final Collection<fyx.a> a;

   public fyy(fyx.a $$0, Collection<fyx.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<fyx.a> a() {
      return this.a;
   }
}
