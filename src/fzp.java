import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fzp {
   public static final fzp a = new fzp(fzo.b, fzq.createDnsSrvRedirectHandler(), fzl.a());
   private final fzo b;
   private final fzq c;
   private final fzl d;

   @VisibleForTesting
   fzp(fzo $$0, fzq $$1, fzl $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fzm> a(fzn $$0) {
      Optional<fzm> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fzn> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
