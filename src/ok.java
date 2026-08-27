import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class ok extends oj<cpl> {
   private final CompletableFuture<oo.c<czf>> d;
   private final Map<aut<czf>, aut<cpl>> g = new HashMap<>();

   public ok(kq $$0, CompletableFuture<in.a> $$1, CompletableFuture<oo.c<czf>> $$2) {
      super($$0, ki.F, $$1, $$0x -> $$0x.k().h());
      this.d = $$2;
   }

   public ok(kq $$0, CompletableFuture<in.a> $$1, CompletableFuture<oo.c<cpl>> $$2, CompletableFuture<oo.c<czf>> $$3) {
      super($$0, ki.F, $$1, $$2, $$0x -> $$0x.k().h());
      this.d = $$3;
   }

   protected void a(aut<czf> $$0, aut<cpl> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<in.a> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            auq $$3 = this.c((aut<cpl>)$$2);
            Optional<auq> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (in.a)$$0;
      });
   }
}
