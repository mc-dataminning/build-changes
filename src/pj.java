import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class pj extends pi<cwm> {
   private final CompletableFuture<pn.c<djn>> d;
   private final Map<axf<djn>, axf<cwm>> g = new HashMap<>();

   public pj(mk $$0, CompletableFuture<jt.a> $$1, CompletableFuture<pn.c<djn>> $$2) {
      super($$0, mc.K, $$1, $$0x -> $$0x.f().h());
      this.d = $$2;
   }

   public pj(mk $$0, CompletableFuture<jt.a> $$1, CompletableFuture<pn.c<cwm>> $$2, CompletableFuture<pn.c<djn>> $$3) {
      super($$0, mc.K, $$1, $$2, $$0x -> $$0x.f().h());
      this.d = $$3;
   }

   protected void a(axf<djn> $$0, axf<cwm> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<jt.a> b() {
      return super.b().thenCombine(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            axc $$3 = this.c((axf<cwm>)$$2);
            Optional<axc> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (jt.a)$$0;
      });
   }
}
