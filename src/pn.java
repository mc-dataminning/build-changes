import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public abstract class pn extends py<daa> {
   public pn(mc $$0, CompletableFuture<jo.a> $$1) {
      super($$0, lu.aL, $$1);
   }

   protected void a(jo.a $$0, akp<daa>... $$1) {
      this.b(awg.a).a($$1);
      Set<akp<daa>> $$2 = Set.of($$1);
      List<String> $$3 = $$0.b(lu.aL).b().filter($$1x -> !$$2.contains($$1x.e().get())).map(jm::g).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Not all enchantments were registered for tooltip ordering. Missing: " + String.join(", ", $$3));
      }
   }
}
