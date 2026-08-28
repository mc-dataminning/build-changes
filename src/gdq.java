import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class gdq {
   public static final gdq a = new gdq(gdp.b, gdr.createDnsSrvRedirectHandler(), gdm.a());
   private final gdp b;
   private final gdr c;
   private final gdm d;

   @VisibleForTesting
   gdq(gdp $$0, gdr $$1, gdm $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<gdn> a(gdo $$0) {
      Optional<gdn> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<gdo> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
