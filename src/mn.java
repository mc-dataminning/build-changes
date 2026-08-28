import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class mn implements lx {
   private final lz d;
   private final CompletableFuture<jl.a> e;

   public mn(lz $$0, CompletableFuture<jl.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(lv $$0) {
      Path $$1 = this.d.a(lz.b.c).resolve("items.json");
      return this.e.thenCompose($$2 -> {
         JsonObject $$3 = new JsonObject();
         aki<JsonElement> $$4 = $$2.a(JsonOps.INSTANCE);
         $$2.b(lr.K).b().forEach($$2x -> {
            JsonObject $$3x = new JsonObject();
            JsonArray $$4x = new JsonArray();
            ((ctv)$$2x.a()).p().forEach($$2xx -> $$4x.add(a($$2xx, $$4)));
            $$3x.add("components", $$4x);
            $$3.add($$2x.g(), $$3x);
         });
         return lx.a($$0, $$3, $$1);
      });
   }

   private static <T> JsonElement a(kp<T> $$0, DynamicOps<JsonElement> $$1) {
      akk $$2 = lq.aq.b($$0.a());
      JsonElement $$3 = (JsonElement)$$0.a($$1).getOrThrow($$1x -> new IllegalStateException("Failed to serialize component " + $$2 + ": " + $$1x));
      JsonObject $$4 = new JsonObject();
      $$4.addProperty("type", $$2.toString());
      $$4.add("value", $$3);
      return $$4;
   }

   @Override
   public final String a() {
      return "Item List";
   }
}
