import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public record gno(gnn b, gnn c, gnn d, gnn e, gnn f, gnn g, gnn h, gnn i) {
   public static final gno a = new gno(gnn.a, gnn.a, gnn.a, gnn.a, gnn.a, gnn.a, gnn.a, gnn.a);

   public gnn a(cwn $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gnn.a;
      };
   }

   public gnn a() {
      return this.b;
   }

   public gnn b() {
      return this.c;
   }

   public gnn c() {
      return this.d;
   }

   public gnn d() {
      return this.e;
   }

   public gnn e() {
      return this.f;
   }

   public gnn f() {
      return this.g;
   }

   public gnn g() {
      return this.h;
   }

   public gnn h() {
      return this.i;
   }

   protected static class a implements JsonDeserializer<gno> {
      public gno a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gnn $$4 = this.a($$2, $$3, cwn.c);
         gnn $$5 = this.a($$2, $$3, cwn.b);
         if ($$5 == gnn.a) {
            $$5 = $$4;
         }

         gnn $$6 = this.a($$2, $$3, cwn.e);
         gnn $$7 = this.a($$2, $$3, cwn.d);
         if ($$7 == gnn.a) {
            $$7 = $$6;
         }

         gnn $$8 = this.a($$2, $$3, cwn.f);
         gnn $$9 = this.a($$2, $$3, cwn.g);
         gnn $$10 = this.a($$2, $$3, cwn.h);
         gnn $$11 = this.a($$2, $$3, cwn.i);
         return new gno($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gnn a(JsonDeserializationContext $$0, JsonObject $$1, cwn $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gnn)$$0.deserialize($$1.get($$3), gnn.class) : gnn.a;
      }
   }
}
