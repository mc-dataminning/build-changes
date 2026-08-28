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

public class gnj implements gnd {
   private final List<gnj.d> a;

   gnj(List<gnj.d> $$0) {
      this.a = $$0;
   }

   @Override
   public Object a(dxu $$0) {
      IntList $$1 = new IntArrayList();

      for (int $$2 = 0; $$2 < this.a.size(); $$2++) {
         if (this.a.get($$2).a.test($$0)) {
            $$1.add($$2);
         }
      }

      record a(gnj a, IntList b) {
         a(IntList b) {
            this.b = b;
         }
      }

      return new a($$1);
   }

   @Override
   public void a(hee.a $$0) {
      this.a.forEach($$1 -> $$1.b.a($$0));
   }

   @Override
   public hdl a(hdu $$0, Function<hds, hbj> $$1, hea $$2) {
      List<heb.a> $$3 = new ArrayList<>(this.a.size());

      for (gnj.d $$4 : this.a) {
         hdl $$5 = $$4.b.a($$0, $$1, $$2);
         $$3.add(new heb.a($$4.a, $$5));
      }

      return new heb($$3);
   }

   public static record b(List<gnl> a) {
      public gnj a(dxv<dkl, dxu> $$0) {
         List<gnj.d> $$1 = this.a.stream().map($$1x -> new gnj.d($$1x.a($$0), $$1x.a())).toList();
         return new gnj($$1);
      }

      public Set<gnc> a() {
         return this.a.stream().map(gnl::a).collect(Collectors.toSet());
      }

      public List<gnl> b() {
         return this.a;
      }
   }

   public static class c implements JsonDeserializer<gnj.b> {
      public gnj.b a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gnj.b(this.a($$2, $$0.getAsJsonArray()));
      }

      private List<gnl> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<gnl> $$2 = new ArrayList<>();
         if ($$1.isEmpty()) {
            throw new JsonSyntaxException("Empty selector array");
         } else {
            for (JsonElement $$3 : $$1) {
               $$2.add((gnl)$$0.deserialize($$3, gnl.class));
            }

            return $$2;
         }
      }
   }

   static record d(Predicate<dxu> a, gnc b) {
   }
}
