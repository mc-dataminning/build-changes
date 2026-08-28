import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;

public class gda {
   public static final gda a = new gda(gcz.b, gdb.createDnsSrvRedirectHandler(), gcw.a());
   private final gcz b;
   private final gdb c;
   private final gcw d;

   @VisibleForTesting
   gda(gcz $$0, gdb $$1, gcw $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public Optional<gcx> a(gcy $$0) {
      Optional<gcx> $$1 = this.b.resolve($$0);
      if ((!$$1.isPresent() || this.d.a($$1.get())) && this.d.a($$0)) {
         Optional<gcy> $$2 = this.c.lookupRedirect($$0);
         if ($$2.isPresent()) {
            $$1 = this.b.resolve($$2.get()).filter(this.d::a);
         }

         return $$1;
      } else {
         return Optional.empty();
      }
   }
}
