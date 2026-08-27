import java.util.Collection;
import java.util.Locale;

public class glh extends RuntimeException {
   private final Collection<glg.a> a;

   public glh(glg.a $$0, Collection<glg.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<glg.a> a() {
      return this.a;
   }
}
