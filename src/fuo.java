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

public class fuo implements ggr {
   private final djb<cwj, dja> a;
   private final List<fuq> b;

   public fuo(djb<cwj, dja> $$0, List<fuq> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<fuq> a() {
      return this.b;
   }

   public Set<fuj> b() {
      Set<fuj> $$0 = Sets.newHashSet();

      for (fuq $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fuo $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<ahd> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<ahd, ggr> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public ggg a(ggk $$0, Function<ggj, gef> $$1, ggo $$2, ahd $$3) {
      ggp.a $$4 = new ggp.a();

      for (fuq $$5 : this.a()) {
         ggg $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<fuo> {
      private final fuc.a a;

      public a(fuc.a $$0) {
         this.a = $$0;
      }

      public fuo a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new fuo(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<fuq> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<fuq> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((fuq)$$0.deserialize($$3, fuq.class));
         }

         return $$2;
      }
   }
}
