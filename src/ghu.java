import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class ghu {
   public static final ghu a = new ghu(ght.b, ghv.createDnsSrvRedirectHandler(), ghq.a());
   private final ght b;
   private final ghv c;
   private final ghq d;

   @VisibleForTesting
   ghu(ght $$0, ghv $$1, ghq $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<ghr> a(ghs $$0) {
      Optional<ghr> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<ghs> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
