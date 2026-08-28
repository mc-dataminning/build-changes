import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class gmk {
   public static final gmk a = new gmk(gmj.b, gml.createDnsSrvRedirectHandler(), gmg.a());
   private final gmj b;
   private final gml c;
   private final gmg d;

   @VisibleForTesting
   gmk(gmj $$0, gml $$1, gmg $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<gmh> a(gmi $$0) {
      Optional<gmh> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<gmi> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
