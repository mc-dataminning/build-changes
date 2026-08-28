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

public class gsa implements gru {
   private final List<gsa.d> a;

   gsa(List<gsa.d> $$0) {
      this.a = $$0;
   }

   @Override
   public Object a(eah $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
         if (this.a.get($$2).a.test($$0)) {
            $$1.add($$2);
         }
      }

      record a(gsa a, IntList b) {
         a(IntList b) {
            this.b = b;
         }
      }

      return new a($$1);
   }

   @Override
   public void a(hlp.a $$0) {
      this.a.forEach($$1 -> $$1.b.a($$0));
   }

   @Override
   public hkx a(hlg $$0) {
      List<hlo.a> $$1 = new ArrayList<>(this.a.size());

      for (gsa.d $$2 : this.a) {
         hkx $$3 = $$2.b.a($$0);
         $$1.add(new hlo.a($$2.a, $$3));
      }

      return new hlo($$1);
   }

   public static record b(List<gsc> a) {
      public gsa a(eai<dmf, eah> $$0) {
         List<gsa.d> $$1 = this.a.stream().map($$1x -> new gsa.d($$1x.a($$0), $$1x.a())).toList();
         return new gsa($$1);
      }

      public Set<grs> a() {
         return this.a.stream().map(gsc::a).collect(Collectors.toSet());
      }

      public List<gsc> b() {
         return this.a;
      }
   }

   public static class c implements JsonDeserializer<gsa.b> {
      public gsa.b a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gsa.b(this.a($$2, $$0.getAsJsonArray()));
      }

      private List<gsc> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<gsc> $$2 = new ArrayList<>();
         if ($$1.isEmpty()) {
            throw new JsonSyntaxException("Empty selector array");
         } else {
            for (JsonElement $$3 : $$1) {
               $$2.add((gsc)$$0.deserialize($$3, gsc.class));
            }

            return $$2;
         }
      }
   }

   static record d(Predicate<eah> a, grs b) {
   }
}
