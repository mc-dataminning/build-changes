import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class mo implements lw {
   private final ly d;
   private final CompletableFuture<jk.a> e;

   public mo(ly $$0, CompletableFuture<jk.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(lu $$0) {
      Path $$1 = this.d.a(ly.b.c).resolve("items.json");
      return this.e.thenCompose($$2 -> {
         JsonObject $$3 = new JsonObject();
         ald<JsonElement> $$4 = $$2.a(JsonOps.INSTANCE);
         $$2.b(lq.G).b().forEach($$2x -> {
            JsonObject $$3x = new JsonObject();
            JsonArray $$4x = new JsonArray();
            ((cuk)$$2x.a()).p().forEach($$2xx -> $$4x.add(a($$2xx, $$4)));
            $$3x.add("components", $$4x);
            $$3.add($$2x.g(), $$3x);
         });
         return lw.a($$0, $$3, $$1);
      });
   }

   private static <T> JsonElement a(ko<T> $$0, DynamicOps<JsonElement> $$1) {
      alf $$2 = lp.as.b($$0.a());
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
