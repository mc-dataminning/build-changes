import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class pz extends py<cvn> {
   private final CompletableFuture<qd.c<dhm>> d;
   private final Map<axl<dhm>, axl<cvn>> g = new HashMap<>();

   public pz(me $$0, CompletableFuture<jq.a> $$1, CompletableFuture<qd.c<dhm>> $$2) {
      super($$0, lw.K, $$1, $$0x -> $$0x.n().h());
      this.d = $$2;
   }

   public pz(me $$0, CompletableFuture<jq.a> $$1, CompletableFuture<qd.c<cvn>> $$2, CompletableFuture<qd.c<dhm>> $$3) {
      super($$0, lw.K, $$1, $$2, $$0x -> $$0x.n().h());
      this.d = $$3;
   }

   protected void a(axl<dhm> $$0, axl<cvn> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<jq.a> b() {
      return super.b().thenCombine(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            axi $$3 = this.c((axl<cvn>)$$2);
            Optional<axi> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (jq.a)$$0;
      });
   }
}
