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

public class fxa implements gje {
   private final dlg<cyo, dlf> a;
   private final List<fxc> b;

   public fxa(dlg<cyo, dlf> $$0, List<fxc> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<fxc> a() {
      return this.b;
   }

   public Set<fwv> b() {
      Set<fwv> $$0 = Sets.newHashSet();

      for (fxc $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fxa $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
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
   public void a(Function<aiy, gje> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public git a(gix $$0, Function<giw, ggt> $$1, gjb $$2, aiy $$3) {
      gjc.a $$4 = new gjc.a();

      for (fxc $$5 : this.a()) {
         git $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<fxa> {
      private final fwo.a a;

      public a(fwo.a $$0) {
         this.a = $$0;
      }

      public fxa a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new fxa(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<fxc> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<fxc> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((fxc)$$0.deserialize($$3, fxc.class));
         }

         return $$2;
      }
   }
}
