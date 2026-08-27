import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class oe extends od<clj> {
   private final CompletableFuture<oi.c<cvf>> d;
   private final Map<arz<cvf>, arz<clj>> g = new HashMap<>();

   public oe(kl $$0, CompletableFuture<ii.b> $$1, CompletableFuture<oi.c<cvf>> $$2) {
      super($$0, kd.E, $$1, $$0x -> $$0x.j().g());
      this.d = $$2;
   }

   public oe(kl $$0, CompletableFuture<ii.b> $$1, CompletableFuture<oi.c<clj>> $$2, CompletableFuture<oi.c<cvf>> $$3) {
      super($$0, kd.E, $$1, $$2, $$0x -> $$0x.j().g());
      this.d = $$3;
   }

   protected void a(arz<cvf> $$0, arz<clj> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<ii.b> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            arw $$3 = this.c((arz<clj>)$$2);
            Optional<arw> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (ii.b)$$0;
      });
   }
}
