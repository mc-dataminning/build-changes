import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fxp {
   public static final fxp a = new fxp(fxo.b, fxq.createDnsSrvRedirectHandler(), fxl.a());
   private final fxo b;
   private final fxq c;
   private final fxl d;

   @VisibleForTesting
   fxp(fxo $$0, fxq $$1, fxl $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fxm> a(fxn $$0) {
      Optional<fxm> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fxn> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
