import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public abstract class ps extends qd<dbn> {
   public ps(me $$0, CompletableFuture<jq.a> $$1) {
      super($$0, lw.aN, $$1);
   }

   protected void a(jq.a $$0, ald<dbn>... $$1) {
      this.b(awy.a).a($$1);
      Set<ald<dbn>> $$2 = Set.of($$1);
      List<String> $$3 = $$0.d(lw.aN).c().filter($$1x -> !$$2.contains($$1x.e().get())).map(jo::g).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Not all enchantments were registered for tooltip ordering. Missing: " + String.join(", ", $$3));
      }
   }
}
