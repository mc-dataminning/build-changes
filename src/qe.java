import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class qe extends qd<cwi> {
   private final CompletableFuture<qi.c<diq>> d;
   private final Map<axs<diq>, axs<cwi>> g = new HashMap<>();

   public qe(mi $$0, CompletableFuture<js.a> $$1, CompletableFuture<qi.c<diq>> $$2) {
      super($$0, ma.K, $$1, $$0x -> $$0x.f().h());
      this.d = $$2;
   }

   public qe(mi $$0, CompletableFuture<js.a> $$1, CompletableFuture<qi.c<cwi>> $$2, CompletableFuture<qi.c<diq>> $$3) {
      super($$0, ma.K, $$1, $$2, $$0x -> $$0x.f().h());
      this.d = $$3;
   }

   protected void a(axs<diq> $$0, axs<cwi> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<js.a> b() {
      return super.b().thenCombine(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            axp $$3 = this.c((axs<cwi>)$$2);
            Optional<axp> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (js.a)$$0;
      });
   }
}
