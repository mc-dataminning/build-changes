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

public class gkx implements gkr {
   private final List<gkx.d> a;

   gkx(List<gkx.d> $$0) {
      this.a = $$0;
   }

   @Override
   public Object a(dvo $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
         if (this.a.get($$2).a.test($$0)) {
            $$1.add($$2);
         }
      }

      record a(gkx a, IntList b) {
         a(IntList b) {
            this.b = b;
         }
      }

      return new a($$1);
   }

   @Override
   public void a(hbo.a $$0) {
      this.a.forEach($$1 -> $$1.b.a($$0));
   }

   @Override
   public hav a(hbe $$0, Function<hbc, gyt> $$1, hbk $$2) {
      List<hbl.a> $$3 = new ArrayList<>(this.a.size());

      for (gkx.d $$4 : this.a) {
         hav $$5 = $$4.b.a($$0, $$1, $$2);
         $$3.add(new hbl.a($$4.a, $$5));
      }

      return new hbl($$3);
   }

   public static record b(List<gkz> a) {
      public gkx a(dvp<dij, dvo> $$0) {
         List<gkx.d> $$1 = this.a.stream().map($$1x -> new gkx.d($$1x.a($$0), $$1x.a())).toList();
         return new gkx($$1);
      }

      public Set<gkq> a() {
         return this.a.stream().map(gkz::a).collect(Collectors.toSet());
      }

      public List<gkz> b() {
         return this.a;
      }
   }

   public static class c implements JsonDeserializer<gkx.b> {
      public gkx.b a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gkx.b(this.a($$2, $$0.getAsJsonArray()));
      }

      private List<gkz> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<gkz> $$2 = new ArrayList<>();
         if ($$1.isEmpty()) {
            throw new JsonSyntaxException("Empty selector array");
         } else {
            for (JsonElement $$3 : $$1) {
               $$2.add((gkz)$$0.deserialize($$3, gkz.class));
            }

            return $$2;
         }
      }
   }

   static record d(Predicate<dvo> a, gkq b) {
   }
}
