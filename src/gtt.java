import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public record gtt(gts b, gts c, gts d, gts e, gts f, gts g, gts h, gts i) {
   public static final gtt a = new gtt(gts.a, gts.a, gts.a, gts.a, gts.a, gts.a, gts.a, gts.a);

   public gts a(czy $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gts.a;
      };
   }

   public gts a() {
      return this.b;
   }

   public gts b() {
      return this.c;
   }

   public gts c() {
      return this.d;
   }

   public gts d() {
      return this.e;
   }

   public gts e() {
      return this.f;
   }

   public gts f() {
      return this.g;
   }

   public gts g() {
      return this.h;
   }

   public gts h() {
      return this.i;
   }

   protected static class a implements JsonDeserializer<gtt> {
      public gtt a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gts $$4 = this.a($$2, $$3, czy.c);
         gts $$5 = this.a($$2, $$3, czy.b);
         if ($$5 == gts.a) {
            $$5 = $$4;
         }

         gts $$6 = this.a($$2, $$3, czy.e);
         gts $$7 = this.a($$2, $$3, czy.d);
         if ($$7 == gts.a) {
            $$7 = $$6;
         }

         gts $$8 = this.a($$2, $$3, czy.f);
         gts $$9 = this.a($$2, $$3, czy.g);
         gts $$10 = this.a($$2, $$3, czy.h);
         gts $$11 = this.a($$2, $$3, czy.i);
         return new gtt($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gts a(JsonDeserializationContext $$0, JsonObject $$1, czy $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gts)$$0.deserialize($$1.get($$3), gts.class) : gts.a;
      }
   }
}
