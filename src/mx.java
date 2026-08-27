import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public abstract class mx extends mw<civ> {
   private final CompletableFuture<nb.c<csq>> d;
   private final Map<aqd<csq>, aqd<civ>> g = new HashMap<>();

   public mx(jm $$0, CompletableFuture<hi.b> $$1, CompletableFuture<nb.c<csq>> $$2) {
      super($$0, je.D, $$1, $$0x -> $$0x.j().g());
      this.d = $$2;
   }

   public mx(jm $$0, CompletableFuture<hi.b> $$1, CompletableFuture<nb.c<civ>> $$2, CompletableFuture<nb.c<csq>> $$3) {
      super($$0, je.D, $$1, $$2, $$0x -> $$0x.j().g());
      this.d = $$3;
   }

   protected void a(aqd<csq> $$0, aqd<civ> $$1) {
      this.g.put($$0, $$1);
   }

   @Override
   protected CompletableFuture<hi.b> b() {
      return super.b().thenCombineAsync(this.d, ($$0, $$1) -> {
         this.g.forEach(($$1x, $$2) -> {
            aqa $$3 = this.c((aqd<civ>)$$2);
            Optional<aqa> $$4 = $$1.apply($$1x);
            $$4.orElseThrow(() -> new IllegalStateException("Missing block tag " + $$2.b())).b().forEach($$3::a);
         });
         return (hi.b)$$0;
      });
   }
}
