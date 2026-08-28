import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class geb {
   public static final geb a = new geb(gea.b, gec.createDnsSrvRedirectHandler(), gdx.a());
   private final gea b;
   private final gec c;
   private final gdx d;

   @VisibleForTesting
   geb(gea $$0, gec $$1, gdx $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<gdy> a(gdz $$0) {
      Optional<gdy> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<gdz> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
