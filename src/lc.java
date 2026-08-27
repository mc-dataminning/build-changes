import com.google.common.collect.UnmodifiableIterator;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class lc implements km {
   private final ko d;

   public lc(ko $$0) {
      this.d = $$0;
   }

   @Override
   public CompletableFuture<?> a(kk $$0) {
      JsonObject $$1 = new JsonObject();

      for (cys $$2 : kf.e) {
         aiy $$3 = kf.e.b($$2);
         JsonObject $$4 = new JsonObject();
         dlk<cys, dlj> $$5 = $$2.n();
         if (!$$5.d().isEmpty()) {
            JsonObject $$6 = new JsonObject();

            for (dmm<?> $$7 : $$5.d()) {
               JsonArray $$8 = new JsonArray();

               for (Comparable<?> $$9 : $$7.a()) {
                  $$8.add(ac.a($$7, $$9));
               }

               $$6.add($$7.f(), $$8);
            }

            $$4.add("properties", $$6);
         }

         JsonArray $$10 = new JsonArray();
         UnmodifiableIterator var17 = $$5.a().iterator();

         while (var17.hasNext()) {
            dlj $$11 = (dlj)var17.next();
            JsonObject $$12 = new JsonObject();
            JsonObject $$13 = new JsonObject();

            for (dmm<?> $$14 : $$5.d()) {
               $$13.addProperty($$14.f(), ac.a($$14, $$11.c($$14)));
            }

            if ($$13.size() > 0) {
               $$12.add("properties", $$13);
            }

            $$12.addProperty("id", cys.i($$11));
            if ($$11 == $$2.o()) {
               $$12.addProperty("default", true);
            }

            $$10.add($$12);
         }

         $$4.add("states", $$10);
         $$1.add($$3.toString(), $$4);
      }

      Path $$15 = this.d.a(ko.b.c).resolve("blocks.json");
      return km.a($$0, $$1, $$15);
   }

   @Override
   public final String a() {
      return "Block List";
   }
}
