import java.util.Collection;
import java.util.Locale;

public class hjo extends RuntimeException {
   private final Collection<hjn.a> a;

   public hjo(hjn.a $$0, Collection<hjn.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<hjn.a> a() {
      return this.a;
   }
}
