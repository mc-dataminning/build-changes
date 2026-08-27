import java.util.Collection;
import java.util.Locale;

public class gbf extends RuntimeException {
   private final Collection<gbe.a> a;

   public gbf(gbe.a $$0, Collection<gbe.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<gbe.a> a() {
      return this.a;
   }
}
