import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class gaf {
   public static final gaf a = new gaf(gae.b, gag.createDnsSrvRedirectHandler(), gab.a());
   private final gae b;
   private final gag c;
   private final gab d;

   @VisibleForTesting
   gaf(gae $$0, gag $$1, gab $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<gac> a(gad $$0) {
      Optional<gac> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<gad> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
