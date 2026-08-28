import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fzx {
   public static final fzx a = new fzx(fzw.b, fzy.createDnsSrvRedirectHandler(), fzt.a());
   private final fzw b;
   private final fzy c;
   private final fzt d;

   @VisibleForTesting
   fzx(fzw $$0, fzy $$1, fzt $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fzu> a(fzv $$0) {
      Optional<fzu> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fzv> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
