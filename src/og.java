import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class og extends of<cmt> {
   private final CompletableFuture<ok.c<cwq>> d;
   private final Map<asw<cwq>, asw<cmt>> g = new HashMap<>();

   public og(km $$0, CompletableFuture<ij.b> $$1, CompletableFuture<ok.c<cwq>> $$2) {
      super($$0, ke.F, $$1, $$0x -> $$0x.j().g());
      this.d = $$2;
   }

   public og(km $$0, CompletableFuture<ij.b> $$1, CompletableFuture<ok.c<cmt>> $$2, CompletableFuture<ok.c<cwq>> $$3) {
      super($$0, ke.F, $$1, $$2, $$0x -> $$0x.j().g());
      this.d = $$3;
   }

   protected void a(asw<cwq> $$0, asw<cmt> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<ij.b> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            ast $$3 = this.c((asw<cmt>)$$2);
            Optional<ast> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (ij.b)$$0;
      });
   }
}
