import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class ghc {
   public static final ghc a = new ghc(ghb.b, ghd.createDnsSrvRedirectHandler(), ggy.a());
   private final ghb b;
   private final ghd c;
   private final ggy d;

   @VisibleForTesting
   ghc(ghb $$0, ghd $$1, ggy $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<ggz> a(gha $$0) {
      Optional<ggz> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<gha> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
