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

public class gjl implements gjf {
   private final List<gjl.d> a;

   gjl(List<gjl.d> $$0) {
      this.a = $$0;
   }

   @Override
   public Object a(dus $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
         if (this.a.get($$2).a.test($$0)) {
            $$1.add($$2);
         }
      }

      record a(gjl a, IntList b) {
         a(IntList b) {
            this.b = b;
         }
      }

      return new a($$1);
   }

   @Override
   public void a(gzy.b $$0, gzy.a $$1) {
      this.a.forEach($$2 -> $$2.b.a($$0, $$1));
   }

   @Nullable
   @Override
   public gzi a(gzo $$0, Function<gzm, gxg> $$1, gzu $$2) {
      gzv.a $$3 = new gzv.a();

      for (gjl.d $$4 : this.a) {
         gzi $$5 = $$4.b.a($$0, $$1, $$2);
         if ($$5 != null) {
            $$3.a($$4.a, $$5);
         }
      }

      return $$3.a();
   }

   public static record b(List<gjn> a) {
      public gjl a(dut<dhm, dus> $$0) {
         List<gjl.d> $$1 = this.a.stream().map($$1x -> new gjl.d($$1x.a($$0), $$1x.a())).toList();
         return new gjl($$1);
      }

      public Set<gje> a() {
         return this.a.stream().map(gjn::a).collect(Collectors.toSet());
      }

      public List<gjn> b() {
         return this.a;
      }
   }

   public static class c implements JsonDeserializer<gjl.b> {
      public gjl.b a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gjl.b(this.a($$2, $$0.getAsJsonArray()));
      }

      private List<gjn> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<gjn> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((gjn)$$0.deserialize($$3, gjn.class));
         }

         return $$2;
      }
   }

   static record d(Predicate<dus> a, gje b) {
   }
}
