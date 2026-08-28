import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fzq {
   public static final fzq a = new fzq(fzp.b, fzr.createDnsSrvRedirectHandler(), fzm.a());
   private final fzp b;
   private final fzr c;
   private final fzm d;

   @VisibleForTesting
   fzq(fzp $$0, fzr $$1, fzm $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fzn> a(fzo $$0) {
      Optional<fzn> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fzo> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
