import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class mu extends mt<cit> {
   private final CompletableFuture<my.c<csm>> d;
   private final Map<aqa<csm>, aqa<cit>> g = new HashMap<>();

   public mu(jk $$0, CompletableFuture<hg.b> $$1, CompletableFuture<my.c<csm>> $$2) {
      super($$0, jc.D, $$1, $$0x -> $$0x.j().g());
      this.d = $$2;
   }

   public mu(jk $$0, CompletableFuture<hg.b> $$1, CompletableFuture<my.c<cit>> $$2, CompletableFuture<my.c<csm>> $$3) {
      super($$0, jc.D, $$1, $$2, $$0x -> $$0x.j().g());
      this.d = $$3;
   }

   protected void a(aqa<csm> $$0, aqa<cit> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<hg.b> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            apx $$3 = this.c((aqa<cit>)$$2);
            Optional<apx> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (hg.b)$$0;
      });
   }
}
