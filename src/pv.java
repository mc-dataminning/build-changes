import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class pv extends pu<cul> {
   private final CompletableFuture<pz.c<dfy>> d;
   private final Map<awu<dfy>, awu<cul>> g = new HashMap<>();

   public pv(mc $$0, CompletableFuture<jo.a> $$1, CompletableFuture<pz.c<dfy>> $$2) {
      super($$0, lu.K, $$1, $$0x -> $$0x.o().h());
      this.d = $$2;
   }

   public pv(mc $$0, CompletableFuture<jo.a> $$1, CompletableFuture<pz.c<cul>> $$2, CompletableFuture<pz.c<dfy>> $$3) {
      super($$0, lu.K, $$1, $$2, $$0x -> $$0x.o().h());
      this.d = $$3;
   }

   protected void a(awu<dfy> $$0, awu<cul> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<jo.a> b() {
      return super.b().thenCombine(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            awr $$3 = this.c((awu<cul>)$$2);
            Optional<awr> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (jo.a)$$0;
      });
   }
}
