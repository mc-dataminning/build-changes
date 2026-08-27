import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class oa extends nz<cle> {
   private final CompletableFuture<oe.c<cva>> d;
   private final Map<arv<cva>, arv<cle>> g = new HashMap<>();

   public oa(kh $$0, CompletableFuture<id.b> $$1, CompletableFuture<oe.c<cva>> $$2) {
      super($$0, jz.E, $$1, $$0x -> $$0x.j().g());
      this.d = $$2;
   }

   public oa(kh $$0, CompletableFuture<id.b> $$1, CompletableFuture<oe.c<cle>> $$2, CompletableFuture<oe.c<cva>> $$3) {
      super($$0, jz.E, $$1, $$2, $$0x -> $$0x.j().g());
      this.d = $$3;
   }

   protected void a(arv<cva> $$0, arv<cle> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<id.b> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            ars $$3 = this.c((arv<cle>)$$2);
            Optional<ars> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (id.b)$$0;
      });
   }
}
