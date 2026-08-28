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

public class gng implements gna {
   private final List<gng.d> a;

   gng(List<gng.d> $$0) {
      this.a = $$0;
   }

   @Override
   public Object a(dxo $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
         if (this.a.get($$2).a.test($$0)) {
            $$1.add($$2);
         }
      }

      record a(gng a, IntList b) {
         a(IntList b) {
            this.b = b;
         }
      }

      return new a($$1);
   }

   @Override
   public void a(heb.a $$0) {
      this.a.forEach($$1 -> $$1.b.a($$0));
   }

   @Override
   public hdi a(hdr $$0, Function<hdp, hbg> $$1, hdx $$2) {
      List<hdy.a> $$3 = new ArrayList<>(this.a.size());

      for (gng.d $$4 : this.a) {
         hdi $$5 = $$4.b.a($$0, $$1, $$2);
         $$3.add(new hdy.a($$4.a, $$5));
      }

      return new hdy($$3);
   }

   public static record b(List<gni> a) {
      public gng a(dxp<dkd, dxo> $$0) {
         List<gng.d> $$1 = this.a.stream().map($$1x -> new gng.d($$1x.a($$0), $$1x.a())).toList();
         return new gng($$1);
      }

      public Set<gmz> a() {
         return this.a.stream().map(gni::a).collect(Collectors.toSet());
      }

      public List<gni> b() {
         return this.a;
      }
   }

   public static class c implements JsonDeserializer<gng.b> {
      public gng.b a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gng.b(this.a($$2, $$0.getAsJsonArray()));
      }

      private List<gni> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<gni> $$2 = new ArrayList<>();
         if ($$1.isEmpty()) {
            throw new JsonSyntaxException("Empty selector array");
         } else {
            for (JsonElement $$3 : $$1) {
               $$2.add((gni)$$0.deserialize($$3, gni.class));
            }

            return $$2;
         }
      }
   }

   static record d(Predicate<dxo> a, gmz b) {
   }
}
