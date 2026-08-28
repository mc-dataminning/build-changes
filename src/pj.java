import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class pj extends pi<cwk> {
   private final CompletableFuture<pn.c<djl>> d;
   private final Map<axf<djl>, axf<cwk>> g = new HashMap<>();

   public pj(mk $$0, CompletableFuture<jt.a> $$1, CompletableFuture<pn.c<djl>> $$2) {
      super($$0, mc.K, $$1, $$0x -> $$0x.f().h());
      this.d = $$2;
   }

   public pj(mk $$0, CompletableFuture<jt.a> $$1, CompletableFuture<pn.c<cwk>> $$2, CompletableFuture<pn.c<djl>> $$3) {
      super($$0, mc.K, $$1, $$2, $$0x -> $$0x.f().h());
      this.d = $$3;
   }

   protected void a(axf<djl> $$0, axf<cwk> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<jt.a> b() {
      return super.b().thenCombine(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            axc $$3 = this.c((axf<cwk>)$$2);
            Optional<axc> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (jt.a)$$0;
      });
   }
}
