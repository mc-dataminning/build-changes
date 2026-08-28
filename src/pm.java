import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class pm extends pl<cyz> {
   private final CompletableFuture<pq.c<dmf>> d;
   private final Map<axr<dmf>, axr<cyz>> g = new HashMap<>();

   public pm(mo $$0, CompletableFuture<jg.a> $$1, CompletableFuture<pq.c<dmf>> $$2) {
      super($$0, mg.K, $$1, $$0x -> $$0x.e().h());
      this.d = $$2;
   }

   public pm(mo $$0, CompletableFuture<jg.a> $$1, CompletableFuture<pq.c<cyz>> $$2, CompletableFuture<pq.c<dmf>> $$3) {
      super($$0, mg.K, $$1, $$2, $$0x -> $$0x.e().h());
      this.d = $$3;
   }

   protected void a(axr<dmf> $$0, axr<cyz> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<jg.a> b() {
      return super.b().thenCombine(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            axo $$3 = this.c((axr<cyz>)$$2);
            Optional<axo> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (jg.a)$$0;
      });
   }
}
