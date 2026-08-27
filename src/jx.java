import com.google.common.collect.UnmodifiableIterator;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class jx implements jj {
   private final jl d;

   public jx(jl $$0) {
      this.d = $$0;
   }

   @Override
   public CompletableFuture<?> a(jh $$0) {
      JsonObject $$1 = new JsonObject();

      for (csk $$2 : jc.f) {
         aep $$3 = jc.f.b($$2);
         JsonObject $$4 = new JsonObject();
         dez<csk, dey> $$5 = $$2.l();
         if (!$$5.d().isEmpty()) {
            JsonObject $$6 = new JsonObject();

            for (dgb<?> $$7 : $$5.d()) {
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
            dey $$11 = (dey)var17.next();
            JsonObject $$12 = new JsonObject();
            JsonObject $$13 = new JsonObject();

            for (dgb<?> $$14 : $$5.d()) {
               $$13.addProperty($$14.f(), ac.a($$14, $$11.c($$14)));
            }

            if ($$13.size() > 0) {
               $$12.add("properties", $$13);
            }

            $$12.addProperty("id", csk.i($$11));
            if ($$11 == $$2.n()) {
               $$12.addProperty("default", true);
            }

            $$10.add($$12);
         }

         $$4.add("states", $$10);
         $$1.add($$3.toString(), $$4);
      }

      Path $$15 = this.d.a(jl.b.c).resolve("blocks.json");
      return jj.a($$0, $$1, $$15);
   }

   @Override
   public final String a() {
      return "Block List";
   }
}
