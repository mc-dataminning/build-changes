import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fzo {
   public static final fzo a = new fzo(fzn.b, fzp.createDnsSrvRedirectHandler(), fzk.a());
   private final fzn b;
   private final fzp c;
   private final fzk d;

   @VisibleForTesting
   fzo(fzn $$0, fzp $$1, fzk $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fzl> a(fzm $$0) {
      Optional<fzl> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fzm> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
