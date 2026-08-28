import java.util.Collection;
import java.util.Locale;

public class gos extends RuntimeException {
   private final Collection<gor.a> a;

   public gos(gor.a $$0, Collection<gor.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<gor.a> a() {
      return this.a;
   }
}
