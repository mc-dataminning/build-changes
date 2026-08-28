import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class gnx {
   public static final gnx a = new gnx(gnw.b, gny.createDnsSrvRedirectHandler(), gnt.a());
   private final gnw b;
   private final gny c;
   private final gnt d;

   @VisibleForTesting
   gnx(gnw $$0, gny $$1, gnt $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<gnu> a(gnv $$0) {
      Optional<gnu> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<gnv> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
