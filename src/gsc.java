import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public record gsc(gsb b, gsb c, gsb d, gsb e, gsb f, gsb g, gsb h, gsb i) {
   public static final gsc a = new gsc(gsb.a, gsb.a, gsb.a, gsb.a, gsb.a, gsb.a, gsb.a, gsb.a);

   public gsb a(czi $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gsb.a;
      };
   }

   public gsb a() {
      return this.b;
   }

   public gsb b() {
      return this.c;
   }

   public gsb c() {
      return this.d;
   }

   public gsb d() {
      return this.e;
   }

   public gsb e() {
      return this.f;
   }

   public gsb f() {
      return this.g;
   }

   public gsb g() {
      return this.h;
   }

   public gsb h() {
      return this.i;
   }

   protected static class a implements JsonDeserializer<gsc> {
      public gsc a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gsb $$4 = this.a($$2, $$3, czi.c);
         gsb $$5 = this.a($$2, $$3, czi.b);
         if ($$5 == gsb.a) {
            $$5 = $$4;
         }

         gsb $$6 = this.a($$2, $$3, czi.e);
         gsb $$7 = this.a($$2, $$3, czi.d);
         if ($$7 == gsb.a) {
            $$7 = $$6;
         }

         gsb $$8 = this.a($$2, $$3, czi.f);
         gsb $$9 = this.a($$2, $$3, czi.g);
         gsb $$10 = this.a($$2, $$3, czi.h);
         gsb $$11 = this.a($$2, $$3, czi.i);
         return new gsc($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gsb a(JsonDeserializationContext $$0, JsonObject $$1, czi $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gsb)$$0.deserialize($$1.get($$3), gsb.class) : gsb.a;
      }
   }
}
