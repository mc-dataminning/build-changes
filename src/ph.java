import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public abstract class ph extends ps<dgx> {
   public ph(mq $$0, CompletableFuture<ji.a> $$1) {
      super($$0, mi.aR, $$1);
   }

   protected void a(ji.a $$0, alq<dgx>... $$1) {
      this.b(axp.a).a($$1);
      Set<alq<dgx>> $$2 = Set.of($$1);
      List<String> $$3 = $$0.e(mi.aR).c().filter($$1x -> !$$2.contains($$1x.e().get())).map(jg::g).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Not all enchantments were registered for tooltip ordering. Missing: " + String.join(", ", $$3));
      }
   }
}
