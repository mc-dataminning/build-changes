import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class nt {
   public static CompletableFuture<jb.g> a(CompletableFuture<in.a> $$0, jb $$1) {
      return $$0.thenApply($$1x -> {
         iz.b $$2 = iz.a(ki.at);
         ic.a $$3 = new ic.a();
         ajc.a.forEach($$1xx -> $$1xx.a($$3::a));
         jb.g $$4 = $$1.a($$2, $$1x, $$3);
         in.a $$5 = $$4.a();
         Optional<in.b<cya>> $$6 = $$5.a(kj.au);
         Optional<in.b<eci>> $$7 = $$5.a(kj.aD);
         if ($$6.isPresent() || $$7.isPresent()) {
            nv.a($$7.orElseGet(() -> $$1x.b(kj.aD)), $$6.orElseGet(() -> $$1x.b(kj.au)));
         }

         return $$4;
      });
   }
}
