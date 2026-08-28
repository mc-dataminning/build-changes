import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class qg extends qf<cwb> {
   private final CompletableFuture<qk.c<dij>> d;
   private final Map<axt<dij>, axt<cwb>> g = new HashMap<>();

   public qg(mi $$0, CompletableFuture<js.a> $$1, CompletableFuture<qk.c<dij>> $$2) {
      super($$0, ma.K, $$1, $$0x -> $$0x.f().h());
      this.d = $$2;
   }

   public qg(mi $$0, CompletableFuture<js.a> $$1, CompletableFuture<qk.c<cwb>> $$2, CompletableFuture<qk.c<dij>> $$3) {
      super($$0, ma.K, $$1, $$2, $$0x -> $$0x.f().h());
      this.d = $$3;
   }

   protected void a(axt<dij> $$0, axt<cwb> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<js.a> b() {
      return super.b().thenCombine(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            axq $$3 = this.c((axt<cwb>)$$2);
            Optional<axq> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (js.a)$$0;
      });
   }
}
