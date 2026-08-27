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

public class fvi implements ghm {
   private final djq<cwy, djp> a;
   private final List<fvk> b;

   public fvi(djq<cwy, djp> $$0, List<fvk> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<fvk> a() {
      return this.b;
   }

   public Set<fvd> b() {
      Set<fvd> $$0 = Sets.newHashSet();

      for (fvk $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fvi $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<ahh> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<ahh, ghm> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public ghb a(ghf $$0, Function<ghe, gfb> $$1, ghj $$2, ahh $$3) {
      ghk.a $$4 = new ghk.a();

      for (fvk $$5 : this.a()) {
         ghb $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<fvi> {
      private final fuw.a a;

      public a(fuw.a $$0) {
         this.a = $$0;
      }

      public fvi a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new fvi(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<fvk> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<fvk> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((fvk)$$0.deserialize($$3, fvk.class));
         }

         return $$2;
      }
   }
}
