import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class ng implements mn {
   private final mp d;

   public ng(mp $$0) {
      this.d = $$0;
   }

   @Override
   public CompletableFuture<?> a(ml $$0) {
      JsonObject $$1 = new JsonObject();
      mg.aF.c().forEach($$1x -> $$1.add($$1x.h().a().toString(), a((js)$$1x.a())));
      Path $$2 = this.d.a(mp.b.c).resolve("registries.json");
      return mn.a($$0, $$1, $$2);
   }

   private static <T> JsonElement a(js<T> $$0) {
      JsonObject $$1 = new JsonObject();
      if ($$0 instanceof ja) {
         alg $$2 = ((ja)$$0).b();
         $$1.addProperty("default", $$2.toString());
      }

      int $$3 = mg.aF.a($$0);
      $$1.addProperty("protocol_id", $$3);
      JsonObject $$4 = new JsonObject();
      $$0.c().forEach($$2 -> {
         T $$3x = $$2.a();
         int $$4x = $$0.a($$3x);
         JsonObject $$5 = new JsonObject();
         $$5.addProperty("protocol_id", $$4x);
         $$4.add($$2.h().a().toString(), $$5);
      });
      $$1.add("entries", $$4);
      return $$1;
   }

   @Override
   public final String a() {
      return "Registry Dump";
   }
}
