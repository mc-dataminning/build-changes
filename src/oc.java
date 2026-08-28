import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class oc implements mo {
   private final mq d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public oc(mq $$0) {
      this.d = $$0;
   }

   public <T> oc a(aug<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> ((JsonElement)$$0.b().encodeStart(JsonOps.INSTANCE, $$1).getOrThrow(IllegalArgumentException::new)).getAsJsonObject());
      return this;
   }

   @Override
   public CompletableFuture<?> a(mm $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return mo.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static oc a(mq $$0, xc $$1) {
      return new oc($$0).a(auh.b, new auh($$1, u.a.a(atv.b), Optional.empty()));
   }

   public static oc a(mq $$0, xc $$1, cvj $$2) {
      return a($$0, $$1).a(atp.a, new atp($$2));
   }
}
