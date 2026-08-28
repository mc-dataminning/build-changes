import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mt implements mb {
   private final md d;

   public mt(md $$0) {
      this.d = $$0;
   }

   @Override
   public CompletableFuture<?> a(lz $$0) {
      Path $$1 = this.d.a(md.b.c).resolve("packets.json");
      return mb.a($$0, this.b(), $$1);
   }

   private JsonElement b() {
      JsonObject $$0 = new JsonObject();
      Stream.of(aiv.a, ake.c, ake.a, ajf.c, ajf.a, abo.c, abo.a, agp.b, agp.a).collect(Collectors.groupingBy(wl.a::a)).forEach(($$1, $$2) -> {
         JsonObject $$3 = new JsonObject();
         $$0.add($$1.a(), $$3);
         $$2.forEach($$1x -> {
            JsonObject $$2x = new JsonObject();
            $$3.add($$1x.b().b(), $$2x);
            $$1x.a(($$1xx, $$2xx) -> {
               JsonObject $$3x = new JsonObject();
               $$3x.addProperty("protocol_id", $$2xx);
               $$2x.add($$1xx.b().toString(), $$3x);
            });
         });
      });
      return $$0;
   }

   @Override
   public String a() {
      return "Packet Report";
   }
}
