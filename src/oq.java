import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class oq {
   public static CompletableFuture<jl.g> a(CompletableFuture<ix.a> $$0, jl $$1) {
      return $$0.thenApply($$1x -> {
         jj.b $$2 = jj.a(lc.av);
         in.a $$3 = new in.a();
         aka.a.forEach($$1xx -> $$1xx.a($$3::a));
         jl.g $$4 = $$1.a($$2, $$1x, $$3);
         ix.a $$5 = $$4.a();
         Optional<ix.b<dat>> $$6 = $$5.a(ld.ay);
         Optional<ix.b<efk>> $$7 = $$5.a(ld.aH);
         if ($$6.isPresent() || $$7.isPresent()) {
            os.a($$7.orElseGet(() -> $$1x.b(ld.aH)), $$6.orElseGet(() -> $$1x.b(ld.ay)));
         }

         return $$4;
      });
   }
}
