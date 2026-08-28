import com.mojang.datafixers.DataFixUtils;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class pf {
   public static CompletableFuture<ke.g> a(CompletableFuture<jq.a> $$0, ke $$1) {
      return $$0.thenApply($$1x -> {
         kc.b $$2 = kc.a(lv.aA);
         jg.a $$3 = new jg.a();
         akz.a.forEach($$1xx -> $$1xx.a($$3::a));
         ke.g $$4 = $$1.a($$2, $$1x, $$3);
         jq.a $$5 = $$4.a();
         Optional<? extends jq.b<dfk>> $$6 = $$5.a(lw.aH);
         Optional<? extends jq.b<ekk>> $$7 = $$5.a(lw.aS);
         if ($$6.isPresent() || $$7.isPresent()) {
            ph.a((jp<ekk>)DataFixUtils.orElseGet($$7, () -> $$1x.d(lw.aS)), (jq<dfk>)DataFixUtils.orElseGet($$6, () -> $$1x.d(lw.aH)));
         }

         return $$4;
      });
   }
}
