import com.google.common.collect.UnmodifiableIterator;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class ml implements lx {
   private final lz d;
   private final CompletableFuture<jl.a> e;

   public ml(lz $$0, CompletableFuture<jl.a> $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Override
   public CompletableFuture<?> a(lv $$0) {
      Path $$1 = this.d.a(lz.b.c).resolve("blocks.json");
      return this.e
         .thenCompose(
            $$2 -> {
               JsonObject $$3 = new JsonObject();
               aki<JsonElement> $$4 = $$2.a(JsonOps.INSTANCE);
               $$2.b(lr.f)
                  .b()
                  .forEach(
                     $$2x -> {
                        JsonObject $$3x = new JsonObject();
                        dsl<dfh, dsk> $$4x = ((dfh)$$2x.a()).l();
                        if (!$$4x.d().isEmpty()) {
                           JsonObject $$5 = new JsonObject();

                           for (dtn<?> $$6 : $$4x.d()) {
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
                           dsk $$10 = (dsk)var13.next();
                           JsonObject $$11 = new JsonObject();
                           JsonObject $$12 = new JsonObject();

                           for (dtn<?> $$13 : $$4x.d()) {
                              $$12.addProperty($$13.f(), ac.a($$13, $$10.c($$13)));
                           }

                           if ($$12.size() > 0) {
                              $$11.add("properties", $$12);
                           }

                           $$11.addProperty("id", dfh.i($$10));
                           if ($$10 == ((dfh)$$2x.a()).o()) {
                              $$11.addProperty("default", true);
                           }

                           $$9.add($$11);
                        }

                        $$3x.add("states", $$9);
                        String $$14 = $$2x.g();
                        JsonElement $$15 = (JsonElement)dfi.a
                           .codec()
                           .encodeStart($$4, (dfh)$$2x.a())
                           .getOrThrow($$1xxx -> new AssertionError("Failed to serialize block " + $$14 + " (is type registered in BlockTypes?): " + $$1xxx));
                        $$3x.add("definition", $$15);
                        $$3.add($$14, $$3x);
                     }
                  );
               return lx.a($$0, $$3, $$1);
            }
         );
   }

   @Override
   public final String a() {
      return "Block List";
   }
}
