import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class kv implements kf {
   private final kh d;

   public kv(kh $$0) {
      this.d = $$0;
   }

   @Override
   public CompletableFuture<?> a(kd $$0) {
      JsonObject $$1 = new JsonObject();
      jy.ar.h().forEach($$1x -> $$1.add($$1x.g().a().toString(), a((io)$$1x.a())));
      Path $$2 = this.d.a(kh.b.c).resolve("registries.json");
      return kf.a($$0, $$1, $$2);
   }

   private static <T> JsonElement a(io<T> $$0) {
      JsonObject $$1 = new JsonObject();
      if ($$0 instanceof hw) {
         agi $$2 = ((hw)$$0).a();
         $$1.addProperty("default", $$2.toString());
      }

      int $$3 = jy.ar.a($$0);
      $$1.addProperty("protocol_id", $$3);
      JsonObject $$4 = new JsonObject();
      $$0.h().forEach($$2 -> {
         T $$3x = $$2.a();
         int $$4x = $$0.a($$3x);
         JsonObject $$5 = new JsonObject();
         $$5.addProperty("protocol_id", $$4x);
         $$4.add($$2.g().a().toString(), $$5);
      });
      $$1.add("entries", $$4);
      return $$1;
   }

   @Override
   public final String a() {
      return "Registry Dump";
   }
}
