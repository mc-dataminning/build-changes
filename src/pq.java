import com.mojang.datafixers.DataFixUtils;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class pq {
   public static CompletableFuture<kg.g> a(CompletableFuture<js.a> $$0, kg $$1) {
      return $$0.thenApply($$1x -> {
         ke.b $$2 = ke.a(ma.aB);
         ji.a $$3 = new ji.a();
         alu.a.forEach($$1xx -> $$1xx.a($$3::a));
         kg.g $$4 = $$1.a($$2, $$1x, $$3);
         js.a $$5 = $$4.a();
         Optional<? extends js.b<dic>> $$6 = $$5.a(mb.aH);
         Optional<? extends js.b<eng>> $$7 = $$5.a(mb.aS);
         if ($$6.isPresent() || $$7.isPresent()) {
            ps.a((jr<eng>)DataFixUtils.orElseGet($$7, () -> $$1x.d(mb.aS)), (js<dic>)DataFixUtils.orElseGet($$6, () -> $$1x.d(mb.aH)));
         }

         return $$4;
      });
   }
}
