import com.mojang.datafixers.DataFixUtils;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class or {
   public static CompletableFuture<ki.g> a(CompletableFuture<ju.a> $$0, ki $$1) {
      return $$0.thenApply($$1x -> {
         kg.b $$2 = kg.a(md.aG);
         jk.a $$3 = new jk.a();
         aky.a.forEach($$1xx -> $$1xx.a($$3::a));
         ki.g $$4 = $$1.a($$2, $$1x, $$3);
         ju.a $$5 = $$4.a();
         Optional<? extends ju.b<dis>> $$6 = $$5.a(me.aM);
         Optional<? extends ju.b<eok>> $$7 = $$5.a(me.aY);
         if ($$6.isPresent() || $$7.isPresent()) {
            ot.a((jt<eok>)DataFixUtils.orElseGet($$7, () -> $$1x.e(me.aY)), (ju<dis>)DataFixUtils.orElseGet($$6, () -> $$1x.e(me.aM)));
         }

         return $$4;
      });
   }
}
