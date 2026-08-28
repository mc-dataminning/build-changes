import com.mojang.datafixers.DataFixUtils;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class ot {
   public static CompletableFuture<ju.g> a(CompletableFuture<jg.a> $$0, ju $$1) {
      return $$0.thenApply($$1x -> {
         js.b $$2 = js.a(mf.aF);
         iw.a $$3 = new iw.a();
         alb.a.forEach($$1xx -> $$1xx.a($$3::a));
         ju.g $$4 = $$1.a($$2, $$1x, $$3);
         jg.a $$5 = $$4.a();
         Optional<? extends jg.b<djy>> $$6 = $$5.a(mg.aG);
         Optional<? extends jg.b<epx>> $$7 = $$5.a(mg.ba);
         if ($$6.isPresent() || $$7.isPresent()) {
            ov.a((jf<epx>)DataFixUtils.orElseGet($$7, () -> $$1x.e(mg.ba)), (jg<djy>)DataFixUtils.orElseGet($$6, () -> $$1x.e(mg.aG)));
         }

         return $$4;
      });
   }
}
