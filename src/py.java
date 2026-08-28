import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class py extends px<cvk> {
   private final CompletableFuture<qc.c<dhj>> d;
   private final Map<axj<dhj>, axj<cvk>> g = new HashMap<>();

   public py(md $$0, CompletableFuture<jp.a> $$1, CompletableFuture<qc.c<dhj>> $$2) {
      super($$0, lv.K, $$1, $$0x -> $$0x.n().h());
      this.d = $$2;
   }

   public py(md $$0, CompletableFuture<jp.a> $$1, CompletableFuture<qc.c<cvk>> $$2, CompletableFuture<qc.c<dhj>> $$3) {
      super($$0, lv.K, $$1, $$2, $$0x -> $$0x.n().h());
      this.d = $$3;
   }

   protected void a(axj<dhj> $$0, axj<cvk> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<jp.a> b() {
      return super.b().thenCombine(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            axg $$3 = this.c((axj<cvk>)$$2);
            Optional<axg> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (jp.a)$$0;
      });
   }
}
