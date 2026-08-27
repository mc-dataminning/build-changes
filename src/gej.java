import java.util.Collection;
import java.util.Locale;

public class gej extends RuntimeException {
   private final Collection<gei.a> a;

   public gej(gei.a $$0, Collection<gei.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<gei.a> a() {
      return this.a;
   }
}
