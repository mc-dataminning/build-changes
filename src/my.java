import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class my extends mx<cja> {
   private final CompletableFuture<nc.c<csv>> d;
   private final Map<aqh<csv>, aqh<cja>> g = new HashMap<>();

   public my(jk $$0, CompletableFuture<hg.b> $$1, CompletableFuture<nc.c<csv>> $$2) {
      super($$0, jc.D, $$1, $$0x -> $$0x.j().g());
      this.d = $$2;
   }

   public my(jk $$0, CompletableFuture<hg.b> $$1, CompletableFuture<nc.c<cja>> $$2, CompletableFuture<nc.c<csv>> $$3) {
      super($$0, jc.D, $$1, $$2, $$0x -> $$0x.j().g());
      this.d = $$3;
   }

   protected void a(aqh<csv> $$0, aqh<cja> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<hg.b> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            aqe $$3 = this.c((aqh<cja>)$$2);
            Optional<aqe> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (hg.b)$$0;
      });
   }
}
