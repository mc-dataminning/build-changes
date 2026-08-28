import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public record gnq(gnp b, gnp c, gnp d, gnp e, gnp f, gnp g, gnp h, gnp i) {
   public static final gnq a = new gnq(gnp.a, gnp.a, gnp.a, gnp.a, gnp.a, gnp.a, gnp.a, gnp.a);

   public gnp a(cwo $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gnp.a;
      };
   }

   public gnp a() {
      return this.b;
   }

   public gnp b() {
      return this.c;
   }

   public gnp c() {
      return this.d;
   }

   public gnp d() {
      return this.e;
   }

   public gnp e() {
      return this.f;
   }

   public gnp f() {
      return this.g;
   }

   public gnp g() {
      return this.h;
   }

   public gnp h() {
      return this.i;
   }

   protected static class a implements JsonDeserializer<gnq> {
      public gnq a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gnp $$4 = this.a($$2, $$3, cwo.c);
         gnp $$5 = this.a($$2, $$3, cwo.b);
         if ($$5 == gnp.a) {
            $$5 = $$4;
         }

         gnp $$6 = this.a($$2, $$3, cwo.e);
         gnp $$7 = this.a($$2, $$3, cwo.d);
         if ($$7 == gnp.a) {
            $$7 = $$6;
         }

         gnp $$8 = this.a($$2, $$3, cwo.f);
         gnp $$9 = this.a($$2, $$3, cwo.g);
         gnp $$10 = this.a($$2, $$3, cwo.h);
         gnp $$11 = this.a($$2, $$3, cwo.i);
         return new gnq($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gnp a(JsonDeserializationContext $$0, JsonObject $$1, cwo $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gnp)$$0.deserialize($$1.get($$3), gnp.class) : gnp.a;
      }
   }
}
