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

public class fuu implements ggw {
   private final djh<cwp, djg> a;
   private final List<fuw> b;

   public fuu(djh<cwp, djg> $$0, List<fuw> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<fuw> a() {
      return this.b;
   }

   public Set<fup> b() {
      Set<fup> $$0 = Sets.newHashSet();

      for (fuw $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fuu $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
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
   public void a(Function<ahg, ggw> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public ggl a(ggp $$0, Function<ggo, gel> $$1, ggt $$2, ahg $$3) {
      ggu.a $$4 = new ggu.a();

      for (fuw $$5 : this.a()) {
         ggl $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<fuu> {
      private final fui.a a;

      public a(fui.a $$0) {
         this.a = $$0;
      }

      public fuu a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new fuu(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<fuw> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<fuw> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((fuw)$$0.deserialize($$3, fuw.class));
         }

         return $$2;
      }
   }
}
