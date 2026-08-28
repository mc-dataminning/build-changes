import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class py extends px<cvg> {
   private final CompletableFuture<qc.c<dgv>> d;
   private final Map<axi<dgv>, axi<cvg>> g = new HashMap<>();

   public py(md $$0, CompletableFuture<jp.a> $$1, CompletableFuture<qc.c<dgv>> $$2) {
      super($$0, lv.K, $$1, $$0x -> $$0x.o().h());
      this.d = $$2;
   }

   public py(md $$0, CompletableFuture<jp.a> $$1, CompletableFuture<qc.c<cvg>> $$2, CompletableFuture<qc.c<dgv>> $$3) {
      super($$0, lv.K, $$1, $$2, $$0x -> $$0x.o().h());
      this.d = $$3;
   }

   protected void a(axi<dgv> $$0, axi<cvg> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<jp.a> b() {
      return super.b().thenCombine(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            axf $$3 = this.c((axi<cvg>)$$2);
            Optional<axf> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (jp.a)$$0;
      });
   }
}
