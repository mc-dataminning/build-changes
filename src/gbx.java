import java.util.Collection;
import java.util.Locale;

public class gbx extends RuntimeException {
   private final Collection<gbw.a> a;

   public gbx(gbw.a $$0, Collection<gbw.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<gbw.a> a() {
      return this.a;
   }
}
