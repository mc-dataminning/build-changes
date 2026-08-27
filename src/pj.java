import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class pj extends pi<cry> {
   private final CompletableFuture<pn.c<dcv>> d;
   private final Map<awd<dcv>, awd<cry>> g = new HashMap<>();

   public pj(ll $$0, CompletableFuture<ix.a> $$1, CompletableFuture<pn.c<dcv>> $$2) {
      super($$0, ld.G, $$1, $$0x -> $$0x.n().h());
      this.d = $$2;
   }

   public pj(ll $$0, CompletableFuture<ix.a> $$1, CompletableFuture<pn.c<cry>> $$2, CompletableFuture<pn.c<dcv>> $$3) {
      super($$0, ld.G, $$1, $$2, $$0x -> $$0x.n().h());
      this.d = $$3;
   }

   protected void a(awd<dcv> $$0, awd<cry> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<ix.a> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            awa $$3 = this.c((awd<cry>)$$2);
            Optional<awa> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (ix.a)$$0;
      });
   }
}
