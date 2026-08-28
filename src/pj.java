import com.mojang.datafixers.DataFixUtils;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class pj {
   public static CompletableFuture<kg.g> a(CompletableFuture<js.a> $$0, kg $$1) {
      return $$0.thenApply($$1x -> {
         ke.b $$2 = ke.a(ly.az);
         ji.a $$3 = new ji.a();
         ald.a.forEach($$1xx -> $$1xx.a($$3::a));
         kg.g $$4 = $$1.a($$2, $$1x, $$3);
         js.a $$5 = $$4.a();
         Optional<? extends js.b<dgc>> $$6 = $$5.a(lz.aG);
         Optional<? extends js.b<elb>> $$7 = $$5.a(lz.aR);
         if ($$6.isPresent() || $$7.isPresent()) {
            pl.a((jr<elb>)DataFixUtils.orElseGet($$7, () -> $$1x.d(lz.aR)), (js<dgc>)DataFixUtils.orElseGet($$6, () -> $$1x.d(lz.aG)));
         }

         return $$4;
      });
   }
}
