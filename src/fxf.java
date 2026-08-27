import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class fxf {
   public static final fxf a = new fxf(fxe.b, fxg.createDnsSrvRedirectHandler(), fxb.a());
   private final fxe b;
   private final fxg c;
   private final fxb d;

   @VisibleForTesting
   fxf(fxe $$0, fxg $$1, fxb $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<fxc> a(fxd $$0) {
      Optional<fxc> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<fxd> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
