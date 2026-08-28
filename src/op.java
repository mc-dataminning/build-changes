import com.mojang.datafixers.DataFixUtils;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class op {
   public static CompletableFuture<kh.g> a(CompletableFuture<jt.a> $$0, kh $$1) {
      return $$0.thenApply($$1x -> {
         kf.b $$2 = kf.a(mb.aD);
         jj.a $$3 = new jj.a();
         akp.a.forEach($$1xx -> $$1xx.a($$3::a));
         kh.g $$4 = $$1.a($$2, $$1x, $$3);
         jt.a $$5 = $$4.a();
         Optional<? extends jt.b<dic>> $$6 = $$5.a(mc.aJ);
         Optional<? extends jt.b<enn>> $$7 = $$5.a(mc.aV);
         if ($$6.isPresent() || $$7.isPresent()) {
            or.a((js<enn>)DataFixUtils.orElseGet($$7, () -> $$1x.d(mc.aV)), (jt<dic>)DataFixUtils.orElseGet($$6, () -> $$1x.d(mc.aJ)));
         }

         return $$4;
      });
   }
}
