import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class mh implements lo {
   private final lq d;
   private final CompletableFuture<jc.a> e;

   public mh(lq $$0, CompletableFuture<jc.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(lm $$0) {
      Path $$1 = this.d.a(lq.b.c).resolve("items.json");
      return this.e.thenCompose($$2 -> {
         JsonObject $$3 = new JsonObject();
         akr<JsonElement> $$4 = $$2.a(JsonOps.INSTANCE);
         $$2.b(li.G).b().forEach($$2x -> {
            JsonObject $$3x = new JsonObject();
            JsonArray $$4x = new JsonArray();
            ((cuc)$$2x.a()).o().forEach($$2xx -> $$4x.add(a($$2xx, $$4)));
            $$3x.add("components", $$4x);
            $$3.add($$2x.g(), $$3x);
         });
         return lo.a($$0, $$3, $$1);
      });
   }

   private static <T> JsonElement a(kg<T> $$0, DynamicOps<JsonElement> $$1) {
      akt $$2 = lh.as.b($$0.a());
      JsonElement $$3 = ad.a($$0.a($$1), $$1x -> new IllegalStateException("Failed to serialize component " + $$2 + ": " + $$1x));
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
