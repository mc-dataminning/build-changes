import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class pz extends py<cuk> {
   private final CompletableFuture<qd.c<dez>> d;
   private final Map<axf<dez>, axf<cuk>> g = new HashMap<>();

   public pz(ly $$0, CompletableFuture<jk.a> $$1, CompletableFuture<qd.c<dez>> $$2) {
      super($$0, lq.G, $$1, $$0x -> $$0x.o().h());
      this.d = $$2;
   }

   public pz(ly $$0, CompletableFuture<jk.a> $$1, CompletableFuture<qd.c<cuk>> $$2, CompletableFuture<qd.c<dez>> $$3) {
      super($$0, lq.G, $$1, $$2, $$0x -> $$0x.o().h());
      this.d = $$3;
   }

   protected void a(axf<dez> $$0, axf<cuk> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<jk.a> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            axc $$3 = this.c((axf<cuk>)$$2);
            Optional<axc> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (jk.a)$$0;
      });
   }
}
