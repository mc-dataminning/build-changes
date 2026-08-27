import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class or {
   public static CompletableFuture<jm.g> a(CompletableFuture<iy.a> $$0, jm $$1) {
      return $$0.thenApply($$1x -> {
         jk.b $$2 = jk.a(ld.aw);
         io.a $$3 = new io.a();
         akc.a.forEach($$1xx -> $$1xx.a($$3::a));
         jm.g $$4 = $$1.a($$2, $$1x, $$3);
         iy.a $$5 = $$4.a();
         Optional<iy.b<dbc>> $$6 = $$5.a(le.az);
         Optional<iy.b<eft>> $$7 = $$5.a(le.aI);
         if ($$6.isPresent() || $$7.isPresent()) {
            ot.a($$7.orElseGet(() -> $$1x.b(le.aI)), $$6.orElseGet(() -> $$1x.b(le.az)));
         }

         return $$4;
      });
   }
}
