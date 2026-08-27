import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fyk {
   public static final fyk a = new fyk(fyj.b, fyl.createDnsSrvRedirectHandler(), fyg.a());
   private final fyj b;
   private final fyl c;
   private final fyg d;

   @VisibleForTesting
   fyk(fyj $$0, fyl $$1, fyg $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fyh> a(fyi $$0) {
      Optional<fyh> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fyi> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
