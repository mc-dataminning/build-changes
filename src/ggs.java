import java.util.Collection;
import java.util.Locale;

public class ggs extends RuntimeException {
   private final Collection<ggr.a> a;

   public ggs(ggr.a $$0, Collection<ggr.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<ggr.a> a() {
      return this.a;
   }
}
