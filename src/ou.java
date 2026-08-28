import com.mojang.datafixers.DataFixUtils;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class ou {
   public static CompletableFuture<jv.g> a(CompletableFuture<jh.a> $$0, jv $$1) {
      return $$0.thenApply($$1x -> {
         jt.b $$2 = jt.a(mg.aF);
         ix.a $$3 = new ix.a();
         ald.a.forEach($$1xx -> $$1xx.a($$3::a));
         jv.g $$4 = $$1.a($$2, $$1x, $$3);
         jh.a $$5 = $$4.a();
         Optional<? extends jh.b<dla>> $$6 = $$5.a(mh.aG);
         Optional<? extends jh.b<erf>> $$7 = $$5.a(mh.bb);
         if ($$6.isPresent() || $$7.isPresent()) {
            ow.a((jg<erf>)DataFixUtils.orElseGet($$7, () -> $$1x.e(mh.bb)), (jh<dla>)DataFixUtils.orElseGet($$6, () -> $$1x.e(mh.aG)));
         }

         return $$4;
      });
   }
}
