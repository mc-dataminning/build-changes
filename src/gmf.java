import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class gmf {
   public static final gmf a = new gmf(gme.b, gmg.createDnsSrvRedirectHandler(), gmb.a());
   private final gme b;
   private final gmg c;
   private final gmb d;

   @VisibleForTesting
   gmf(gme $$0, gmg $$1, gmb $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<gmc> a(gmd $$0) {
      Optional<gmc> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<gmd> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
