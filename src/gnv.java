import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class gnv {
   public static final gnv a = new gnv(gnu.b, gnw.createDnsSrvRedirectHandler(), gnr.a());
   private final gnu b;
   private final gnw c;
   private final gnr d;

   @VisibleForTesting
   gnv(gnu $$0, gnw $$1, gnr $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<gns> a(gnt $$0) {
      Optional<gns> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<gnt> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
