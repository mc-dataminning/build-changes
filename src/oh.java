import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class oh {
   public static CompletableFuture<jd.g> a(CompletableFuture<ip.a> $$0, jd $$1) {
      return $$0.thenApply($$1x -> {
         jb.b $$2 = jb.a(kt.at);
         ie.a $$3 = new ie.a();
         ajq.a.forEach($$1xx -> $$1xx.a($$3::a));
         jd.g $$4 = $$1.a($$2, $$1x, $$3);
         ip.a $$5 = $$4.a();
         Optional<ip.b<daf>> $$6 = $$5.a(ku.aw);
         Optional<ip.b<eeu>> $$7 = $$5.a(ku.aF);
         if ($$6.isPresent() || $$7.isPresent()) {
            oj.a($$7.orElseGet(() -> $$1x.b(ku.aF)), $$6.orElseGet(() -> $$1x.b(ku.aw)));
         }

         return $$4;
      });
   }
}
