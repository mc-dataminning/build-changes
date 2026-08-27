import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class gbg {
   public static final gbg a = new gbg(gbf.b, gbh.createDnsSrvRedirectHandler(), gbc.a());
   private final gbf b;
   private final gbh c;
   private final gbc d;

   @VisibleForTesting
   gbg(gbf $$0, gbh $$1, gbc $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<gbd> a(gbe $$0) {
      Optional<gbd> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<gbe> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
