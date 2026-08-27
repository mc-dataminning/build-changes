import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class mr implements la {
   private final lc d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public mr(lc $$0) {
      this.d = $$0;
   }

   public <T> mr a(ase<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> $$0.a($$1));
      return this;
   }

   @Override
   public CompletableFuture<?> a(ky $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return la.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static mr a(lc $$0, wi $$1) {
      return new mr($$0).a(asf.b, new asf($$1, t.a.a(ars.b), Optional.empty()));
   }

   public static mr a(lc $$0, wi $$1, cmn $$2) {
      return a($$0, $$1).a(arm.a, new arm($$2));
   }
}
