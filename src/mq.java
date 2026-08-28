import com.google.common.collect.UnmodifiableIterator;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class mq implements mc {
   private final me d;
   private final CompletableFuture<jq.a> e;

   public mq(me $$0, CompletableFuture<jq.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(ma $$0) {
      Path $$1 = this.d.a(me.b.c).resolve("blocks.json");
      return this.e
         .thenCompose(
            $$2 -> {
               JsonObject $$3 = new JsonObject();
               alc<JsonElement> $$4 = $$2.a(JsonOps.INSTANCE);
               $$2.d(lw.f)
                  .c()
                  .forEach(
                     $$2x -> {
                        JsonObject $$3x = new JsonObject();
                        dut<dhm, dus> $$4x = ((dhm)$$2x.a()).k();
                        if (!$$4x.d().isEmpty()) {
                           JsonObject $$5 = new JsonObject();

                           for (dvv<?> $$6 : $$4x.d()) {
                              JsonArray $$7 = new JsonArray();

                              for (Comparable<?> $$8 : $$6.a()) {
                                 $$7.add(ad.a($$6, $$8));
                              }

                              $$5.add($$6.f(), $$7);
                           }

                           $$3x.add("properties", $$5);
                        }

                        JsonArray $$9 = new JsonArray();
                        UnmodifiableIterator var13 = $$4x.a().iterator();

                        while (var13.hasNext()) {
                           dus $$10 = (dus)var13.next();
                           JsonObject $$11 = new JsonObject();
                           JsonObject $$12 = new JsonObject();

                           for (dvv<?> $$13 : $$4x.d()) {
                              $$12.addProperty($$13.f(), ad.a($$13, $$10.c($$13)));
                           }

                           if ($$12.size() > 0) {
                              $$11.add("properties", $$12);
                           }

                           $$11.addProperty("id", dhm.j($$10));
                           if ($$10 == ((dhm)$$2x.a()).n()) {
                              $$11.addProperty("default", true);
                           }

                           $$9.add($$11);
                        }

                        $$3x.add("states", $$9);
                        String $$14 = $$2x.g();
                        JsonElement $$15 = (JsonElement)dhn.a
                           .codec()
                           .encodeStart($$4, (dhm)$$2x.a())
                           .getOrThrow($$1xxx -> new AssertionError("Failed to serialize block " + $$14 + " (is type registered in BlockTypes?): " + $$1xxx));
                        $$3x.add("definition", $$15);
                        $$3.add($$14, $$3x);
                     }
                  );
               return mc.a($$0, $$3, $$1);
            }
         );
   }

   @Override
   public final String a() {
      return "Block List";
   }
}
