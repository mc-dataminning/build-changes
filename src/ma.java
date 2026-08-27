import com.google.common.collect.UnmodifiableIterator;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class ma implements lk {
   private final lm d;
   private final CompletableFuture<iy.a> e;

   public ma(lm $$0, CompletableFuture<iy.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(li $$0) {
      Path $$1 = this.d.a(lm.b.c).resolve("blocks.json");
      return this.e
         .thenCompose(
            $$2 -> {
               JsonObject $$3 = new JsonObject();
               akf<JsonElement> $$4 = $$2.a(JsonOps.INSTANCE);
               $$2.b(le.f)
                  .b()
                  .forEach(
                     $$2x -> {
                        JsonObject $$3x = new JsonObject();
                        dqi<dde, dqh> $$4x = ((dde)$$2x.a()).l();
                        if (!$$4x.d().isEmpty()) {
                           JsonObject $$5 = new JsonObject();

                           for (drk<?> $$6 : $$4x.d()) {
                              JsonArray $$7 = new JsonArray();

                              for (Comparable<?> $$8 : $$6.a()) {
                                 $$7.add(ac.a($$6, $$8));
                              }

                              $$5.add($$6.f(), $$7);
                           }

                           $$3x.add("properties", $$5);
                        }

                        JsonArray $$9 = new JsonArray();
                        UnmodifiableIterator var13 = $$4x.a().iterator();

                        while (var13.hasNext()) {
                           dqh $$10 = (dqh)var13.next();
                           JsonObject $$11 = new JsonObject();
                           JsonObject $$12 = new JsonObject();

                           for (drk<?> $$13 : $$4x.d()) {
                              $$12.addProperty($$13.f(), ac.a($$13, $$10.c($$13)));
                           }

                           if ($$12.size() > 0) {
                              $$11.add("properties", $$12);
                           }

                           $$11.addProperty("id", dde.i($$10));
                           if ($$10 == ((dde)$$2x.a()).n()) {
                              $$11.addProperty("default", true);
                           }

                           $$9.add($$11);
                        }

                        $$3x.add("states", $$9);
                        String $$14 = $$2x.g();
                        JsonElement $$15 = ac.a(
                           ddf.a.codec().encodeStart($$4, (dde)$$2x.a()),
                           $$1xxx -> new AssertionError("Failed to serialize block " + $$14 + " (is type registered in BlockTypes?): " + $$1xxx)
                        );
                        $$3x.add("definition", $$15);
                        $$3.add($$14, $$3x);
                     }
                  );
               return lk.a($$0, $$3, $$1);
            }
         );
   }

   @Override
   public final String a() {
      return "Block List";
   }
}
