import java.util.Collection;
import java.util.Locale;

public class gqd extends RuntimeException {
   private final Collection<gqc.a> a;

   public gqd(gqc.a $$0, Collection<gqc.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<gqc.a> a() {
      return this.a;
   }
}
