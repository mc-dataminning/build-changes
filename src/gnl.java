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

public class gnl implements gnf {
   private final List<gnl.d> a;

   gnl(List<gnl.d> $$0) {
      this.a = $$0;
   }

   @Override
   public Object a(dxv $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
         if (this.a.get($$2).a.test($$0)) {
            $$1.add($$2);
         }
      }

      record a(gnl a, IntList b) {
         a(IntList b) {
            this.b = b;
         }
      }

      return new a($$1);
   }

   @Override
   public void a(heg.a $$0) {
      this.a.forEach($$1 -> $$1.b.a($$0));
   }

   @Override
   public hdn a(hdw $$0, Function<hdu, hbl> $$1, hec $$2) {
      List<hed.a> $$3 = new ArrayList<>(this.a.size());

      for (gnl.d $$4 : this.a) {
         hdn $$5 = $$4.b.a($$0, $$1, $$2);
         $$3.add(new hed.a($$4.a, $$5));
      }

      return new hed($$3);
   }

   public static record b(List<gnn> a) {
      public gnl a(dxw<dkm, dxv> $$0) {
         List<gnl.d> $$1 = this.a.stream().map($$1x -> new gnl.d($$1x.a($$0), $$1x.a())).toList();
         return new gnl($$1);
      }

      public Set<gne> a() {
         return this.a.stream().map(gnn::a).collect(Collectors.toSet());
      }

      public List<gnn> b() {
         return this.a;
      }
   }

   public static class c implements JsonDeserializer<gnl.b> {
      public gnl.b a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gnl.b(this.a($$2, $$0.getAsJsonArray()));
      }

      private List<gnn> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<gnn> $$2 = new ArrayList<>();
         if ($$1.isEmpty()) {
            throw new JsonSyntaxException("Empty selector array");
         } else {
            for (JsonElement $$3 : $$1) {
               $$2.add((gnn)$$0.deserialize($$3, gnn.class));
            }

            return $$2;
         }
      }
   }

   static record d(Predicate<dxv> a, gne b) {
   }
}
