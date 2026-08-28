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

public class gne implements gmy {
   private final List<gne.d> a;

   gne(List<gne.d> $$0) {
      this.a = $$0;
   }

   @Override
   public Object a(dxn $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
         if (this.a.get($$2).a.test($$0)) {
            $$1.add($$2);
         }
      }

      record a(gne a, IntList b) {
         a(IntList b) {
            this.b = b;
         }
      }

      return new a($$1);
   }

   @Override
   public void a(hdz.a $$0) {
      this.a.forEach($$1 -> $$1.b.a($$0));
   }

   @Override
   public hdg a(hdp $$0, Function<hdn, hbe> $$1, hdv $$2) {
      List<hdw.a> $$3 = new ArrayList<>(this.a.size());

      for (gne.d $$4 : this.a) {
         hdg $$5 = $$4.b.a($$0, $$1, $$2);
         $$3.add(new hdw.a($$4.a, $$5));
      }

      return new hdw($$3);
   }

   public static record b(List<gng> a) {
      public gne a(dxo<dke, dxn> $$0) {
         List<gne.d> $$1 = this.a.stream().map($$1x -> new gne.d($$1x.a($$0), $$1x.a())).toList();
         return new gne($$1);
      }

      public Set<gmx> a() {
         return this.a.stream().map(gng::a).collect(Collectors.toSet());
      }

      public List<gng> b() {
         return this.a;
      }
   }

   public static class c implements JsonDeserializer<gne.b> {
      public gne.b a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gne.b(this.a($$2, $$0.getAsJsonArray()));
      }

      private List<gng> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<gng> $$2 = new ArrayList<>();
         if ($$1.isEmpty()) {
            throw new JsonSyntaxException("Empty selector array");
         } else {
            for (JsonElement $$3 : $$1) {
               $$2.add((gng)$$0.deserialize($$3, gng.class));
            }

            return $$2;
         }
      }
   }

   static record d(Predicate<dxn> a, gmx b) {
   }
}
