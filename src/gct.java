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

public class gct implements goz {
   private final dpz<dcv, dpy> a;
   private final List<gcv> b;

   public gct(dpz<dcv, dpy> $$0, List<gcv> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public List<gcv> a() {
      return this.b;
   }

   public Set<gco> b() {
      Set<gco> $$0 = Sets.newHashSet();

      for (gcv $$1 : this.b) {
         $$0.add($$1.a());
      }

      return $$0;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof gct $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.a, this.b);
   }

   @Override
   public Collection<akf> f() {
      return this.a().stream().flatMap($$0 -> $$0.a().f().stream()).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<akf, goz> $$0) {
      this.a().forEach($$1 -> $$1.a().a($$0));
   }

   @Nullable
   @Override
   public goo a(gos $$0, Function<gor, gmo> $$1, gow $$2, akf $$3) {
      gox.a $$4 = new gox.a();

      for (gcv $$5 : this.a()) {
         goo $$6 = $$5.a().a($$0, $$1, $$2, $$3);
         if ($$6 != null) {
            $$4.a($$5.a(this.a), $$6);
         }
      }

      return $$4.a();
   }

   public static class a implements JsonDeserializer<gct> {
      private final gch.a a;

      public a(gch.a $$0) {
         this.a = $$0;
      }

      public gct a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         return new gct(this.a.a(), this.a($$2, $$0.getAsJsonArray()));
      }

      private List<gcv> a(JsonDeserializationContext $$0, JsonArray $$1) {
         List<gcv> $$2 = Lists.newArrayList();

         for (JsonElement $$3 : $$1) {
            $$2.add((gcv)$$0.deserialize($$3, gcv.class));
         }

         return $$2;
      }
   }
}
