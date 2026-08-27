import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class jz implements jj {
   private final jl d;

   public jz(jl $$0) {
      this.d = $$0;
   }

   @Override
   public CompletableFuture<?> a(jh $$0) {
      JsonObject $$1 = new JsonObject();
      jc.ap.h().forEach($$1x -> $$1.add($$1x.g().a().toString(), a((hs)$$1x.a())));
      Path $$2 = this.d.a(jl.b.c).resolve("registries.json");
      return jj.a($$0, $$1, $$2);
   }

   private static <T> JsonElement a(hs<T> $$0) {
      JsonObject $$1 = new JsonObject();
      if ($$0 instanceof ha) {
         aep $$2 = ((ha)$$0).a();
         $$1.addProperty("default", $$2.toString());
      }

      int $$3 = jc.ap.a($$0);
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
