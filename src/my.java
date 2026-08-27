import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class my extends mx<cjg> {
   private final CompletableFuture<nc.c<ctc>> d;
   private final Map<aqk<ctc>, aqk<cjg>> g = new HashMap<>();

   public my(jk $$0, CompletableFuture<hg.b> $$1, CompletableFuture<nc.c<ctc>> $$2) {
      super($$0, jc.E, $$1, $$0x -> $$0x.j().g());
      this.d = $$2;
   }

   public my(jk $$0, CompletableFuture<hg.b> $$1, CompletableFuture<nc.c<cjg>> $$2, CompletableFuture<nc.c<ctc>> $$3) {
      super($$0, jc.E, $$1, $$2, $$0x -> $$0x.j().g());
      this.d = $$3;
   }

   protected void a(aqk<ctc> $$0, aqk<cjg> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<hg.b> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            aqh $$3 = this.c((aqk<cjg>)$$2);
            Optional<aqh> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (hg.b)$$0;
      });
   }
}
