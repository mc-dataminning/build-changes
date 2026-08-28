import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class gjt {
   public static final gjt a = new gjt(gjs.b, gju.createDnsSrvRedirectHandler(), gjp.a());
   private final gjs b;
   private final gju c;
   private final gjp d;

   @VisibleForTesting
   gjt(gjs $$0, gju $$1, gjp $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<gjq> a(gjr $$0) {
      Optional<gjq> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<gjr> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
