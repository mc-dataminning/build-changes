import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public abstract class pc extends pn<ddr> {
   public pc(mk $$0, CompletableFuture<jt.a> $$1) {
      super($$0, mc.aP, $$1);
   }

   protected void a(jt.a $$0, akt<ddr>... $$1) {
      this.b(aws.a).a($$1);
      Set<akt<ddr>> $$2 = Set.of($$1);
      List<String> $$3 = $$0.d(mc.aP).c().filter($$1x -> !$$2.contains($$1x.e().get())).map(jr::g).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Not all enchantments were registered for tooltip ordering. Missing: " + String.join(", ", $$3));
      }
   }
}
