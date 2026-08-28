import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class pn extends pm<czg> {
   private final CompletableFuture<pr.c<dmm>> d;
   private final Map<axr<dmm>, axr<czg>> g = new HashMap<>();

   public pn(mp $$0, CompletableFuture<jh.a> $$1, CompletableFuture<pr.c<dmm>> $$2) {
      super($$0, mh.K, $$1, $$0x -> $$0x.e().h());
      this.d = $$2;
   }

   public pn(mp $$0, CompletableFuture<jh.a> $$1, CompletableFuture<pr.c<czg>> $$2, CompletableFuture<pr.c<dmm>> $$3) {
      super($$0, mh.K, $$1, $$2, $$0x -> $$0x.e().h());
      this.d = $$3;
   }

   protected void a(axr<dmm> $$0, axr<czg> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<jh.a> b() {
      return super.b().thenCombine(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            axo $$3 = this.c((axr<czg>)$$2);
            Optional<axo> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (jh.a)$$0;
      });
   }
}
