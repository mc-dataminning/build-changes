import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class pz extends py<cum> {
   private final CompletableFuture<qd.c<dfb>> d;
   private final Map<axf<dfb>, axf<cum>> g = new HashMap<>();

   public pz(ly $$0, CompletableFuture<jk.a> $$1, CompletableFuture<qd.c<dfb>> $$2) {
      super($$0, lq.G, $$1, $$0x -> $$0x.o().h());
      this.d = $$2;
   }

   public pz(ly $$0, CompletableFuture<jk.a> $$1, CompletableFuture<qd.c<cum>> $$2, CompletableFuture<qd.c<dfb>> $$3) {
      super($$0, lq.G, $$1, $$2, $$0x -> $$0x.o().h());
      this.d = $$3;
   }

   protected void a(axf<dfb> $$0, axf<cum> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<jk.a> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            axc $$3 = this.c((axf<cum>)$$2);
            Optional<axc> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (jk.a)$$0;
      });
   }
}
