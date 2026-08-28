import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public abstract class pg extends pr<dfx> {
   public pg(mp $$0, CompletableFuture<jh.a> $$1) {
      super($$0, mh.aR, $$1);
   }

   protected void a(jh.a $$0, alf<dfx>... $$1) {
      this.b(axe.a).a($$1);
      Set<alf<dfx>> $$2 = Set.of($$1);
      List<String> $$3 = $$0.e(mh.aR).c().filter($$1x -> !$$2.contains($$1x.e().get())).map(jf::g).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Not all enchantments were registered for tooltip ordering. Missing: " + String.join(", ", $$3));
      }
   }
}
