import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class nz extends ny<ckw> {
   private final CompletableFuture<od.c<cut>> d;
   private final Map<arr<cut>, arr<ckw>> g = new HashMap<>();

   public nz(kh $$0, CompletableFuture<id.b> $$1, CompletableFuture<od.c<cut>> $$2) {
      super($$0, jz.E, $$1, $$0x -> $$0x.j().g());
      this.d = $$2;
   }

   public nz(kh $$0, CompletableFuture<id.b> $$1, CompletableFuture<od.c<ckw>> $$2, CompletableFuture<od.c<cut>> $$3) {
      super($$0, jz.E, $$1, $$2, $$0x -> $$0x.j().g());
      this.d = $$3;
   }

   protected void a(arr<cut> $$0, arr<ckw> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<id.b> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            aro $$3 = this.c((arr<ckw>)$$2);
            Optional<aro> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (id.b)$$0;
      });
   }
}
