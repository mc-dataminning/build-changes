import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class gnv implements gnp {
   private final List<gnv.d> a;

   gnv(List<gnv.d> $$0) {
      this.a = $$0;
   }

   @Override
   public Object a(dwv $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
         if (this.a.get($$2).a.test($$0)) {
            $$1.add($$2);
         }
      }

      record a(gnv a, IntList b) {
         a(IntList b) {
            this.b = b;
         }
      }

      return new a($$1);
   }

   @Override
   public void a(hhe.a $$0) {
      this.a.forEach($$1 -> $$1.b.a($$0));
   }

   @Override
   public hgm a(hgv $$0) {
      List<hhd.a> $$1 = new ArrayList<>(this.a.size());

      for (gnv.d $$2 : this.a) {
         hgm $$3 = $$2.b.a($$0);
         $$1.add(new hhd.a($$2.a, $$3));
      }

      return new hhd($$1);
   }

   public static record b(List<gnx> a) {
      public gnv a(dww<djk, dwv> $$0) {
         List<gnv.d> $$1 = this.a.stream().map($$1x -> new gnv.d($$1x.a($$0), $$1x.a())).toList();
         return new gnv($$1);
      }

      public Set<gnn> a() {
         return this.a.stream().map(gnx::a).collect(Collectors.toSet());
      }

      public List<gnx> b() {
         return this.a;
      }
   }

   public static class c implements JsonDeserializer<gnv.b> {
      public gnv.b a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gnv.b(this.a($$2, $$0.getAsJsonArray()));
      }

      private List<gnx> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<gnx> $$2 = new ArrayList<>();
         if ($$1.isEmpty()) {
            throw new JsonSyntaxException("Empty selector array");
         } else {
            for (JsonElement $$3 : $$1) {
               $$2.add((gnx)$$0.deserialize($$3, gnx.class));
            }

            return $$2;
         }
      }
   }

   static record d(Predicate<dwv> a, gnn b) {
   }
}
