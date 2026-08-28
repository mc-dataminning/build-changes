import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public record gpp(gpo b, gpo c, gpo d, gpo e, gpo f, gpo g, gpo h, gpo i) {
   public static final gpp a = new gpp(gpo.a, gpo.a, gpo.a, gpo.a, gpo.a, gpo.a, gpo.a, gpo.a);

   public gpo a(cxw $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gpo.a;
      };
   }

   public gpo a() {
      return this.b;
   }

   public gpo b() {
      return this.c;
   }

   public gpo c() {
      return this.d;
   }

   public gpo d() {
      return this.e;
   }

   public gpo e() {
      return this.f;
   }

   public gpo f() {
      return this.g;
   }

   public gpo g() {
      return this.h;
   }

   public gpo h() {
      return this.i;
   }

   protected static class a implements JsonDeserializer<gpp> {
      public gpp a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gpo $$4 = this.a($$2, $$3, cxw.c);
         gpo $$5 = this.a($$2, $$3, cxw.b);
         if ($$5 == gpo.a) {
            $$5 = $$4;
         }

         gpo $$6 = this.a($$2, $$3, cxw.e);
         gpo $$7 = this.a($$2, $$3, cxw.d);
         if ($$7 == gpo.a) {
            $$7 = $$6;
         }

         gpo $$8 = this.a($$2, $$3, cxw.f);
         gpo $$9 = this.a($$2, $$3, cxw.g);
         gpo $$10 = this.a($$2, $$3, cxw.h);
         gpo $$11 = this.a($$2, $$3, cxw.i);
         return new gpp($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gpo a(JsonDeserializationContext $$0, JsonObject $$1, cxw $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gpo)$$0.deserialize($$1.get($$3), gpo.class) : gpo.a;
      }
   }
}
