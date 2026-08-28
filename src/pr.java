import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public abstract class pr extends qc<dbk> {
   public pr(md $$0, CompletableFuture<jp.a> $$1) {
      super($$0, lv.aM, $$1);
   }

   protected void a(jp.a $$0, alb<dbk>... $$1) {
      this.b(aww.a).a($$1);
      Set<alb<dbk>> $$2 = Set.of($$1);
      List<String> $$3 = $$0.b(lv.aM).b().filter($$1x -> !$$2.contains($$1x.e().get())).map(jn::g).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Not all enchantments were registered for tooltip ordering. Missing: " + String.join(", ", $$3));
      }
   }
}
