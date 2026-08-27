import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class nn {
   public static CompletableFuture<iw.e> a(CompletableFuture<ij.b> $$0, iw $$1) {
      return $$0.thenApply($$1x -> {
         iu.b $$2 = iu.a(kd.as);
         hy.a $$3 = new hy.a();
         ahb.a.forEach($$1xx -> $$1xx.a($$3::a));
         iw.e $$4 = $$1.a($$2, $$1x, $$3);
         ij.b $$5 = $$4.a();
         Optional<ij.c<cuo>> $$6 = $$5.a(ke.at);
         Optional<ij.c<dyk>> $$7 = $$5.a(ke.aC);
         if ($$6.isPresent() || $$7.isPresent()) {
            np.a($$7.orElseGet(() -> $$1x.b(ke.aC)), $$6.orElseGet(() -> $$1x.b(ke.at)));
         }

         return $$4;
      });
   }
}
