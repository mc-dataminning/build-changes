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

public class gox implements gor {
   private final List<gox.d> a;

   gox(List<gox.d> $$0) {
      this.a = $$0;
   }

   @Override
   public Object a(dxq $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
         if (this.a.get($$2).a.test($$0)) {
            $$1.add($$2);
         }
      }

      record a(gox a, IntList b) {
         a(IntList b) {
            this.b = b;
         }
      }

      return new a($$1);
   }

   @Override
   public void a(hij.a $$0) {
      this.a.forEach($$1 -> $$1.b.a($$0));
   }

   @Override
   public hhr a(hia $$0) {
      List<hii.a> $$1 = new ArrayList<>(this.a.size());

      for (gox.d $$2 : this.a) {
         hhr $$3 = $$2.b.a($$0);
         $$1.add(new hii.a($$2.a, $$3));
      }

      return new hii($$1);
   }

   public static record b(List<goz> a) {
      public gox a(dxr<dke, dxq> $$0) {
         List<gox.d> $$1 = this.a.stream().map($$1x -> new gox.d($$1x.a($$0), $$1x.a())).toList();
         return new gox($$1);
      }

      public Set<gop> a() {
         return this.a.stream().map(goz::a).collect(Collectors.toSet());
      }

      public List<goz> b() {
         return this.a;
      }
   }

   public static class c implements JsonDeserializer<gox.b> {
      public gox.b a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gox.b(this.a($$2, $$0.getAsJsonArray()));
      }

      private List<goz> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<goz> $$2 = new ArrayList<>();
         if ($$1.isEmpty()) {
            throw new JsonSyntaxException("Empty selector array");
         } else {
            for (JsonElement $$3 : $$1) {
               $$2.add((goz)$$0.deserialize($$3, goz.class));
            }

            return $$2;
         }
      }
   }

   static record d(Predicate<dxq> a, gop b) {
   }
}
