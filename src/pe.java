import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public abstract class pe extends pp<deh> {
   public pe(mm $$0, CompletableFuture<ju.a> $$1) {
      super($$0, me.aS, $$1);
   }

   protected void a(ju.a $$0, alc<deh>... $$1) {
      this.b(axc.a).a($$1);
      Set<alc<deh>> $$2 = Set.of($$1);
      List<String> $$3 = $$0.e(me.aS).c().filter($$1x -> !$$2.contains($$1x.e().get())).map(js::g).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Not all enchantments were registered for tooltip ordering. Missing: " + String.join(", ", $$3));
      }
   }
}
