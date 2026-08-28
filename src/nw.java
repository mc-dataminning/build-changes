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

   public <T> nw a(atp<T> $$0, T $$1) {
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

   public static nw a(mk $$0, wp $$1) {
      return new nw($$0).a(atq.b, new atq($$1, t.a.a(ate.b), Optional.empty()));
   }

   public static nw a(mk $$0, wp $$1, csn $$2) {
      return a($$0, $$1).a(asy.a, new asy($$2));
   }
}
