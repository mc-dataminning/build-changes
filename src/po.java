import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class po extends pn<czw> {
   private final CompletableFuture<ps.c<dne>> d;
   private final Map<axv<dne>, axv<czw>> g = new HashMap<>();

   public po(mq $$0, CompletableFuture<ji.a> $$1, CompletableFuture<ps.c<dne>> $$2) {
      super($$0, mi.K, $$1, $$0x -> $$0x.e().h());
      this.d = $$2;
   }

   public po(mq $$0, CompletableFuture<ji.a> $$1, CompletableFuture<ps.c<czw>> $$2, CompletableFuture<ps.c<dne>> $$3) {
      super($$0, mi.K, $$1, $$2, $$0x -> $$0x.e().h());
      this.d = $$3;
   }

   protected void a(axv<dne> $$0, axv<czw> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<ji.a> b() {
      return super.b().thenCombine(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            axs $$3 = this.c((axv<czw>)$$2);
            Optional<axs> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (ji.a)$$0;
      });
   }
}
