import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class ob implements mn {
   private final mp d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public ob(mp $$0) {
      this.d = $$0;
   }

   public <T> ob a(auc<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> ((JsonElement)$$0.b().encodeStart(JsonOps.INSTANCE, $$1).getOrThrow(IllegalArgumentException::new)).getAsJsonObject());
      return this;
   }

   @Override
   public CompletableFuture<?> a(ml $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return mn.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static ob a(mp $$0, wy $$1) {
      return new ob($$0).a(aud.b, new aud($$1, u.a.a(atr.b), Optional.empty()));
   }

   public static ob a(mp $$0, wy $$1, cut $$2) {
      return a($$0, $$1).a(atl.a, new atl($$2));
   }
}
