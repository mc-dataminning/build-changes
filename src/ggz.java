import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class ggz {
   public static final ggz a = new ggz(ggy.b, gha.createDnsSrvRedirectHandler(), ggv.a());
   private final ggy b;
   private final gha c;
   private final ggv d;

   @VisibleForTesting
   ggz(ggy $$0, gha $$1, ggv $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<ggw> a(ggx $$0) {
      Optional<ggw> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<ggx> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
