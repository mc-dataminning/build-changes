import java.util.Collection;
import java.util.Locale;

public class gyr extends RuntimeException {
   private final Collection<gyq.a> a;

   public gyr(gyq.a $$0, Collection<gyq.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<gyq.a> a() {
      return this.a;
   }
}
