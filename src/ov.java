import com.mojang.datafixers.DataFixUtils;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class ov {
   public static CompletableFuture<jw.g> a(CompletableFuture<ji.a> $$0, jw $$1) {
      return $$0.thenApply($$1x -> {
         ju.b $$2 = ju.a(mh.aF);
         iy.a $$3 = new iy.a();
         alf.a.forEach($$1xx -> $$1xx.a($$3::a));
         jw.g $$4 = $$1.a($$2, $$1x, $$3);
         ji.a $$5 = $$4.a();
         Optional<? extends ji.b<dlc>> $$6 = $$5.a(mi.aG);
         Optional<? extends ji.b<erh>> $$7 = $$5.a(mi.bb);
         if ($$6.isPresent() || $$7.isPresent()) {
            ox.a((jh<erh>)DataFixUtils.orElseGet($$7, () -> $$1x.e(mi.bb)), (ji<dlc>)DataFixUtils.orElseGet($$6, () -> $$1x.e(mi.aG)));
         }

         return $$4;
      });
   }
}
