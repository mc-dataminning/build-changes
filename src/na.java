import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class na extends mz<cjc> {
   private final CompletableFuture<ne.c<csx>> d;
   private final Map<aqj<csx>, aqj<cjc>> g = new HashMap<>();

   public na(jm $$0, CompletableFuture<hi.b> $$1, CompletableFuture<ne.c<csx>> $$2) {
      super($$0, je.D, $$1, $$0x -> $$0x.j().g());
      this.d = $$2;
   }

   public na(jm $$0, CompletableFuture<hi.b> $$1, CompletableFuture<ne.c<cjc>> $$2, CompletableFuture<ne.c<csx>> $$3) {
      super($$0, je.D, $$1, $$2, $$0x -> $$0x.j().g());
      this.d = $$3;
   }

   protected void a(aqj<csx> $$0, aqj<cjc> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<hi.b> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            aqg $$3 = this.c((aqj<cjc>)$$2);
            Optional<aqg> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (hi.b)$$0;
      });
   }
}
