import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class pe {
   public static CompletableFuture<kd.g> a(CompletableFuture<jp.a> $$0, kd $$1) {
      return $$0.thenApply($$1x -> {
         kb.b $$2 = kb.a(lu.aA);
         jf.a $$3 = new jf.a();
         akx.a.forEach($$1xx -> $$1xx.a($$3::a));
         kd.g $$4 = $$1.a($$2, $$1x, $$3);
         jp.a $$5 = $$4.a();
         Optional<jp.b<dfh>> $$6 = $$5.a(lv.aG);
         Optional<jp.b<ekg>> $$7 = $$5.a(lv.aR);
         if ($$6.isPresent() || $$7.isPresent()) {
            pg.a($$7.orElseGet(() -> $$1x.b(lv.aR)), $$6.orElseGet(() -> $$1x.b(lv.aG)));
         }

         return $$4;
      });
   }
}
