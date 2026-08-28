import java.util.Collection;
import java.util.Locale;

public class her extends RuntimeException {
   private final Collection<heq.a> a;

   public her(heq.a $$0, Collection<heq.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<heq.a> a() {
      return this.a;
   }
}
