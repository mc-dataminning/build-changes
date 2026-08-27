import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class mv extends mu<cir> {
   private final CompletableFuture<mz.c<csk>> d;
   private final Map<apy<csk>, apy<cir>> g = new HashMap<>();

   public mv(jl $$0, CompletableFuture<hh.b> $$1, CompletableFuture<mz.c<csk>> $$2) {
      super($$0, jd.D, $$1, $$0x -> $$0x.j().g());
      this.d = $$2;
   }

   public mv(jl $$0, CompletableFuture<hh.b> $$1, CompletableFuture<mz.c<cir>> $$2, CompletableFuture<mz.c<csk>> $$3) {
      super($$0, jd.D, $$1, $$2, $$0x -> $$0x.j().g());
      this.d = $$3;
   }

   protected void a(apy<csk> $$0, apy<cir> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<hh.b> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            apv $$3 = this.c((apy<cir>)$$2);
            Optional<apv> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (hh.b)$$0;
      });
   }
}
