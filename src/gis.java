import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class gis {
   public static final gis a = new gis(gir.b, git.createDnsSrvRedirectHandler(), gio.a());
   private final gir b;
   private final git c;
   private final gio d;

   @VisibleForTesting
   gis(gir $$0, git $$1, gio $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<gip> a(giq $$0) {
      Optional<gip> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<giq> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
