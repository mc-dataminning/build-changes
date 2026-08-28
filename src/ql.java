import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class ql extends qk<cxk> {
   private final CompletableFuture<qp.c<dkl>> d;
   private final Map<ayk<dkl>, ayk<cxk>> g = new HashMap<>();

   public ql(mj $$0, CompletableFuture<js.a> $$1, CompletableFuture<qp.c<dkl>> $$2) {
      super($$0, mb.K, $$1, $$0x -> $$0x.f().h());
      this.d = $$2;
   }

   public ql(mj $$0, CompletableFuture<js.a> $$1, CompletableFuture<qp.c<cxk>> $$2, CompletableFuture<qp.c<dkl>> $$3) {
      super($$0, mb.K, $$1, $$2, $$0x -> $$0x.f().h());
      this.d = $$3;
   }

   protected void a(ayk<dkl> $$0, ayk<cxk> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<js.a> b() {
      return super.b().thenCombine(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            ayh $$3 = this.c((ayk<cxk>)$$2);
            Optional<ayh> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (js.a)$$0;
      });
   }
}
