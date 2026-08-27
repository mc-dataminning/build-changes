import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class ou {
   public static CompletableFuture<jn.g> a(CompletableFuture<iz.a> $$0, jn $$1) {
      return $$0.thenApply($$1x -> {
         jl.b $$2 = jl.a(le.aw);
         ip.a $$3 = new ip.a();
         aki.a.forEach($$1xx -> $$1xx.a($$3::a));
         jn.g $$4 = $$1.a($$2, $$1x, $$3);
         iz.a $$5 = $$4.a();
         Optional<iz.b<dby>> $$6 = $$5.a(lf.az);
         Optional<iz.b<egp>> $$7 = $$5.a(lf.aI);
         if ($$6.isPresent() || $$7.isPresent()) {
            ow.a($$7.orElseGet(() -> $$1x.b(lf.aI)), $$6.orElseGet(() -> $$1x.b(lf.az)));
         }

         return $$4;
      });
   }
}
