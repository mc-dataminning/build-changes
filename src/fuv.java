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

public class fuv implements ggx {
   private final djh<cwp, djg> a;
   private final List<fux> b;

   public fuv(djh<cwp, djg> $$0, List<fux> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<fux> a() {
      return this.b;
   }

   public Set<fuq> b() {
      Set<fuq> $$0 = Sets.newHashSet();

      for (fux $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof fuv $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
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
   public void a(Function<ahg, ggx> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public ggm a(ggq $$0, Function<ggp, gem> $$1, ggu $$2, ahg $$3) {
      ggv.a $$4 = new ggv.a();

      for (fux $$5 : this.a()) {
         ggm $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<fuv> {
      private final fuj.a a;

      public a(fuj.a $$0) {
         this.a = $$0;
      }

      public fuv a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new fuv(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<fux> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<fux> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((fux)$$0.deserialize($$3, fux.class));
         }

         return $$2;
      }
   }
}
