import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class nl {
   public static CompletableFuture<ii.b> a(CompletableFuture<ii.b> $$0, iv $$1) {
      return $$0.thenApply($$1x -> {
         it.b $$2 = it.a(kc.ar);
         ii.b $$3 = $$1.a($$2, $$1x);
         Optional<ii.c<ctd>> $$4 = $$3.a(kd.ar);
         Optional<ii.c<dwq>> $$5 = $$3.a(kd.aA);
         if ($$4.isPresent() || $$5.isPresent()) {
            nn.a($$5.orElseGet(() -> $$1x.b(kd.aA)), $$4.orElseGet(() -> $$1x.b(kd.ar)));
         }

         return $$3;
      });
   }
}
