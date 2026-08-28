import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public record goo(gon b, gon c, gon d, gon e, gon f, gon g, gon h, gon i) {
   public static final goo a = new goo(gon.a, gon.a, gon.a, gon.a, gon.a, gon.a, gon.a, gon.a);

   public gon a(cxf $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gon.a;
      };
   }

   public gon a() {
      return this.b;
   }

   public gon b() {
      return this.c;
   }

   public gon c() {
      return this.d;
   }

   public gon d() {
      return this.e;
   }

   public gon e() {
      return this.f;
   }

   public gon f() {
      return this.g;
   }

   public gon g() {
      return this.h;
   }

   public gon h() {
      return this.i;
   }

   protected static class a implements JsonDeserializer<goo> {
      public goo a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gon $$4 = this.a($$2, $$3, cxf.c);
         gon $$5 = this.a($$2, $$3, cxf.b);
         if ($$5 == gon.a) {
            $$5 = $$4;
         }

         gon $$6 = this.a($$2, $$3, cxf.e);
         gon $$7 = this.a($$2, $$3, cxf.d);
         if ($$7 == gon.a) {
            $$7 = $$6;
         }

         gon $$8 = this.a($$2, $$3, cxf.f);
         gon $$9 = this.a($$2, $$3, cxf.g);
         gon $$10 = this.a($$2, $$3, cxf.h);
         gon $$11 = this.a($$2, $$3, cxf.i);
         return new goo($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gon a(JsonDeserializationContext $$0, JsonObject $$1, cxf $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gon)$$0.deserialize($$1.get($$3), gon.class) : gon.a;
      }
   }
}
