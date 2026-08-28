import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public abstract class ps extends py<dab> {
   private final cpm d;

   public ps(ly $$0, CompletableFuture<jk.a> $$1, cpm $$2) {
      super($$0, lq.u, $$1, $$0x -> $$0x.m().h());
      this.d = $$2;
   }

   protected void a(jk.a $$0, dab... $$1) {
      this.a(aws.a).a($$1);
      Set<dab> $$2 = Set.of($$1);
      List<String> $$3 = $$0.b(lq.u)
         .b()
         .filter($$0x -> ((dab)$$0x.a()).i().a(this.d))
         .filter($$1x -> !$$2.contains($$1x.a()))
         .map(ji::g)
         .collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Not all enchantments were registered for tooltip ordering. Missing: " + String.join(", ", $$3));
      }
   }
}
