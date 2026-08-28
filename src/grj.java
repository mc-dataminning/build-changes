import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public record grj(gri b, gri c, gri d, gri e, gri f, gri g, gri h, gri i) {
   public static final grj a = new grj(gri.a, gri.a, gri.a, gri.a, gri.a, gri.a, gri.a, gri.a);

   public gri a(cyw $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gri.a;
      };
   }

   public gri a() {
      return this.b;
   }

   public gri b() {
      return this.c;
   }

   public gri c() {
      return this.d;
   }

   public gri d() {
      return this.e;
   }

   public gri e() {
      return this.f;
   }

   public gri f() {
      return this.g;
   }

   public gri g() {
      return this.h;
   }

   public gri h() {
      return this.i;
   }

   protected static class a implements JsonDeserializer<grj> {
      public grj a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gri $$4 = this.a($$2, $$3, cyw.c);
         gri $$5 = this.a($$2, $$3, cyw.b);
         if ($$5 == gri.a) {
            $$5 = $$4;
         }

         gri $$6 = this.a($$2, $$3, cyw.e);
         gri $$7 = this.a($$2, $$3, cyw.d);
         if ($$7 == gri.a) {
            $$7 = $$6;
         }

         gri $$8 = this.a($$2, $$3, cyw.f);
         gri $$9 = this.a($$2, $$3, cyw.g);
         gri $$10 = this.a($$2, $$3, cyw.h);
         gri $$11 = this.a($$2, $$3, cyw.i);
         return new grj($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gri a(JsonDeserializationContext $$0, JsonObject $$1, cyw $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gri)$$0.deserialize($$1.get($$3), gri.class) : gri.a;
      }
   }
}
