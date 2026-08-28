import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class ghs {
   public static final ghs a = new ghs(ghr.b, ght.createDnsSrvRedirectHandler(), gho.a());
   private final ghr b;
   private final ght c;
   private final gho d;

   @VisibleForTesting
   ghs(ghr $$0, ght $$1, gho $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<ghp> a(ghq $$0) {
      Optional<ghp> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<ghq> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
