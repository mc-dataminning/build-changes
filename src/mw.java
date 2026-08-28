import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mw implements me {
   private final mg d;

   public mw(mg $$0) {
      this.d = $$0;
   }

   @Override
   public CompletableFuture<?> a(mc $$0) {
      Path $$1 = this.d.a(mg.b.c).resolve("packets.json");
      return me.a($$0, this.b(), $$1);
   }

   private JsonElement b() {
      JsonObject $$0 = new JsonObject();
      Stream.of(aiz.a, aki.c, aki.a, ajj.c, ajj.a, abs.c, abs.a, agt.b, agt.a).collect(Collectors.groupingBy(wp.a::a)).forEach(($$1, $$2) -> {
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
