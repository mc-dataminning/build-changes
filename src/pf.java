import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class pf {
   public static CompletableFuture<jy.g> a(CompletableFuture<jk.a> $$0, jy $$1) {
      return $$0.thenApply($$1x -> {
         jw.b $$2 = jw.a(lp.aw);
         ja.a $$3 = new ja.a();
         ala.a.forEach($$1xx -> $$1xx.a($$3::a));
         jy.g $$4 = $$1.a($$2, $$1x, $$3);
         jk.a $$5 = $$4.a();
         Optional<jk.b<dcy>> $$6 = $$5.a(lq.az);
         Optional<jk.b<ehp>> $$7 = $$5.a(lq.aI);
         if ($$6.isPresent() || $$7.isPresent()) {
            ph.a($$7.orElseGet(() -> $$1x.b(lq.aI)), $$6.orElseGet(() -> $$1x.b(lq.az)));
         }

         return $$4;
      });
   }
}
