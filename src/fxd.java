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

public class fxd implements gjm {
   private final List<fxe> a;

   public fxd(List<fxe> $$0) {
      this.a = $$0;
   }

   public List<fxe> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof fxd $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<aiy> f() {
      return this.a().stream().map(fxe::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<aiy, gjm> $$0) {
      this.a().stream().map(fxe::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public gjb a(gjf $$0, Function<gje, ghb> $$1, gjj $$2, aiy $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         gjn.a $$4 = new gjn.a();

         for (fxe $$5 : this.a()) {
            gjb $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<fxd> {
      public fxd a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<fxe> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((fxe)$$2.deserialize($$5, fxe.class));
            }
         } else {
            $$3.add((fxe)$$2.deserialize($$0, fxe.class));
         }

         return new fxd($$3);
      }
   }
}
