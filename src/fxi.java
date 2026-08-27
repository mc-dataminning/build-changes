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

public class fxi implements gjm {
   private final dlk<cys, dlj> a;
   private final List<fxk> b;

   public fxi(dlk<cys, dlj> $$0, List<fxk> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<fxk> a() {
      return this.b;
   }

   public Set<fxd> b() {
      Set<fxd> $$0 = Sets.newHashSet();

      for (fxk $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fxi $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<aiy> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<aiy, gjm> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public gjb a(gjf $$0, Function<gje, ghb> $$1, gjj $$2, aiy $$3) {
      gjk.a $$4 = new gjk.a();

      for (fxk $$5 : this.a()) {
         gjb $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<fxi> {
      private final fww.a a;

      public a(fww.a $$0) {
         this.a = $$0;
      }

      public fxi a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new fxi(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<fxk> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<fxk> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((fxk)$$0.deserialize($$3, fxk.class));
         }

         return $$2;
      }
   }
}
