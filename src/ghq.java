import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class ghq {
   public static final ghq a = new ghq(ghp.b, ghr.createDnsSrvRedirectHandler(), ghm.a());
   private final ghp b;
   private final ghr c;
   private final ghm d;

   @VisibleForTesting
   ghq(ghp $$0, ghr $$1, ghm $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<ghn> a(gho $$0) {
      Optional<ghn> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<gho> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
