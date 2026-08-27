import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class ow {
   public static CompletableFuture<jq.g> a(CompletableFuture<jc.a> $$0, jq $$1) {
      return $$0.thenApply($$1x -> {
         jo.b $$2 = jo.a(lh.aw);
         is.a $$3 = new is.a();
         ako.a.forEach($$1xx -> $$1xx.a($$3::a));
         jq.g $$4 = $$1.a($$2, $$1x, $$3);
         jc.a $$5 = $$4.a();
         Optional<jc.b<dcz>> $$6 = $$5.a(li.az);
         Optional<jc.b<eix>> $$7 = $$5.a(li.aI);
         if ($$6.isPresent() || $$7.isPresent()) {
            oy.a($$7.orElseGet(() -> $$1x.b(li.aI)), $$6.orElseGet(() -> $$1x.b(li.az)));
         }

         return $$4;
      });
   }
}
