import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class gaz {
   public static final gaz a = new gaz(gay.b, gba.createDnsSrvRedirectHandler(), gav.a());
   private final gay b;
   private final gba c;
   private final gav d;

   @VisibleForTesting
   gaz(gay $$0, gba $$1, gav $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<gaw> a(gax $$0) {
      Optional<gaw> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<gax> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
