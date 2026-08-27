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

public class fwv implements gje {
   private final List<fww> a;

   public fwv(List<fww> $$0) {
      this.a = $$0;
   }

   public List<fww> a() {
      return this.a;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return $$0 instanceof fwv $$1 ? this.a.equals($$1.a) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public Collection<aiy> f() {
      return this.a().stream().map(fww::a).collect(Collectors.toSet());
   }

   @Override
   public void a(Function<aiy, gje> $$0) {
      this.a().stream().map(fww::a).distinct().forEach($$1 -> $$0.apply($$1).a($$0));
   }

   @Nullable
   @Override
   public git a(gix $$0, Function<giw, ggt> $$1, gjb $$2, aiy $$3) {
      if (this.a().isEmpty()) {
         return null;
      } else {
         gjf.a $$4 = new gjf.a();

         for (fww $$5 : this.a()) {
            git $$6 = $$0.a($$5.a(), $$5);
            $$4.a($$6, $$5.d());
         }

         return $$4.a();
      }
   }

   public static class a implements JsonDeserializer<fwv> {
      public fwv a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         List<fww> $$3 = Lists.newArrayList();
         if ($$0.isJsonArray()) {
            JsonArray $$4 = $$0.getAsJsonArray();
            if ($$4.size() == 0) {
               throw new JsonParseException("Empty variant array");
            }

            for (JsonElement $$5 : $$4) {
               $$3.add((fww)$$2.deserialize($$5, fww.class));
            }
         } else {
            $$3.add((fww)$$2.deserialize($$0, fww.class));
         }

         return new fwv($$3);
      }
   }
}
