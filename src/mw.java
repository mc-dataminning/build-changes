import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class mw implements mf {
   private final mh d;
   private final CompletableFuture<js.a> e;

   public mw(mh $$0, CompletableFuture<js.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(md $$0) {
      Path $$1 = this.d.a(mh.b.c).resolve("items.json");
      return this.e
         .thenCompose(
            $$2 -> {
               JsonObject $$3 = new JsonObject();
               alg<JsonElement> $$4 = $$2.a(JsonOps.INSTANCE);
               $$2.d(lz.K)
                  .c()
                  .forEach(
                     $$2x -> {
                        JsonObject $$3x = new JsonObject();
                        $$3x.add(
                           "components",
                           (JsonElement)kq.b
                              .encodeStart($$4, ((cvx)$$2x.a()).g())
                              .getOrThrow($$0xxx -> new IllegalStateException("Failed to encode components: " + $$0xxx))
                        );
                        $$3.add($$2x.g(), $$3x);
                     }
                  );
               return mf.a($$0, $$3, $$1);
            }
         );
   }

   @Override
   public final String a() {
      return "Item List";
   }
}
