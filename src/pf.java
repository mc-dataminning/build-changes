import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public abstract class pf extends pq<dfq> {
   public pf(mo $$0, CompletableFuture<jg.a> $$1) {
      super($$0, mg.aR, $$1);
   }

   protected void a(jg.a $$0, alf<dfq>... $$1) {
      this.b(axe.a).a($$1);
      Set<alf<dfq>> $$2 = Set.of($$1);
      List<String> $$3 = $$0.e(mg.aR).c().filter($$1x -> !$$2.contains($$1x.e().get())).map(je::g).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Not all enchantments were registered for tooltip ordering. Missing: " + String.join(", ", $$3));
      }
   }
}
