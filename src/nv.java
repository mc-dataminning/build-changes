import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class nv extends nu<cke> {
   private final CompletableFuture<nz.c<cua>> d;
   private final Map<arh<cua>, arh<cke>> g = new HashMap<>();

   public nv(kh $$0, CompletableFuture<id.b> $$1, CompletableFuture<nz.c<cua>> $$2) {
      super($$0, jz.E, $$1, $$0x -> $$0x.j().g());
      this.d = $$2;
   }

   public nv(kh $$0, CompletableFuture<id.b> $$1, CompletableFuture<nz.c<cke>> $$2, CompletableFuture<nz.c<cua>> $$3) {
      super($$0, jz.E, $$1, $$2, $$0x -> $$0x.j().g());
      this.d = $$3;
   }

   protected void a(arh<cua> $$0, arh<cke> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<id.b> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            are $$3 = this.c((arh<cke>)$$2);
            Optional<are> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (id.b)$$0;
      });
   }
}
