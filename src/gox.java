import java.util.Collection;
import java.util.Locale;

public class gox extends RuntimeException {
   private final Collection<gow.a> a;

   public gox(gow.a $$0, Collection<gow.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<gow.a> a() {
      return this.a;
   }
}
