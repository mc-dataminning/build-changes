import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class pe {
   public static CompletableFuture<kd.g> a(CompletableFuture<jp.a> $$0, kd $$1) {
      return $$0.thenApply($$1x -> {
         kb.b $$2 = kb.a(lu.az);
         jf.a $$3 = new jf.a();
         akw.a.forEach($$1xx -> $$1xx.a($$3::a));
         kd.g $$4 = $$1.a($$2, $$1x, $$3);
         jp.a $$5 = $$4.a();
         Optional<jp.b<det>> $$6 = $$5.a(lv.aF);
         Optional<jp.b<ejs>> $$7 = $$5.a(lv.aQ);
         if ($$6.isPresent() || $$7.isPresent()) {
            pg.a($$7.orElseGet(() -> $$1x.b(lv.aQ)), $$6.orElseGet(() -> $$1x.b(lv.aF)));
         }

         return $$4;
      });
   }
}
