import java.util.Collection;
import java.util.Locale;

public class fze extends RuntimeException {
   private final Collection<fzd.a> a;

   public fze(fzd.a $$0, Collection<fzd.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<fzd.a> a() {
      return this.a;
   }
}
