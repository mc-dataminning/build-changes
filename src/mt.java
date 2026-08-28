import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class mt implements mc {
   private final me d;
   private final CompletableFuture<jq.a> e;

   public mt(me $$0, CompletableFuture<jq.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(ma $$0) {
      Path $$1 = this.d.a(me.b.c).resolve("items.json");
      return this.e
         .thenCompose(
            $$2 -> {
               JsonObject $$3 = new JsonObject();
               alc<JsonElement> $$4 = $$2.a(JsonOps.INSTANCE);
               $$2.d(lw.K)
                  .c()
                  .forEach(
                     $$2x -> {
                        JsonObject $$3x = new JsonObject();
                        $$3x.add(
                           "components",
                           (JsonElement)ko.b
                              .encodeStart($$4, ((cvn)$$2x.a()).o())
                              .getOrThrow($$0xxx -> new IllegalStateException("Failed to encode components: " + $$0xxx))
                        );
                        $$3.add($$2x.g(), $$3x);
                     }
                  );
               return mc.a($$0, $$3, $$1);
            }
         );
   }

   @Override
   public final String a() {
      return "Item List";
   }
}
