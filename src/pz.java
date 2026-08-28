import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public abstract class pz extends qk<dbw> {
   public pz(mi $$0, CompletableFuture<js.a> $$1) {
      super($$0, ma.aM, $$1);
   }

   protected void a(js.a $$0, alk<dbw>... $$1) {
      this.b(axg.a).a($$1);
      Set<alk<dbw>> $$2 = Set.of($$1);
      List<String> $$3 = $$0.d(ma.aM).c().filter($$1x -> !$$2.contains($$1x.e().get())).map(jq::g).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Not all enchantments were registered for tooltip ordering. Missing: " + String.join(", ", $$3));
      }
   }
}
