import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class pp extends po<cuc> {
   private final CompletableFuture<pt.c<dfc>> d;
   private final Map<awt<dfc>, awt<cuc>> g = new HashMap<>();

   public pp(lq $$0, CompletableFuture<jc.a> $$1, CompletableFuture<pt.c<dfc>> $$2) {
      super($$0, li.G, $$1, $$0x -> $$0x.n().h());
      this.d = $$2;
   }

   public pp(lq $$0, CompletableFuture<jc.a> $$1, CompletableFuture<pt.c<cuc>> $$2, CompletableFuture<pt.c<dfc>> $$3) {
      super($$0, li.G, $$1, $$2, $$0x -> $$0x.n().h());
      this.d = $$3;
   }

   protected void a(awt<dfc> $$0, awt<cuc> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<jc.a> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            awq $$3 = this.c((awt<cuc>)$$2);
            Optional<awq> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (jc.a)$$0;
      });
   }
}
