import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class pr extends pq<ctv> {
   private final CompletableFuture<pv.c<dff>> d;
   private final Map<awk<dff>, awk<ctv>> g = new HashMap<>();

   public pr(lz $$0, CompletableFuture<jl.a> $$1, CompletableFuture<pv.c<dff>> $$2) {
      super($$0, lr.K, $$1, $$0x -> $$0x.o().h());
      this.d = $$2;
   }

   public pr(lz $$0, CompletableFuture<jl.a> $$1, CompletableFuture<pv.c<ctv>> $$2, CompletableFuture<pv.c<dff>> $$3) {
      super($$0, lr.K, $$1, $$2, $$0x -> $$0x.o().h());
      this.d = $$3;
   }

   protected void a(awk<dff> $$0, awk<ctv> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<jl.a> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            awh $$3 = this.c((awk<ctv>)$$2);
            Optional<awh> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (jl.a)$$0;
      });
   }
}
