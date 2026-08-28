import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class gad {
   public static final gad a = new gad(gac.b, gae.createDnsSrvRedirectHandler(), fzz.a());
   private final gac b;
   private final gae c;
   private final fzz d;

   @VisibleForTesting
   gad(gac $$0, gae $$1, fzz $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<gaa> a(gab $$0) {
      Optional<gaa> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<gab> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
