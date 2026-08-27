import com.google.common.collect.UnmodifiableIterator;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class jy implements jk {
   private final jm d;

   public jy(jm $$0) {
      this.d = $$0;
   }

   @Override
   public CompletableFuture<?> a(ji $$0) {
      JsonObject $$1 = new JsonObject();

      for (csv $$2 : jd.f) {
         aex $$3 = jd.f.b($$2);
         JsonObject $$4 = new JsonObject();
         dfk<csv, dfj> $$5 = $$2.l();
         if (!$$5.d().isEmpty()) {
            JsonObject $$6 = new JsonObject();

            for (dgm<?> $$7 : $$5.d()) {
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
            dfj $$11 = (dfj)var17.next();
            JsonObject $$12 = new JsonObject();
            JsonObject $$13 = new JsonObject();

            for (dgm<?> $$14 : $$5.d()) {
               $$13.addProperty($$14.f(), ac.a($$14, $$11.c($$14)));
            }

            if ($$13.size() > 0) {
               $$12.add("properties", $$13);
            }

            $$12.addProperty("id", csv.i($$11));
            if ($$11 == $$2.n()) {
               $$12.addProperty("default", true);
            }

            $$10.add($$12);
         }

         $$4.add("states", $$10);
         $$1.add($$3.toString(), $$4);
      }

      Path $$15 = this.d.a(jm.b.c).resolve("blocks.json");
      return jk.a($$0, $$1, $$15);
   }

   @Override
   public final String a() {
      return "Block List";
   }
}
