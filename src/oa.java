import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class oa implements mm {
   private final mo d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public oa(mo $$0) {
      this.d = $$0;
   }

   public <T> oa a(aua<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> ((JsonElement)$$0.b().encodeStart(JsonOps.INSTANCE, $$1).getOrThrow(IllegalArgumentException::new)).getAsJsonObject());
      return this;
   }

   @Override
   public CompletableFuture<?> a(mk $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return mm.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static oa a(mo $$0, ww $$1) {
      return new oa($$0).a(aub.b, new aub($$1, t.a.a(atp.b), Optional.empty()));
   }

   public static oa a(mo $$0, ww $$1, cub $$2) {
      return a($$0, $$1).a(atj.a, new atj($$2));
   }
}
