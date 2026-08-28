import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class nx implements mg {
   private final mi.a d;

   public nx(mi $$0) {
      this.d = $$0.a(mi.b.b, "models/equipment");
   }

   @Override
   public CompletableFuture<?> a(me $$0) {
      Map<alj, ddw> $$1 = new HashMap<>();
      ddx.a(($$1x, $$2) -> {
         if ($$1.putIfAbsent($$1x, $$2) != null) {
            throw new IllegalStateException("Tried to register equipment model twice for id: " + $$1x);
         }
      });
      return mg.a($$0, ddw.a, this.d, $$1);
   }

   @Override
   public String a() {
      return "Equipment Model Definitions";
   }
}
