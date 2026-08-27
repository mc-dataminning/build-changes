import java.util.Collection;
import java.util.Locale;

public class fzc extends RuntimeException {
   private final Collection<fzb.a> a;

   public fzc(fzb.a $$0, Collection<fzb.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<fzb.a> a() {
      return this.a;
   }
}
