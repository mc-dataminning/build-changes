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

public class gpy implements gps {
   private final List<gpy.d> a;

   gpy(List<gpy.d> $$0) {
      this.a = $$0;
   }

   @Override
   public Object a(dym $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
         if (this.a.get($$2).a.test($$0)) {
            $$1.add($$2);
         }
      }

      record a(gpy a, IntList b) {
         a(IntList b) {
            this.b = b;
         }
      }

      return new a($$1);
   }

   @Override
   public void a(hjk.a $$0) {
      this.a.forEach($$1 -> $$1.b.a($$0));
   }

   @Override
   public his a(hjb $$0) {
      List<hjj.a> $$1 = new ArrayList<>(this.a.size());

      for (gpy.d $$2 : this.a) {
         his $$3 = $$2.b.a($$0);
         $$1.add(new hjj.a($$2.a, $$3));
      }

      return new hjj($$1);
   }

   public static record b(List<gqa> a) {
      public gpy a(dyn<dku, dym> $$0) {
         List<gpy.d> $$1 = this.a.stream().map($$1x -> new gpy.d($$1x.a($$0), $$1x.a())).toList();
         return new gpy($$1);
      }

      public Set<gpq> a() {
         return this.a.stream().map(gqa::a).collect(Collectors.toSet());
      }

      public List<gqa> b() {
         return this.a;
      }
   }

   public static class c implements JsonDeserializer<gpy.b> {
      public gpy.b a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gpy.b(this.a($$2, $$0.getAsJsonArray()));
      }

      private List<gqa> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<gqa> $$2 = new ArrayList<>();
         if ($$1.isEmpty()) {
            throw new JsonSyntaxException("Empty selector array");
         } else {
            for (JsonElement $$3 : $$1) {
               $$2.add((gqa)$$0.deserialize($$3, gqa.class));
            }

            return $$2;
         }
      }
   }

   static record d(Predicate<dym> a, gpq b) {
   }
}
