import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class pk extends pj<csu> {
   private final CompletableFuture<po.c<dde>> d;
   private final Map<awg<dde>, awg<csu>> g = new HashMap<>();

   public pk(lm $$0, CompletableFuture<iy.a> $$1, CompletableFuture<po.c<dde>> $$2) {
      super($$0, le.G, $$1, $$0x -> $$0x.n().h());
      this.d = $$2;
   }

   public pk(lm $$0, CompletableFuture<iy.a> $$1, CompletableFuture<po.c<csu>> $$2, CompletableFuture<po.c<dde>> $$3) {
      super($$0, le.G, $$1, $$2, $$0x -> $$0x.n().h());
      this.d = $$3;
   }

   protected void a(awg<dde> $$0, awg<csu> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<iy.a> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            awd $$3 = this.c((awg<csu>)$$2);
            Optional<awd> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (iy.a)$$0;
      });
   }
}
