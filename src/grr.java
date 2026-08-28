import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public record grr(grq b, grq c, grq d, grq e, grq f, grq g, grq h, grq i) {
   public static final grr a = new grr(grq.a, grq.a, grq.a, grq.a, grq.a, grq.a, grq.a, grq.a);

   public grq a(czb $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> grq.a;
      };
   }

   public grq a() {
      return this.b;
   }

   public grq b() {
      return this.c;
   }

   public grq c() {
      return this.d;
   }

   public grq d() {
      return this.e;
   }

   public grq e() {
      return this.f;
   }

   public grq f() {
      return this.g;
   }

   public grq g() {
      return this.h;
   }

   public grq h() {
      return this.i;
   }

   protected static class a implements JsonDeserializer<grr> {
      public grr a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         grq $$4 = this.a($$2, $$3, czb.c);
         grq $$5 = this.a($$2, $$3, czb.b);
         if ($$5 == grq.a) {
            $$5 = $$4;
         }

         grq $$6 = this.a($$2, $$3, czb.e);
         grq $$7 = this.a($$2, $$3, czb.d);
         if ($$7 == grq.a) {
            $$7 = $$6;
         }

         grq $$8 = this.a($$2, $$3, czb.f);
         grq $$9 = this.a($$2, $$3, czb.g);
         grq $$10 = this.a($$2, $$3, czb.h);
         grq $$11 = this.a($$2, $$3, czb.i);
         return new grr($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private grq a(JsonDeserializationContext $$0, JsonObject $$1, czb $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (grq)$$0.deserialize($$1.get($$3), grq.class) : grq.a;
      }
   }
}
