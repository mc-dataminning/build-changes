import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class ne implements mn {
   private final mp d;
   private final CompletableFuture<jh.a> e;

   public ne(mp $$0, CompletableFuture<jh.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(ml $$0) {
      Path $$1 = this.d.a(mp.b.c).resolve("items.json");
      return this.e
         .thenCompose(
            $$2 -> {
               JsonObject $$3 = new JsonObject();
               alg<JsonElement> $$4 = $$2.a(JsonOps.INSTANCE);
               $$2.e(mh.K)
                  .c()
                  .forEach(
                     $$2x -> {
                        JsonObject $$3x = new JsonObject();
                        $$3x.add(
                           "components",
                           (JsonElement)kh.b
                              .encodeStart($$4, ((czu)$$2x.a()).f())
                              .getOrThrow($$0xxx -> new IllegalStateException("Failed to encode components: " + $$0xxx))
                        );
                        $$3.add($$2x.g(), $$3x);
                     }
                  );
               return mn.a($$0, $$3, $$1);
            }
         );
   }

   @Override
   public final String a() {
      return "Item List";
   }
}
