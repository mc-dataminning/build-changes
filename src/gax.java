import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class gax {
   public static final gax a = new gax(gaw.b, gay.createDnsSrvRedirectHandler(), gat.a());
   private final gaw b;
   private final gay c;
   private final gat d;

   @VisibleForTesting
   gax(gaw $$0, gay $$1, gat $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<gau> a(gav $$0) {
      Optional<gau> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<gav> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
