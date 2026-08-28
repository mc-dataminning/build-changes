import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class qd extends qc<cvx> {
   private final CompletableFuture<qh.c<die>> d;
   private final Map<axq<die>, axq<cvx>> g = new HashMap<>();

   public qd(mh $$0, CompletableFuture<js.a> $$1, CompletableFuture<qh.c<die>> $$2) {
      super($$0, lz.K, $$1, $$0x -> $$0x.f().h());
      this.d = $$2;
   }

   public qd(mh $$0, CompletableFuture<js.a> $$1, CompletableFuture<qh.c<cvx>> $$2, CompletableFuture<qh.c<die>> $$3) {
      super($$0, lz.K, $$1, $$2, $$0x -> $$0x.f().h());
      this.d = $$3;
   }

   protected void a(axq<die> $$0, axq<cvx> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<js.a> b() {
      return super.b().thenCombine(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            axn $$3 = this.c((axq<cvx>)$$2);
            Optional<axn> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (js.a)$$0;
      });
   }
}
