import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class nw implements mi {
   private final mk d;
   private final Map<String, Supplier<JsonElement>> e = new HashMap<>();

   public nw(mk $$0) {
      this.d = $$0;
   }

   public <T> nw a(ato<T> $$0, T $$1) {
      this.e.put($$0.a(), () -> ((JsonElement)$$0.b().encodeStart(JsonOps.INSTANCE, $$1).getOrThrow(IllegalArgumentException::new)).getAsJsonObject());
      return this;
   }

   @Override
   public CompletableFuture<?> a(mg $$0) {
      JsonObject $$1 = new JsonObject();
      this.e.forEach(($$1x, $$2) -> $$1.add($$1x, $$2.get()));
      return mi.a($$0, $$1, this.d.a().resolve("pack.mcmeta"));
   }

   @Override
   public final String a() {
      return "Pack Metadata";
   }

   public static nw a(mk $$0, wo $$1) {
      return new nw($$0).a(atp.b, new atp($$1, t.a.a(atd.b), Optional.empty()));
   }

   public static nw a(mk $$0, wo $$1, crr $$2) {
      return a($$0, $$1).a(asx.a, new asx($$2));
   }
}
