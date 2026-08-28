import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fzn {
   public static final fzn a = new fzn(fzm.b, fzo.createDnsSrvRedirectHandler(), fzj.a());
   private final fzm b;
   private final fzo c;
   private final fzj d;

   @VisibleForTesting
   fzn(fzm $$0, fzo $$1, fzj $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fzk> a(fzl $$0) {
      Optional<fzk> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fzl> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
