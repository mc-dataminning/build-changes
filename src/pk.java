import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public abstract class pk extends pv<czj> {
   public pk(lz $$0, CompletableFuture<jl.a> $$1) {
      super($$0, lr.aK, $$1);
   }

   protected void a(jl.a $$0, akj<czj>... $$1) {
      this.b(avx.a).a($$1);
      Set<akj<czj>> $$2 = Set.of($$1);
      List<String> $$3 = $$0.b(lr.aK).b().filter($$1x -> !$$2.contains($$1x.e().get())).map(jj::g).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Not all enchantments were registered for tooltip ordering. Missing: " + String.join(", ", $$3));
      }
   }
}
