import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class oc extends ob<cmc> {
   private final CompletableFuture<og.c<cvz>> d;
   private final Map<asg<cvz>, asg<cmc>> g = new HashMap<>();

   public oc(kk $$0, CompletableFuture<ih.b> $$1, CompletableFuture<og.c<cvz>> $$2) {
      super($$0, kc.F, $$1, $$0x -> $$0x.j().g());
      this.d = $$2;
   }

   public oc(kk $$0, CompletableFuture<ih.b> $$1, CompletableFuture<og.c<cmc>> $$2, CompletableFuture<og.c<cvz>> $$3) {
      super($$0, kc.F, $$1, $$2, $$0x -> $$0x.j().g());
      this.d = $$3;
   }

   protected void a(asg<cvz> $$0, asg<cmc> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<ih.b> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            asd $$3 = this.c((asg<cmc>)$$2);
            Optional<asd> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (ih.b)$$0;
      });
   }
}
