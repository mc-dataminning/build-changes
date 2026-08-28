import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class nw implements mf {
   private final mh.a d;

   public nw(mh $$0) {
      this.d = $$0.a(mh.b.b, "models/equipment");
   }

   @Override
   public CompletableFuture<?> a(md $$0) {
      Map<ali, ddl> $$1 = new HashMap<>();
      ddm.a(($$1x, $$2) -> {
         if ($$1.putIfAbsent($$1x, $$2) != null) {
            throw new IllegalStateException("Tried to register equipment model twice for id: " + $$1x);
         }
      });
      return mf.a($$0, ddl.a, this.d, $$1);
   }

   @Override
   public String a() {
      return "Equipment Model Definitions";
   }
}
