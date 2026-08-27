import java.util.Collection;
import java.util.Locale;

public class fyx extends RuntimeException {
   private final Collection<fyw.a> a;

   public fyx(fyw.a $$0, Collection<fyw.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<fyw.a> a() {
      return this.a;
   }
}
