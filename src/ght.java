import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class ght {
   public static final ght a = new ght(ghs.b, ghu.createDnsSrvRedirectHandler(), ghp.a());
   private final ghs b;
   private final ghu c;
   private final ghp d;

   @VisibleForTesting
   ght(ghs $$0, ghu $$1, ghp $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<ghq> a(ghr $$0) {
      Optional<ghq> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<ghr> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
