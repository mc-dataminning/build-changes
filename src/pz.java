import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class pz extends py<cuj> {
   private final CompletableFuture<qd.c<dey>> d;
   private final Map<axe<dey>, axe<cuj>> g = new HashMap<>();

   public pz(ly $$0, CompletableFuture<jk.a> $$1, CompletableFuture<qd.c<dey>> $$2) {
      super($$0, lq.G, $$1, $$0x -> $$0x.o().h());
      this.d = $$2;
   }

   public pz(ly $$0, CompletableFuture<jk.a> $$1, CompletableFuture<qd.c<cuj>> $$2, CompletableFuture<qd.c<dey>> $$3) {
      super($$0, lq.G, $$1, $$2, $$0x -> $$0x.o().h());
      this.d = $$3;
   }

   protected void a(axe<dey> $$0, axe<cuj> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<jk.a> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            axb $$3 = this.c((axe<cuj>)$$2);
            Optional<axb> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (jk.a)$$0;
      });
   }
}
