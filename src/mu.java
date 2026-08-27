import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class mu extends mt<cfu> {
   private final CompletableFuture<my.c<cpn>> d;
   private final Map<anl<cpn>, anl<cfu>> g = new HashMap<>();

   public mu(jk $$0, CompletableFuture<hg.b> $$1, CompletableFuture<my.c<cpn>> $$2) {
      super($$0, jc.D, $$1, $$0x -> $$0x.j().g());
      this.d = $$2;
   }

   public mu(jk $$0, CompletableFuture<hg.b> $$1, CompletableFuture<my.c<cfu>> $$2, CompletableFuture<my.c<cpn>> $$3) {
      super($$0, jc.D, $$1, $$2, $$0x -> $$0x.j().g());
      this.d = $$3;
   }

   protected void a(anl<cpn> $$0, anl<cfu> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<hg.b> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            ani $$3 = this.c((anl<cfu>)$$2);
            Optional<ani> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (hg.b)$$0;
      });
   }
}
