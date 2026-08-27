import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class na extends mz<cja> {
   private final CompletableFuture<ne.c<csv>> d;
   private final Map<aqi<csv>, aqi<cja>> g = new HashMap<>();

   public na(jm $$0, CompletableFuture<hi.b> $$1, CompletableFuture<ne.c<csv>> $$2) {
      super($$0, je.D, $$1, $$0x -> $$0x.j().g());
      this.d = $$2;
   }

   public na(jm $$0, CompletableFuture<hi.b> $$1, CompletableFuture<ne.c<cja>> $$2, CompletableFuture<ne.c<csv>> $$3) {
      super($$0, je.D, $$1, $$2, $$0x -> $$0x.j().g());
      this.d = $$3;
   }

   protected void a(aqi<csv> $$0, aqi<cja> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<hi.b> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            aqf $$3 = this.c((aqi<cja>)$$2);
            Optional<aqf> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (hi.b)$$0;
      });
   }
}
