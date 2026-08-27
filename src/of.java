import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class of {
   public static CompletableFuture<jb.g> a(CompletableFuture<in.a> $$0, jb $$1) {
      return $$0.thenApply($$1x -> {
         iz.b $$2 = iz.a(kr.au);
         ic.a $$3 = new ic.a();
         ajo.a.forEach($$1xx -> $$1xx.a($$3::a));
         jb.g $$4 = $$1.a($$2, $$1x, $$3);
         in.a $$5 = $$4.a();
         Optional<in.b<czw>> $$6 = $$5.a(ks.av);
         Optional<in.b<eel>> $$7 = $$5.a(ks.aE);
         if ($$6.isPresent() || $$7.isPresent()) {
            oh.a($$7.orElseGet(() -> $$1x.b(ks.aE)), $$6.orElseGet(() -> $$1x.b(ks.av)));
         }

         return $$4;
      });
   }
}
