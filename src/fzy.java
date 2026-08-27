import java.util.Collection;
import java.util.Locale;

public class fzy extends RuntimeException {
   private final Collection<fzx.a> a;

   public fzy(fzx.a $$0, Collection<fzx.a> $$1) {
      super(String.format(Locale.ROOT, "Unable to fit: %s - size: %dx%d - Maybe try a lower resolution resourcepack?", $$0.c(), $$0.a(), $$0.b()));
      this.a = $$1;
   }

   public Collection<fzx.a> a() {
      return this.a;
   }
}
