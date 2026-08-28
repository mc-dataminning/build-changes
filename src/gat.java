import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class gat {
   public static final gat a = new gat(gas.b, gau.createDnsSrvRedirectHandler(), gap.a());
   private final gas b;
   private final gau c;
   private final gap d;

   @VisibleForTesting
   gat(gas $$0, gau $$1, gap $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<gaq> a(gar $$0) {
      Optional<gaq> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<gar> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
