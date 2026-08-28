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

public class gnz implements gnt {
   private final List<gnz.d> a;

   gnz(List<gnz.d> $$0) {
      this.a = $$0;
   }

   @Override
   public Object a(dwy $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
         if (this.a.get($$2).a.test($$0)) {
            $$1.add($$2);
         }
      }

      record a(gnz a, IntList b) {
         a(IntList b) {
            this.b = b;
         }
      }

      return new a($$1);
   }

   @Override
   public void a(hhl.a $$0) {
      this.a.forEach($$1 -> $$1.b.a($$0));
   }

   @Override
   public hgt a(hhc $$0) {
      List<hhk.a> $$1 = new ArrayList<>(this.a.size());

      for (gnz.d $$2 : this.a) {
         hgt $$3 = $$2.b.a($$0);
         $$1.add(new hhk.a($$2.a, $$3));
      }

      return new hhk($$1);
   }

   public static record b(List<gob> a) {
      public gnz a(dwz<djn, dwy> $$0) {
         List<gnz.d> $$1 = this.a.stream().map($$1x -> new gnz.d($$1x.a($$0), $$1x.a())).toList();
         return new gnz($$1);
      }

      public Set<gnr> a() {
         return this.a.stream().map(gob::a).collect(Collectors.toSet());
      }

      public List<gob> b() {
         return this.a;
      }
   }

   public static class c implements JsonDeserializer<gnz.b> {
      public gnz.b a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gnz.b(this.a($$2, $$0.getAsJsonArray()));
      }

      private List<gob> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<gob> $$2 = new ArrayList<>();
         if ($$1.isEmpty()) {
            throw new JsonSyntaxException("Empty selector array");
         } else {
            for (JsonElement $$3 : $$1) {
               $$2.add((gob)$$0.deserialize($$3, gob.class));
            }

            return $$2;
         }
      }
   }

   static record d(Predicate<dwy> a, gnr b) {
   }
}
