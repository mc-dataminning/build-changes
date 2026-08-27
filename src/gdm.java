import java.util.Collection;
import java.util.Locale;

public class gdm extends RuntimeException {
   private final Collection<gdl.a> a;

   public gdm(gdl.a $$0, Collection<gdl.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<gdl.a> a() {
      return this.a;
   }
}
