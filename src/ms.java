import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class ms implements mb {
   private final md d;
   private final CompletableFuture<jp.a> e;

   public ms(md $$0, CompletableFuture<jp.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(lz $$0) {
      Path $$1 = this.d.a(md.b.c).resolve("items.json");
      return this.e
         .thenCompose(
            $$2 -> {
               JsonObject $$3 = new JsonObject();
               akz<JsonElement> $$4 = $$2.a(JsonOps.INSTANCE);
               $$2.b(lv.K)
                  .b()
                  .forEach(
                     $$2x -> {
                        JsonObject $$3x = new JsonObject();
                        $$3x.add(
                           "components",
                           (JsonElement)kn.b
                              .encodeStart($$4, ((cvg)$$2x.a()).p())
                              .getOrThrow($$0xxx -> new IllegalStateException("Failed to encode components: " + $$0xxx))
                        );
                        $$3.add($$2x.g(), $$3x);
                     }
                  );
               return mb.a($$0, $$3, $$1);
            }
         );
   }

   @Override
   public final String a() {
      return "Item List";
   }
}
