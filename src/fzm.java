import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fzm {
   public static final fzm a = new fzm(fzl.b, fzn.createDnsSrvRedirectHandler(), fzi.a());
   private final fzl b;
   private final fzn c;
   private final fzi d;

   @VisibleForTesting
   fzm(fzl $$0, fzn $$1, fzi $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fzj> a(fzk $$0) {
      Optional<fzj> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fzk> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
