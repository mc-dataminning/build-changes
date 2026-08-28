import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class nv implements me {
   private final mg.a d;

   public nv(mg $$0) {
      this.d = $$0.a(mg.b.b, "models/equipment");
   }

   @Override
   public CompletableFuture<?> a(mc $$0) {
      Map<alh, ddf> $$1 = new HashMap<>();
      ddg.a(($$1x, $$2) -> {
         if ($$1.putIfAbsent($$1x, $$2) != null) {
            throw new IllegalStateException("Tried to register equipment model twice for id: " + $$1x);
         }
      });
      return me.a($$0, ddf.a, this.d, $$1);
   }

   @Override
   public String a() {
      return "Equipment Model Definitions";
   }
}
