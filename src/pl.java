import com.mojang.datafixers.DataFixUtils;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class pl {
   public static CompletableFuture<kg.g> a(CompletableFuture<js.a> $$0, kg $$1) {
      return $$0.thenApply($$1x -> {
         ke.b $$2 = ke.a(ma.aC);
         ji.a $$3 = new ji.a();
         alk.a.forEach($$1xx -> $$1xx.a($$3::a));
         kg.g $$4 = $$1.a($$2, $$1x, $$3);
         js.a $$5 = $$4.a();
         Optional<? extends js.b<dib>> $$6 = $$5.a(mb.aI);
         Optional<? extends js.b<enh>> $$7 = $$5.a(mb.aT);
         if ($$6.isPresent() || $$7.isPresent()) {
            pn.a((jr<enh>)DataFixUtils.orElseGet($$7, () -> $$1x.d(mb.aT)), (js<dib>)DataFixUtils.orElseGet($$6, () -> $$1x.d(mb.aI)));
         }

         return $$4;
      });
   }
}
