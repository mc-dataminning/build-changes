import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public abstract class qe extends qp<ddy> {
   public qe(mj $$0, CompletableFuture<js.a> $$1) {
      super($$0, mb.aO, $$1);
   }

   protected void a(js.a $$0, aly<ddy>... $$1) {
      this.b(axx.a).a($$1);
      Set<aly<ddy>> $$2 = Set.of($$1);
      List<String> $$3 = $$0.d(mb.aO).c().filter($$1x -> !$$2.contains($$1x.e().get())).map(jq::g).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Not all enchantments were registered for tooltip ordering. Missing: " + String.join(", ", $$3));
      }
   }
}
