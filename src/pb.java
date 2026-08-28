import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class pb {
   public static CompletableFuture<kc.g> a(CompletableFuture<jo.a> $$0, kc $$1) {
      return $$0.thenApply($$1x -> {
         ka.b $$2 = ka.a(lt.aA);
         je.a $$3 = new je.a();
         akm.a.forEach($$1xx -> $$1xx.a($$3::a));
         kc.g $$4 = $$1.a($$2, $$1x, $$3);
         jo.a $$5 = $$4.a();
         Optional<jo.b<ddw>> $$6 = $$5.a(lu.aF);
         Optional<jo.b<eit>> $$7 = $$5.a(lu.aQ);
         if ($$6.isPresent() || $$7.isPresent()) {
            pd.a($$7.orElseGet(() -> $$1x.b(lu.aQ)), $$6.orElseGet(() -> $$1x.b(lu.aF)));
         }

         return $$4;
      });
   }
}
