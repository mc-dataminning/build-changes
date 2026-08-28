import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class gll {
   public static final gll a = new gll(glk.b, glm.createDnsSrvRedirectHandler(), glh.a());
   private final glk b;
   private final glm c;
   private final glh d;

   @VisibleForTesting
   gll(glk $$0, glm $$1, glh $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<gli> a(glj $$0) {
      Optional<gli> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<glj> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
