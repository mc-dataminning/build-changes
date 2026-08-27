import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class oi extends oh<cou> {
   private final CompletableFuture<om.c<cyo>> d;
   private final Map<auo<cyo>, auo<cou>> g = new HashMap<>();

   public oi(ko $$0, CompletableFuture<il.b> $$1, CompletableFuture<om.c<cyo>> $$2) {
      super($$0, kg.F, $$1, $$0x -> $$0x.i().h());
      this.d = $$2;
   }

   public oi(ko $$0, CompletableFuture<il.b> $$1, CompletableFuture<om.c<cou>> $$2, CompletableFuture<om.c<cyo>> $$3) {
      super($$0, kg.F, $$1, $$2, $$0x -> $$0x.i().h());
      this.d = $$3;
   }

   protected void a(auo<cyo> $$0, auo<cou> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<il.b> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            aul $$3 = this.c((auo<cou>)$$2);
            Optional<aul> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (il.b)$$0;
      });
   }
}
