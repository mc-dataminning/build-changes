import java.util.Collection;
import java.util.Locale;

public class gpg extends RuntimeException {
   private final Collection<gpf.a> a;

   public gpg(gpf.a $$0, Collection<gpf.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<gpf.a> a() {
      return this.a;
   }
}
