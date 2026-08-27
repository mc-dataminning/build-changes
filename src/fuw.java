import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class fuw implements ggy {
   private final dji<cwq, djh> a;
   private final List<fuy> b;

   public fuw(dji<cwq, djh> $$0, List<fuy> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<fuy> a() {
      return this.b;
   }

   public Set<fur> b() {
      Set<fur> $$0 = Sets.newHashSet();

      for (fuy $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fuw $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<ahg> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<ahg, ggy> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public ggn a(ggr $$0, Function<ggq, gen> $$1, ggv $$2, ahg $$3) {
      ggw.a $$4 = new ggw.a();

      for (fuy $$5 : this.a()) {
         ggn $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<fuw> {
      private final fuk.a a;

      public a(fuk.a $$0) {
         this.a = $$0;
      }

      public fuw a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new fuw(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<fuy> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<fuy> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((fuy)$$0.deserialize($$3, fuy.class));
         }

         return $$2;
      }
   }
}
