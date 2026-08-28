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

public class gny implements gns {
   private final List<gny.d> a;

   gny(List<gny.d> $$0) {
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

      record a(gny a, IntList b) {
         a(IntList b) {
            this.b = b;
         }
      }

      return new a($$1);
   }

   @Override
   public void a(hhk.a $$0) {
      this.a.forEach($$1 -> $$1.b.a($$0));
   }

   @Override
   public hgs a(hhb $$0) {
      List<hhj.a> $$1 = new ArrayList<>(this.a.size());

      for (gny.d $$2 : this.a) {
         hgs $$3 = $$2.b.a($$0);
         $$1.add(new hhj.a($$2.a, $$3));
      }

      return new hhj($$1);
   }

   public static record b(List<goa> a) {
      public gny a(dwy<djm, dwx> $$0) {
         List<gny.d> $$1 = this.a.stream().map($$1x -> new gny.d($$1x.a($$0), $$1x.a())).toList();
         return new gny($$1);
      }

      public Set<gnq> a() {
         return this.a.stream().map(goa::a).collect(Collectors.toSet());
      }

      public List<goa> b() {
         return this.a;
      }
   }

   public static class c implements JsonDeserializer<gny.b> {
      public gny.b a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gny.b(this.a($$2, $$0.getAsJsonArray()));
      }

      private List<goa> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<goa> $$2 = new ArrayList<>();
         if ($$1.isEmpty()) {
            throw new JsonSyntaxException("Empty selector array");
         } else {
            for (JsonElement $$3 : $$1) {
               $$2.add((goa)$$0.deserialize($$3, goa.class));
            }

            return $$2;
         }
      }
   }

   static record d(Predicate<dwx> a, gnq b) {
   }
}
