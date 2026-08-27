import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class gco implements goz {
   private final List<gcp> a;

   public gco(List<gcp> $$0) {
      this.a = $$0;
   }

   public List<gcp> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof gco $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<akf> f() {
      return this.a().stream().map(gcp::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<akf, goz> $$0) {
      this.a().stream().map(gcp::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public goo a(gos $$0, Function<gor, gmo> $$1, gow $$2, akf $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         gpa.a $$4 = new gpa.a();

         for (gcp $$5 : this.a()) {
            goo $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<gco> {
      public gco a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<gcp> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((gcp)$$2.deserialize($$5, gcp.class));
            }
         } else {
            $$3.add((gcp)$$2.deserialize($$0, gcp.class));
         }

         return new gco($$3);
      }
   }
}
