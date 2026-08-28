import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class gcq {
   public static final gcq a = new gcq(gcp.b, gcr.createDnsSrvRedirectHandler(), gcm.a());
   private final gcp b;
   private final gcr c;
   private final gcm d;

   @VisibleForTesting
   gcq(gcp $$0, gcr $$1, gcm $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<gcn> a(gco $$0) {
      Optional<gcn> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<gco> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
