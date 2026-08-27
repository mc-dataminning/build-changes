import java.util.Collection;
import java.util.Locale;

public class gek extends RuntimeException {
   private final Collection<gej.a> a;

   public gek(gej.a $$0, Collection<gej.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<gej.a> a() {
      return this.a;
   }
}
