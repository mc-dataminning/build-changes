import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fzj {
   public static final fzj a = new fzj(fzi.b, fzk.createDnsSrvRedirectHandler(), fzf.a());
   private final fzi b;
   private final fzk c;
   private final fzf d;

   @VisibleForTesting
   fzj(fzi $$0, fzk $$1, fzf $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fzg> a(fzh $$0) {
      Optional<fzg> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fzh> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
