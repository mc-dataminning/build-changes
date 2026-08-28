import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class gkx {
   public static final gkx a = new gkx(gkw.b, gky.createDnsSrvRedirectHandler(), gkt.a());
   private final gkw b;
   private final gky c;
   private final gkt d;

   @VisibleForTesting
   gkx(gkw $$0, gky $$1, gkt $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<gku> a(gkv $$0) {
      Optional<gku> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<gkv> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
