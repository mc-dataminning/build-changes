import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class nh {
   public static CompletableFuture<id.b> a(CompletableFuture<id.b> $$0, ir $$1) {
      return $$0.thenApply($$1x -> {
         ip.b $$2 = ip.a(jy.ar);
         id.b $$3 = $$1.a($$2, $$1x);
         Optional<id.c<csy>> $$4 = $$3.a(jz.ar);
         Optional<id.c<dwl>> $$5 = $$3.a(jz.aA);
         if ($$4.isPresent() || $$5.isPresent()) {
            nj.a($$5.orElseGet(() -> $$1x.b(jz.aA)), $$4.orElseGet(() -> $$1x.b(jz.ar)));
         }

         return $$3;
      });
   }
}
