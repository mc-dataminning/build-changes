import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class om extends ol<cqh> {
   private final CompletableFuture<oq.c<dac>> d;
   private final Map<avd<dac>, avd<cqh>> g = new HashMap<>();

   public om(kr $$0, CompletableFuture<in.a> $$1, CompletableFuture<oq.c<dac>> $$2) {
      super($$0, kj.F, $$1, $$0x -> $$0x.k().h());
      this.d = $$2;
   }

   public om(kr $$0, CompletableFuture<in.a> $$1, CompletableFuture<oq.c<cqh>> $$2, CompletableFuture<oq.c<dac>> $$3) {
      super($$0, kj.F, $$1, $$2, $$0x -> $$0x.k().h());
      this.d = $$3;
   }

   protected void a(avd<dac> $$0, avd<cqh> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<in.a> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            ava $$3 = this.c((avd<cqh>)$$2);
            Optional<ava> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (in.a)$$0;
      });
   }
}
