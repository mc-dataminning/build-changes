import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class og extends of<cms> {
   private final CompletableFuture<ok.c<cwp>> d;
   private final Map<asv<cwp>, asv<cms>> g = new HashMap<>();

   public og(km $$0, CompletableFuture<ij.b> $$1, CompletableFuture<ok.c<cwp>> $$2) {
      super($$0, ke.F, $$1, $$0x -> $$0x.j().g());
      this.d = $$2;
   }

   public og(km $$0, CompletableFuture<ij.b> $$1, CompletableFuture<ok.c<cms>> $$2, CompletableFuture<ok.c<cwp>> $$3) {
      super($$0, ke.F, $$1, $$2, $$0x -> $$0x.j().g());
      this.d = $$3;
   }

   protected void a(asv<cwp> $$0, asv<cms> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<ij.b> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            ass $$3 = this.c((asv<cms>)$$2);
            Optional<ass> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (ij.b)$$0;
      });
   }
}
