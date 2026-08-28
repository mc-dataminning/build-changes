import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class gni {
   public static final gni a = new gni(gnh.b, gnj.createDnsSrvRedirectHandler(), gne.a());
   private final gnh b;
   private final gnj c;
   private final gne d;

   @VisibleForTesting
   gni(gnh $$0, gnj $$1, gne $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<gnf> a(gng $$0) {
      Optional<gnf> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<gng> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
