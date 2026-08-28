import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ny implements mh {
   private final mj.a d;

   public ny(mj $$0) {
      this.d = $$0.a(mj.b.b, "models/equipment");
   }

   @Override
   public CompletableFuture<?> a(mf $$0) {
      Map<alp, dfj> $$1 = new HashMap<>();
      dfk.a(($$1x, $$2) -> {
         if ($$1.putIfAbsent($$1x, $$2) != null) {
            throw new IllegalStateException("Tried to register equipment model twice for id: " + $$1x);
         }
      });
      return mh.a($$0, dfj.a, this.d, $$1);
   }

   @Override
   public String a() {
      return "Equipment Model Definitions";
   }
}
