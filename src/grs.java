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

public class grs implements grm {
   private final List<grs.d> a;

   grs(List<grs.d> $$0) {
      this.a = $$0;
   }

   @Override
   public Object a(dzz $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
         if (this.a.get($$2).a.test($$0)) {
            $$1.add($$2);
         }
      }

      record a(grs a, IntList b) {
         a(IntList b) {
            this.b = b;
         }
      }

      return new a($$1);
   }

   @Override
   public void a(hlh.a $$0) {
      this.a.forEach($$1 -> $$1.b.a($$0));
   }

   @Override
   public hkp a(hky $$0) {
      List<hlg.a> $$1 = new ArrayList<>(this.a.size());

      for (grs.d $$2 : this.a) {
         hkp $$3 = $$2.b.a($$0);
         $$1.add(new hlg.a($$2.a, $$3));
      }

      return new hlg($$1);
   }

   public static record b(List<gru> a) {
      public grs a(eaa<dma, dzz> $$0) {
         List<grs.d> $$1 = this.a.stream().map($$1x -> new grs.d($$1x.a($$0), $$1x.a())).toList();
         return new grs($$1);
      }

      public Set<grk> a() {
         return this.a.stream().map(gru::a).collect(Collectors.toSet());
      }

      public List<gru> b() {
         return this.a;
      }
   }

   public static class c implements JsonDeserializer<grs.b> {
      public grs.b a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new grs.b(this.a($$2, $$0.getAsJsonArray()));
      }

      private List<gru> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<gru> $$2 = new ArrayList<>();
         if ($$1.isEmpty()) {
            throw new JsonSyntaxException("Empty selector array");
         } else {
            for (JsonElement $$3 : $$1) {
               $$2.add((gru)$$0.deserialize($$3, gru.class));
            }

            return $$2;
         }
      }
   }

   static record d(Predicate<dzz> a, grk b) {
   }
}
