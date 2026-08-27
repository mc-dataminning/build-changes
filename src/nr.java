import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class nr {
   public static CompletableFuture<ja.e> a(CompletableFuture<in.a> $$0, ja $$1) {
      return $$0.thenApply($$1x -> {
         iy.b $$2 = iy.a(kh.at);
         ic.a $$3 = new ic.a();
         aix.a.forEach($$1xx -> $$1xx.a($$3::a));
         ja.e $$4 = $$1.a($$2, $$1x, $$3);
         in.a $$5 = $$4.a();
         Optional<in.b<cxd>> $$6 = $$5.a(ki.au);
         Optional<in.b<ebk>> $$7 = $$5.a(ki.aD);
         if ($$6.isPresent() || $$7.isPresent()) {
            nt.a($$7.orElseGet(() -> $$1x.b(ki.aD)), $$6.orElseGet(() -> $$1x.b(ki.au)));
         }

         return $$4;
      });
   }
}
