import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class qc extends qb<cvt> {
   private final CompletableFuture<qg.c<dhy>> d;
   private final Map<axp<dhy>, axp<cvt>> g = new HashMap<>();

   public qc(mg $$0, CompletableFuture<jr.a> $$1, CompletableFuture<qg.c<dhy>> $$2) {
      super($$0, ly.K, $$1, $$0x -> $$0x.f().h());
      this.d = $$2;
   }

   public qc(mg $$0, CompletableFuture<jr.a> $$1, CompletableFuture<qg.c<cvt>> $$2, CompletableFuture<qg.c<dhy>> $$3) {
      super($$0, ly.K, $$1, $$2, $$0x -> $$0x.f().h());
      this.d = $$3;
   }

   protected void a(axp<dhy> $$0, axp<cvt> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<jr.a> b() {
      return super.b().thenCombine(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            axm $$3 = this.c((axp<cvt>)$$2);
            Optional<axm> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (jr.a)$$0;
      });
   }
}
