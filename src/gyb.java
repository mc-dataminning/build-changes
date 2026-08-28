import java.util.Collection;
import java.util.Locale;

public class gyb extends RuntimeException {
   private final Collection<gya.a> a;

   public gyb(gya.a $$0, Collection<gya.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<gya.a> a() {
      return this.a;
   }
}
