import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class ox {
   public static CompletableFuture<jz.g> a(CompletableFuture<jl.a> $$0, jz $$1) {
      return $$0.thenApply($$1x -> {
         jx.b $$2 = jx.a(lq.aA);
         jb.a $$3 = new jb.a();
         akf.a.forEach($$1xx -> $$1xx.a($$3::a));
         jz.g $$4 = $$1.a($$2, $$1x, $$3);
         jl.a $$5 = $$4.a();
         Optional<jl.b<ddf>> $$6 = $$5.a(lr.aE);
         Optional<jl.b<eia>> $$7 = $$5.a(lr.aP);
         if ($$6.isPresent() || $$7.isPresent()) {
            oz.a($$7.orElseGet(() -> $$1x.b(lr.aP)), $$6.orElseGet(() -> $$1x.b(lr.aE)));
         }

         return $$4;
      });
   }
}
