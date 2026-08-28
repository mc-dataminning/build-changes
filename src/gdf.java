import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class gdf {
   public static final gdf a = new gdf(gde.b, gdg.createDnsSrvRedirectHandler(), gdb.a());
   private final gde b;
   private final gdg c;
   private final gdb d;

   @VisibleForTesting
   gdf(gde $$0, gdg $$1, gdb $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<gdc> a(gdd $$0) {
      Optional<gdc> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<gdd> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
