import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fwj {
   public static final fwj a = new fwj(fwi.b, fwk.createDnsSrvRedirectHandler(), fwf.a());
   private final fwi b;
   private final fwk c;
   private final fwf d;

   @VisibleForTesting
   fwj(fwi $$0, fwk $$1, fwf $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fwg> a(fwh $$0) {
      Optional<fwg> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fwh> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
