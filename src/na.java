import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class na implements mh {
   private final mj d;
   private final CompletableFuture<js.a> e;

   public na(mj $$0, CompletableFuture<js.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(mf $$0) {
      Path $$1 = this.d.a(mj.b.c).resolve("items.json");
      return this.e
         .thenCompose(
            $$2 -> {
               JsonObject $$3 = new JsonObject();
               alx<JsonElement> $$4 = $$2.a(JsonOps.INSTANCE);
               $$2.d(mb.K)
                  .c()
                  .forEach(
                     $$2x -> {
                        JsonObject $$3x = new JsonObject();
                        $$3x.add(
                           "components",
                           (JsonElement)kq.b
                              .encodeStart($$4, ((cxl)$$2x.a()).g())
                              .getOrThrow($$0xxx -> new IllegalStateException("Failed to encode components: " + $$0xxx))
                        );
                        $$3.add($$2x.g(), $$3x);
                     }
                  );
               return mh.a($$0, $$3, $$1);
            }
         );
   }

   @Override
   public final String a() {
      return "Item List";
   }
}
