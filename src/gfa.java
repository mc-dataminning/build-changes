import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class gfa {
   public static final gfa a = new gfa(gez.b, gfb.createDnsSrvRedirectHandler(), gew.a());
   private final gez b;
   private final gfb c;
   private final gew d;

   @VisibleForTesting
   gfa(gez $$0, gfb $$1, gew $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<gex> a(gey $$0) {
      Optional<gex> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<gey> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
