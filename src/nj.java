import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class nj {
   public static CompletableFuture<iu.e> a(CompletableFuture<ih.b> $$0, iu $$1) {
      return $$0.thenApply($$1x -> {
         is.b $$2 = is.a(kb.ar);
         hw.a $$3 = new hw.a();
         ago.a.forEach($$1xx -> $$1xx.a($$3::a));
         iu.e $$4 = $$1.a($$2, $$1x, $$3);
         ih.b $$5 = $$4.a();
         Optional<ih.c<ctx>> $$6 = $$5.a(kc.as);
         Optional<ih.c<dxs>> $$7 = $$5.a(kc.aB);
         if ($$6.isPresent() || $$7.isPresent()) {
            nl.a($$7.orElseGet(() -> $$1x.b(kc.aB)), $$6.orElseGet(() -> $$1x.b(kc.as)));
         }

         return $$4;
      });
   }
}
