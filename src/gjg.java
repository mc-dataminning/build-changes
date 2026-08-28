import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gjg implements gja {
   private final List<gjg.d> a;

   gjg(List<gjg.d> $$0) {
      this.a = $$0;
   }

   @Override
   public Object a(duo $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
         if (this.a.get($$2).a.test($$0)) {
            $$1.add($$2);
         }
      }

      record a(gjg a, IntList b) {
         a(IntList b) {
            this.b = b;
         }
      }

      return new a($$1);
   }

   @Override
   public void a(gzt.b $$0, gzt.a $$1) {
      this.a.forEach($$2 -> $$2.b.a($$0, $$1));
   }

   @Nullable
   @Override
   public gzd a(gzj $$0, Function<gzh, gxb> $$1, gzp $$2) {
      gzq.a $$3 = new gzq.a();

      for (gjg.d $$4 : this.a) {
         gzd $$5 = $$4.b.a($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$4.a, $$5);
         }
      }

      return $$3.a();
   }

   public static record b(List<gji> a) {
      public gjg a(dup<dhj, duo> $$0) {
         List<gjg.d> $$1 = this.a.stream().map($$1x -> new gjg.d($$1x.a($$0), $$1x.a())).toList();
         return new gjg($$1);
      }

      public Set<giz> a() {
         return this.a.stream().map(gji::a).collect(Collectors.toSet());
      }

      public List<gji> b() {
         return this.a;
      }
   }

   public static class c implements JsonDeserializer<gjg.b> {
      public gjg.b a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gjg.b(this.a($$2, $$0.getAsJsonArray()));
      }

      private List<gji> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<gji> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((gji)$$0.deserialize($$3, gji.class));
         }

         return $$2;
      }
   }

   static record d(Predicate<duo> a, giz b) {
   }
}
