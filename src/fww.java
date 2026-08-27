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

public class fww implements gjf {
   private final List<fwx> a;

   public fww(List<fwx> $$0) {
      this.a = $$0;
   }

   public List<fwx> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof fww $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<aiy> f() {
      return this.a().stream().map(fwx::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<aiy, gjf> $$0) {
      this.a().stream().map(fwx::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public giu a(giy $$0, Function<gix, ggu> $$1, gjc $$2, aiy $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         gjg.a $$4 = new gjg.a();

         for (fwx $$5 : this.a()) {
            giu $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<fww> {
      public fww a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<fwx> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((fwx)$$2.deserialize($$5, fwx.class));
            }
         } else {
            $$3.add((fwx)$$2.deserialize($$0, fwx.class));
         }

         return new fww($$3);
      }
   }
}
