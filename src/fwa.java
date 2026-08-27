import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fwa {
   public static final fwa a = new fwa(fvz.b, fwb.createDnsSrvRedirectHandler(), fvw.a());
   private final fvz b;
   private final fwb c;
   private final fvw d;

   @VisibleForTesting
   fwa(fvz $$0, fwb $$1, fvw $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fvx> a(fvy $$0) {
      Optional<fvx> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fvy> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
