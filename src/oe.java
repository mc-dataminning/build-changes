import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class oe extends od<cmm> {
   private final CompletableFuture<oi.c<cwj>> d;
   private final Map<asq<cwj>, asq<cmm>> g = new HashMap<>();

   public oe(km $$0, CompletableFuture<ij.b> $$1, CompletableFuture<oi.c<cwj>> $$2) {
      super($$0, ke.F, $$1, $$0x -> $$0x.j().g());
      this.d = $$2;
   }

   public oe(km $$0, CompletableFuture<ij.b> $$1, CompletableFuture<oi.c<cmm>> $$2, CompletableFuture<oi.c<cwj>> $$3) {
      super($$0, ke.F, $$1, $$2, $$0x -> $$0x.j().g());
      this.d = $$3;
   }

   protected void a(asq<cwj> $$0, asq<cmm> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<ij.b> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            asn $$3 = this.c((asq<cmm>)$$2);
            Optional<asn> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (ij.b)$$0;
      });
   }
}
