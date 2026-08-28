import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public record gqu(gqt b, gqt c, gqt d, gqt e, gqt f, gqt g, gqt h, gqt i) {
   public static final gqu a = new gqu(gqt.a, gqt.a, gqt.a, gqt.a, gqt.a, gqt.a, gqt.a, gqt.a);

   public gqt a(cyq $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gqt.a;
      };
   }

   public gqt a() {
      return this.b;
   }

   public gqt b() {
      return this.c;
   }

   public gqt c() {
      return this.d;
   }

   public gqt d() {
      return this.e;
   }

   public gqt e() {
      return this.f;
   }

   public gqt f() {
      return this.g;
   }

   public gqt g() {
      return this.h;
   }

   public gqt h() {
      return this.i;
   }

   protected static class a implements JsonDeserializer<gqu> {
      public gqu a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gqt $$4 = this.a($$2, $$3, cyq.c);
         gqt $$5 = this.a($$2, $$3, cyq.b);
         if ($$5 == gqt.a) {
            $$5 = $$4;
         }

         gqt $$6 = this.a($$2, $$3, cyq.e);
         gqt $$7 = this.a($$2, $$3, cyq.d);
         if ($$7 == gqt.a) {
            $$7 = $$6;
         }

         gqt $$8 = this.a($$2, $$3, cyq.f);
         gqt $$9 = this.a($$2, $$3, cyq.g);
         gqt $$10 = this.a($$2, $$3, cyq.h);
         gqt $$11 = this.a($$2, $$3, cyq.i);
         return new gqu($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gqt a(JsonDeserializationContext $$0, JsonObject $$1, cyq $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gqt)$$0.deserialize($$1.get($$3), gqt.class) : gqt.a;
      }
   }
}
