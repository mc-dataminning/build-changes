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

public class gir implements gil {
   private final List<gir.d> a;

   gir(List<gir.d> $$0) {
      this.a = $$0;
   }

   @Override
   public Object a(dua $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
         if (this.a.get($$2).a.test($$0)) {
            $$1.add($$2);
         }
      }

      record a(gir a, IntList b) {
         a(IntList b) {
            this.b = b;
         }
      }

      return new a($$1);
   }

   @Override
   public void a(gzc.b $$0, gzc.a $$1) {
      this.a.forEach($$2 -> $$2.b.a($$0, $$1));
   }

   @Nullable
   @Override
   public gym a(gys $$0, Function<gyq, gwk> $$1, gyy $$2) {
      gyz.a $$3 = new gyz.a();

      for (gir.d $$4 : this.a) {
         gym $$5 = $$4.b.a($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$4.a, $$5);
         }
      }

      return $$3.a();
   }

   public static record b(List<git> a) {
      public gir a(dub<dgv, dua> $$0) {
         List<gir.d> $$1 = this.a.stream().map($$1x -> new gir.d($$1x.a($$0), $$1x.a())).toList();
         return new gir($$1);
      }

      public Set<gik> a() {
         return this.a.stream().map(git::a).collect(Collectors.toSet());
      }

      public List<git> b() {
         return this.a;
      }
   }

   public static class c implements JsonDeserializer<gir.b> {
      public gir.b a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gir.b(this.a($$2, $$0.getAsJsonArray()));
      }

      private List<git> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<git> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((git)$$0.deserialize($$3, git.class));
         }

         return $$2;
      }
   }

   static record d(Predicate<dua> a, gik b) {
   }
}
