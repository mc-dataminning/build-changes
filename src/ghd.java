import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class ghd {
   public static final ghd a = new ghd(ghc.b, ghe.createDnsSrvRedirectHandler(), ggz.a());
   private final ghc b;
   private final ghe c;
   private final ggz d;

   @VisibleForTesting
   ghd(ghc $$0, ghe $$1, ggz $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<gha> a(ghb $$0) {
      Optional<gha> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<ghb> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
