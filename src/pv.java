import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public abstract class pv extends qg<dbm> {
   public pv(mg $$0, CompletableFuture<jr.a> $$1) {
      super($$0, ly.aM, $$1);
   }

   protected void a(jr.a $$0, alg<dbm>... $$1) {
      this.b(axc.a).a($$1);
      Set<alg<dbm>> $$2 = Set.of($$1);
      List<String> $$3 = $$0.d(ly.aM).c().filter($$1x -> !$$2.contains($$1x.e().get())).map(jp::g).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Not all enchantments were registered for tooltip ordering. Missing: " + String.join(", ", $$3));
      }
   }
}
