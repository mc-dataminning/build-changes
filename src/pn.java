import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class pn extends pm<ctj> {
   private final CompletableFuture<pr.c<ddy>> d;
   private final Map<awl<ddy>, awl<ctj>> g = new HashMap<>();

   public pn(ln $$0, CompletableFuture<iz.a> $$1, CompletableFuture<pr.c<ddy>> $$2) {
      super($$0, lf.G, $$1, $$0x -> $$0x.n().h());
      this.d = $$2;
   }

   public pn(ln $$0, CompletableFuture<iz.a> $$1, CompletableFuture<pr.c<ctj>> $$2, CompletableFuture<pr.c<ddy>> $$3) {
      super($$0, lf.G, $$1, $$2, $$0x -> $$0x.n().h());
      this.d = $$3;
   }

   protected void a(awl<ddy> $$0, awl<ctj> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<iz.a> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            awi $$3 = this.c((awl<ctj>)$$2);
            Optional<awi> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (iz.a)$$0;
      });
   }
}
