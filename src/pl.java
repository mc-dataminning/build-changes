import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class pl extends pk<cxu> {
   private final CompletableFuture<pp.c<dku>> d;
   private final Map<axp<dku>, axp<cxu>> g = new HashMap<>();

   public pl(mm $$0, CompletableFuture<ju.a> $$1, CompletableFuture<pp.c<dku>> $$2) {
      super($$0, me.K, $$1, $$0x -> $$0x.f().h());
      this.d = $$2;
   }

   public pl(mm $$0, CompletableFuture<ju.a> $$1, CompletableFuture<pp.c<cxu>> $$2, CompletableFuture<pp.c<dku>> $$3) {
      super($$0, me.K, $$1, $$2, $$0x -> $$0x.f().h());
      this.d = $$3;
   }

   protected void a(axp<dku> $$0, axp<cxu> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<ju.a> b() {
      return super.b().thenCombine(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            axm $$3 = this.c((axp<cxu>)$$2);
            Optional<axm> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (ju.a)$$0;
      });
   }
}
