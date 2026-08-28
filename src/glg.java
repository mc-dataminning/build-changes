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

public class glg implements gla {
   private final List<glg.d> a;

   glg(List<glg.d> $$0) {
      this.a = $$0;
   }

   @Override
   public Object a(dvv $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
         if (this.a.get($$2).a.test($$0)) {
            $$1.add($$2);
         }
      }

      record a(glg a, IntList b) {
         a(IntList b) {
            this.b = b;
         }
      }

      return new a($$1);
   }

   @Override
   public void a(hbz.a $$0) {
      this.a.forEach($$1 -> $$1.b.a($$0));
   }

   @Override
   public hbg a(hbp $$0, Function<hbn, gze> $$1, hbv $$2) {
      List<hbw.a> $$3 = new ArrayList<>(this.a.size());

      for (glg.d $$4 : this.a) {
         hbg $$5 = $$4.b.a($$0, $$1, $$2);
         $$3.add(new hbw.a($$4.a, $$5));
      }

      return new hbw($$3);
   }

   public static record b(List<gli> a) {
      public glg a(dvw<diq, dvv> $$0) {
         List<glg.d> $$1 = this.a.stream().map($$1x -> new glg.d($$1x.a($$0), $$1x.a())).toList();
         return new glg($$1);
      }

      public Set<gkz> a() {
         return this.a.stream().map(gli::a).collect(Collectors.toSet());
      }

      public List<gli> b() {
         return this.a;
      }
   }

   public static class c implements JsonDeserializer<glg.b> {
      public glg.b a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new glg.b(this.a($$2, $$0.getAsJsonArray()));
      }

      private List<gli> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<gli> $$2 = new ArrayList<>();
         if ($$1.isEmpty()) {
            throw new JsonSyntaxException("Empty selector array");
         } else {
            for (JsonElement $$3 : $$1) {
               $$2.add((gli)$$0.deserialize($$3, gli.class));
            }

            return $$2;
         }
      }
   }

   static record d(Predicate<dvv> a, gkz b) {
   }
}
