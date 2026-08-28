import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class ghe {
   public static final ghe a = new ghe(ghd.b, ghf.createDnsSrvRedirectHandler(), gha.a());
   private final ghd b;
   private final ghf c;
   private final gha d;

   @VisibleForTesting
   ghe(ghd $$0, ghf $$1, gha $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<ghb> a(ghc $$0) {
      Optional<ghb> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<ghc> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
