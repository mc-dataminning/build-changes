import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class og extends of<cnb> {
   private final CompletableFuture<ok.c<cwy>> d;
   private final Map<asx<cwy>, asx<cnb>> g = new HashMap<>();

   public og(km $$0, CompletableFuture<ij.b> $$1, CompletableFuture<ok.c<cwy>> $$2) {
      super($$0, ke.F, $$1, $$0x -> $$0x.i().h());
      this.d = $$2;
   }

   public og(km $$0, CompletableFuture<ij.b> $$1, CompletableFuture<ok.c<cnb>> $$2, CompletableFuture<ok.c<cwy>> $$3) {
      super($$0, ke.F, $$1, $$2, $$0x -> $$0x.i().h());
      this.d = $$3;
   }

   protected void a(asx<cwy> $$0, asx<cnb> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<ij.b> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            asu $$3 = this.c((asx<cnb>)$$2);
            Optional<asu> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (ij.b)$$0;
      });
   }
}
