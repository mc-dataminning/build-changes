import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class oy extends ox<cre> {
   private final CompletableFuture<pc.c<dby>> d;
   private final Map<avr<dby>, avr<cre>> g = new HashMap<>();

   public oy(la $$0, CompletableFuture<in.a> $$1, CompletableFuture<pc.c<dby>> $$2) {
      super($$0, ks.F, $$1, $$0x -> $$0x.n().h());
      this.d = $$2;
   }

   public oy(la $$0, CompletableFuture<in.a> $$1, CompletableFuture<pc.c<cre>> $$2, CompletableFuture<pc.c<dby>> $$3) {
      super($$0, ks.F, $$1, $$2, $$0x -> $$0x.n().h());
      this.d = $$3;
   }

   protected void a(avr<dby> $$0, avr<cre> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<in.a> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            avo $$3 = this.c((avr<cre>)$$2);
            Optional<avo> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (in.a)$$0;
      });
   }
}
