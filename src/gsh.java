import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public record gsh(gsg b, gsg c, gsg d, gsg e, gsg f, gsg g, gsg h, gsg i) {
   public static final gsh a = new gsh(gsg.a, gsg.a, gsg.a, gsg.a, gsg.a, gsg.a, gsg.a, gsg.a);

   public gsg a(czl $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gsg.a;
      };
   }

   public gsg a() {
      return this.b;
   }

   public gsg b() {
      return this.c;
   }

   public gsg c() {
      return this.d;
   }

   public gsg d() {
      return this.e;
   }

   public gsg e() {
      return this.f;
   }

   public gsg f() {
      return this.g;
   }

   public gsg g() {
      return this.h;
   }

   public gsg h() {
      return this.i;
   }

   protected static class a implements JsonDeserializer<gsh> {
      public gsh a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gsg $$4 = this.a($$2, $$3, czl.c);
         gsg $$5 = this.a($$2, $$3, czl.b);
         if ($$5 == gsg.a) {
            $$5 = $$4;
         }

         gsg $$6 = this.a($$2, $$3, czl.e);
         gsg $$7 = this.a($$2, $$3, czl.d);
         if ($$7 == gsg.a) {
            $$7 = $$6;
         }

         gsg $$8 = this.a($$2, $$3, czl.f);
         gsg $$9 = this.a($$2, $$3, czl.g);
         gsg $$10 = this.a($$2, $$3, czl.h);
         gsg $$11 = this.a($$2, $$3, czl.i);
         return new gsh($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gsg a(JsonDeserializationContext $$0, JsonObject $$1, czl $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gsg)$$0.deserialize($$1.get($$3), gsg.class) : gsg.a;
      }
   }
}
