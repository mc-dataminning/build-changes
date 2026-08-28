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
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class gnk implements gne {
   private final List<gnk.d> a;

   gnk(List<gnk.d> $$0) {
      this.a = $$0;
   }

   @Override
   public Object a(dxu $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
         if (this.a.get($$2).a.test($$0)) {
            $$1.add($$2);
         }
      }

      record a(gnk a, IntList b) {
         a(IntList b) {
            this.b = b;
         }
      }

      return new a($$1);
   }

   @Override
   public void a(hef.a $$0) {
      this.a.forEach($$1 -> $$1.b.a($$0));
   }

   @Override
   public hdm a(hdv $$0, Function<hdt, hbk> $$1, heb $$2) {
      List<hec.a> $$3 = new ArrayList<>(this.a.size());

      for (gnk.d $$4 : this.a) {
         hdm $$5 = $$4.b.a($$0, $$1, $$2);
         $$3.add(new hec.a($$4.a, $$5));
      }

      return new hec($$3);
   }

   public static record b(List<gnm> a) {
      public gnk a(dxv<dkl, dxu> $$0) {
         List<gnk.d> $$1 = this.a.stream().map($$1x -> new gnk.d($$1x.a($$0), $$1x.a())).toList();
         return new gnk($$1);
      }

      public Set<gnd> a() {
         return this.a.stream().map(gnm::a).collect(Collectors.toSet());
      }

      public List<gnm> b() {
         return this.a;
      }
   }

   public static class c implements JsonDeserializer<gnk.b> {
      public gnk.b a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gnk.b(this.a($$2, $$0.getAsJsonArray()));
      }

      private List<gnm> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<gnm> $$2 = new ArrayList<>();
         if ($$1.isEmpty()) {
            throw new JsonSyntaxException("Empty selector array");
         } else {
            for (JsonElement $$3 : $$1) {
               $$2.add((gnm)$$0.deserialize($$3, gnm.class));
            }

            return $$2;
         }
      }
   }

   static record d(Predicate<dxu> a, gnd b) {
   }
}
