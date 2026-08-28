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

public class gnx implements gnr {
   private final List<gnx.d> a;

   gnx(List<gnx.d> $$0) {
      this.a = $$0;
   }

   @Override
   public Object a(dwx $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
         if (this.a.get($$2).a.test($$0)) {
            $$1.add($$2);
         }
      }

      record a(gnx a, IntList b) {
         a(IntList b) {
            this.b = b;
         }
      }

      return new a($$1);
   }

   @Override
   public void a(hhd.a $$0) {
      this.a.forEach($$1 -> $$1.b.a($$0));
   }

   @Override
   public hgl a(hgu $$0) {
      List<hhc.a> $$1 = new ArrayList<>(this.a.size());

      for (gnx.d $$2 : this.a) {
         hgl $$3 = $$2.b.a($$0);
         $$1.add(new hhc.a($$2.a, $$3));
      }

      return new hhc($$1);
   }

   public static record b(List<gnz> a) {
      public gnx a(dwy<djm, dwx> $$0) {
         List<gnx.d> $$1 = this.a.stream().map($$1x -> new gnx.d($$1x.a($$0), $$1x.a())).toList();
         return new gnx($$1);
      }

      public Set<gnp> a() {
         return this.a.stream().map(gnz::a).collect(Collectors.toSet());
      }

      public List<gnz> b() {
         return this.a;
      }
   }

   public static class c implements JsonDeserializer<gnx.b> {
      public gnx.b a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gnx.b(this.a($$2, $$0.getAsJsonArray()));
      }

      private List<gnz> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<gnz> $$2 = new ArrayList<>();
         if ($$1.isEmpty()) {
            throw new JsonSyntaxException("Empty selector array");
         } else {
            for (JsonElement $$3 : $$1) {
               $$2.add((gnz)$$0.deserialize($$3, gnz.class));
            }

            return $$2;
         }
      }
   }

   static record d(Predicate<dwx> a, gnp b) {
   }
}
