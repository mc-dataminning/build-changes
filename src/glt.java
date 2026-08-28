import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class glt {
   public static final glt a = new glt(gls.b, glu.createDnsSrvRedirectHandler(), glp.a());
   private final gls b;
   private final glu c;
   private final glp d;

   @VisibleForTesting
   glt(gls $$0, glu $$1, glp $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<glq> a(glr $$0) {
      Optional<glq> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<glr> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
