import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public record gnp(gno b, gno c, gno d, gno e, gno f, gno g, gno h, gno i) {
   public static final gnp a = new gnp(gno.a, gno.a, gno.a, gno.a, gno.a, gno.a, gno.a, gno.a);

   public gno a(cwn $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gno.a;
      };
   }

   public gno a() {
      return this.b;
   }

   public gno b() {
      return this.c;
   }

   public gno c() {
      return this.d;
   }

   public gno d() {
      return this.e;
   }

   public gno e() {
      return this.f;
   }

   public gno f() {
      return this.g;
   }

   public gno g() {
      return this.h;
   }

   public gno h() {
      return this.i;
   }

   protected static class a implements JsonDeserializer<gnp> {
      public gnp a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gno $$4 = this.a($$2, $$3, cwn.c);
         gno $$5 = this.a($$2, $$3, cwn.b);
         if ($$5 == gno.a) {
            $$5 = $$4;
         }

         gno $$6 = this.a($$2, $$3, cwn.e);
         gno $$7 = this.a($$2, $$3, cwn.d);
         if ($$7 == gno.a) {
            $$7 = $$6;
         }

         gno $$8 = this.a($$2, $$3, cwn.f);
         gno $$9 = this.a($$2, $$3, cwn.g);
         gno $$10 = this.a($$2, $$3, cwn.h);
         gno $$11 = this.a($$2, $$3, cwn.i);
         return new gnp($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gno a(JsonDeserializationContext $$0, JsonObject $$1, cwn $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gno)$$0.deserialize($$1.get($$3), gno.class) : gno.a;
      }
   }
}
