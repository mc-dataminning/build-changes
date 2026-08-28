import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class ggx {
   public static final ggx a = new ggx(ggw.b, ggy.createDnsSrvRedirectHandler(), ggt.a());
   private final ggw b;
   private final ggy c;
   private final ggt d;

   @VisibleForTesting
   ggx(ggw $$0, ggy $$1, ggt $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<ggu> a(ggv $$0) {
      Optional<ggu> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<ggv> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
