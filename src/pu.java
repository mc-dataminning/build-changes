import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class pu extends pt<cuj> {
   private final CompletableFuture<py.c<dfw>> d;
   private final Map<awt<dfw>, awt<cuj>> g = new HashMap<>();

   public pu(mc $$0, CompletableFuture<jo.a> $$1, CompletableFuture<py.c<dfw>> $$2) {
      super($$0, lu.K, $$1, $$0x -> $$0x.o().h());
      this.d = $$2;
   }

   public pu(mc $$0, CompletableFuture<jo.a> $$1, CompletableFuture<py.c<cuj>> $$2, CompletableFuture<py.c<dfw>> $$3) {
      super($$0, lu.K, $$1, $$2, $$0x -> $$0x.o().h());
      this.d = $$3;
   }

   protected void a(awt<dfw> $$0, awt<cuj> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<jo.a> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            awq $$3 = this.c((awt<cuj>)$$2);
            Optional<awq> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (jo.a)$$0;
      });
   }
}
