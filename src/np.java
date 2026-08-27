import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class np {
   public static CompletableFuture<iy.e> a(CompletableFuture<il.b> $$0, iy $$1) {
      return $$0.thenApply($$1x -> {
         iw.b $$2 = iw.a(kf.as);
         ia.a $$3 = new ia.a();
         ait.a.forEach($$1xx -> $$1xx.a($$3::a));
         iy.e $$4 = $$1.a($$2, $$1x, $$3);
         il.b $$5 = $$4.a();
         Optional<il.c<cwq>> $$6 = $$5.a(kg.at);
         Optional<il.c<eap>> $$7 = $$5.a(kg.aC);
         if ($$6.isPresent() || $$7.isPresent()) {
            nr.a($$7.orElseGet(() -> $$1x.b(kg.aC)), $$6.orElseGet(() -> $$1x.b(kg.at)));
         }

         return $$4;
      });
   }
}
