import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class ger {
   public static final ger a = new ger(geq.b, ges.createDnsSrvRedirectHandler(), gen.a());
   private final geq b;
   private final ges c;
   private final gen d;

   @VisibleForTesting
   ger(geq $$0, ges $$1, gen $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<geo> a(gep $$0) {
      Optional<geo> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<gep> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
