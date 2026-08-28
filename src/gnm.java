import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public record gnm(gnl b, gnl c, gnl d, gnl e, gnl f, gnl g, gnl h, gnl i) {
   public static final gnm a = new gnm(gnl.a, gnl.a, gnl.a, gnl.a, gnl.a, gnl.a, gnl.a, gnl.a);

   public gnl a(cwl $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gnl.a;
      };
   }

   public gnl a() {
      return this.b;
   }

   public gnl b() {
      return this.c;
   }

   public gnl c() {
      return this.d;
   }

   public gnl d() {
      return this.e;
   }

   public gnl e() {
      return this.f;
   }

   public gnl f() {
      return this.g;
   }

   public gnl g() {
      return this.h;
   }

   public gnl h() {
      return this.i;
   }

   protected static class a implements JsonDeserializer<gnm> {
      public gnm a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gnl $$4 = this.a($$2, $$3, cwl.c);
         gnl $$5 = this.a($$2, $$3, cwl.b);
         if ($$5 == gnl.a) {
            $$5 = $$4;
         }

         gnl $$6 = this.a($$2, $$3, cwl.e);
         gnl $$7 = this.a($$2, $$3, cwl.d);
         if ($$7 == gnl.a) {
            $$7 = $$6;
         }

         gnl $$8 = this.a($$2, $$3, cwl.f);
         gnl $$9 = this.a($$2, $$3, cwl.g);
         gnl $$10 = this.a($$2, $$3, cwl.h);
         gnl $$11 = this.a($$2, $$3, cwl.i);
         return new gnm($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gnl a(JsonDeserializationContext $$0, JsonObject $$1, cwl $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gnl)$$0.deserialize($$1.get($$3), gnl.class) : gnl.a;
      }
   }
}
