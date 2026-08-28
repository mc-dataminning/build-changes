import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class ny implements mk {
   private final mm d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public ny(mm $$0) {
      this.d = $$0;
   }

   public <T> ny a(atz<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> ((JsonElement)$$0.b().encodeStart(JsonOps.INSTANCE, $$1).getOrThrow(IllegalArgumentException::new)).getAsJsonObject());
      return this;
   }

   @Override
   public CompletableFuture<?> a(mi $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return mk.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static ny a(mm $$0, wv $$1) {
      return new ny($$0).a(aua.b, new aua($$1, t.a.a(ato.b), Optional.empty()));
   }

   public static ny a(mm $$0, wv $$1, cte $$2) {
      return a($$0, $$1).a(ati.a, new ati($$2));
   }
}
