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

public class grd implements gqx {
   private final List<grd.d> a;

   grd(List<grd.d> $$0) {
      this.a = $$0;
   }

   @Override
   public Object a(dzo $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
         if (this.a.get($$2).a.test($$0)) {
            $$1.add($$2);
         }
      }

      record a(grd a, IntList b) {
         a(IntList b) {
            this.b = b;
         }
      }

      return new a($$1);
   }

   @Override
   public void a(hkr.a $$0) {
      this.a.forEach($$1 -> $$1.b.a($$0));
   }

   @Override
   public hjz a(hki $$0) {
      List<hkq.a> $$1 = new ArrayList<>(this.a.size());

      for (grd.d $$2 : this.a) {
         hjz $$3 = $$2.b.a($$0);
         $$1.add(new hkq.a($$2.a, $$3));
      }

      return new hkq($$1);
   }

   public static record b(List<grf> a) {
      public grd a(dzp<dlu, dzo> $$0) {
         List<grd.d> $$1 = this.a.stream().map($$1x -> new grd.d($$1x.a($$0), $$1x.a())).toList();
         return new grd($$1);
      }

      public Set<gqv> a() {
         return this.a.stream().map(grf::a).collect(Collectors.toSet());
      }

      public List<grf> b() {
         return this.a;
      }
   }

   public static class c implements JsonDeserializer<grd.b> {
      public grd.b a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new grd.b(this.a($$2, $$0.getAsJsonArray()));
      }

      private List<grf> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<grf> $$2 = new ArrayList<>();
         if ($$1.isEmpty()) {
            throw new JsonSyntaxException("Empty selector array");
         } else {
            for (JsonElement $$3 : $$1) {
               $$2.add((grf)$$0.deserialize($$3, grf.class));
            }

            return $$2;
         }
      }
   }

   static record d(Predicate<dzo> a, gqv b) {
   }
}
