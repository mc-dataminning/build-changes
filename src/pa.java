import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class pa extends oz<crn> {
   private final CompletableFuture<pe.c<dch>> d;
   private final Map<avt<dch>, avt<crn>> g = new HashMap<>();

   public pa(lc $$0, CompletableFuture<ip.a> $$1, CompletableFuture<pe.c<dch>> $$2) {
      super($$0, ku.G, $$1, $$0x -> $$0x.n().h());
      this.d = $$2;
   }

   public pa(lc $$0, CompletableFuture<ip.a> $$1, CompletableFuture<pe.c<crn>> $$2, CompletableFuture<pe.c<dch>> $$3) {
      super($$0, ku.G, $$1, $$2, $$0x -> $$0x.n().h());
      this.d = $$3;
   }

   protected void a(avt<dch> $$0, avt<crn> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<ip.a> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            avq $$3 = this.c((avt<crn>)$$2);
            Optional<avq> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (ip.a)$$0;
      });
   }
}
