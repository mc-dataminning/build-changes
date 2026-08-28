import com.mojang.datafixers.DataFixUtils;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class pi {
   public static CompletableFuture<kf.g> a(CompletableFuture<jr.a> $$0, kf $$1) {
      return $$0.thenApply($$1x -> {
         kd.b $$2 = kd.a(lx.az);
         jh.a $$3 = new jh.a();
         alc.a.forEach($$1xx -> $$1xx.a($$3::a));
         kf.g $$4 = $$1.a($$2, $$1x, $$3);
         jr.a $$5 = $$4.a();
         Optional<? extends jr.b<dfw>> $$6 = $$5.a(ly.aG);
         Optional<? extends jr.b<ekv>> $$7 = $$5.a(ly.aR);
         if ($$6.isPresent() || $$7.isPresent()) {
            pk.a((jq<ekv>)DataFixUtils.orElseGet($$7, () -> $$1x.d(ly.aR)), (jr<dfw>)DataFixUtils.orElseGet($$6, () -> $$1x.d(ly.aG)));
         }

         return $$4;
      });
   }
}
