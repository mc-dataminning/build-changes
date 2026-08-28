import com.mojang.datafixers.DataFixUtils;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class pk {
   public static CompletableFuture<kg.g> a(CompletableFuture<js.a> $$0, kg $$1) {
      return $$0.thenApply($$1x -> {
         ke.b $$2 = ke.a(lz.az);
         ji.a $$3 = new ji.a();
         ale.a.forEach($$1xx -> $$1xx.a($$3::a));
         kg.g $$4 = $$1.a($$2, $$1x, $$3);
         js.a $$5 = $$4.a();
         Optional<? extends js.b<dgo>> $$6 = $$5.a(ma.aG);
         Optional<? extends js.b<elm>> $$7 = $$5.a(ma.aR);
         if ($$6.isPresent() || $$7.isPresent()) {
            pm.a((jr<elm>)DataFixUtils.orElseGet($$7, () -> $$1x.d(ma.aR)), (js<dgo>)DataFixUtils.orElseGet($$6, () -> $$1x.d(ma.aG)));
         }

         return $$4;
      });
   }
}
