import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class qf extends qe<cxc> {
   private final CompletableFuture<qj.c<dkd>> d;
   private final Map<aya<dkd>, aya<cxc>> g = new HashMap<>();

   public qf(mj $$0, CompletableFuture<js.a> $$1, CompletableFuture<qj.c<dkd>> $$2) {
      super($$0, mb.K, $$1, $$0x -> $$0x.f().h());
      this.d = $$2;
   }

   public qf(mj $$0, CompletableFuture<js.a> $$1, CompletableFuture<qj.c<cxc>> $$2, CompletableFuture<qj.c<dkd>> $$3) {
      super($$0, mb.K, $$1, $$2, $$0x -> $$0x.f().h());
      this.d = $$3;
   }

   protected void a(aya<dkd> $$0, aya<cxc> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<js.a> b() {
      return super.b().thenCombine(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            axx $$3 = this.c((aya<cxc>)$$2);
            Optional<axx> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (js.a)$$0;
      });
   }
}
