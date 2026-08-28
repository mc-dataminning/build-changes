import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class oc implements mh {
   private final mj.a d;

   public oc(mj $$0) {
      this.d = $$0.a(mj.b.b, "models/equipment");
   }

   @Override
   public CompletableFuture<?> a(mf $$0) {
      Map<alz, dfs> $$1 = new HashMap<>();
      dft.a(($$1x, $$2) -> {
         if ($$1.putIfAbsent($$1x, $$2) != null) {
            throw new IllegalStateException("Tried to register equipment model twice for id: " + $$1x);
         }
      });
      return mh.a($$0, dfs.a, this.d, $$1);
   }

   @Override
   public String a() {
      return "Equipment Model Definitions";
   }
}
