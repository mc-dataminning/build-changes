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

public class gfu implements gsc {
   private final dsm<dfi, dsl> a;
   private final List<gfw> b;

   public gfu(dsm<dfi, dsl> $$0, List<gfw> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<gfw> a() {
      return this.b;
   }

   public Set<gfp> b() {
      Set<gfp> $$0 = Sets.newHashSet();

      for (gfw $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof gfu $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<akk> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<akk, gsc> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public grr a(grv $$0, Function<gru, gpq> $$1, grz $$2, akk $$3) {
      gsa.a $$4 = new gsa.a();

      for (gfw $$5 : this.a()) {
         grr $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<gfu> {
      private final gfi.a a;

      public a(gfi.a $$0) {
         this.a = $$0;
      }

      public gfu a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gfu(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<gfw> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<gfw> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((gfw)$$0.deserialize($$3, gfw.class));
         }

         return $$2;
      }
   }
}
