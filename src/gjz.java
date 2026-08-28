import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class gjz {
   public static final gjz a = new gjz();
   public final gjy b;
   public final gjy c;
   public final gjy d;
   public final gjy e;
   public final gjy f;
   public final gjy g;
   public final gjy h;
   public final gjy i;

   private gjz() {
      this(gjy.a, gjy.a, gjy.a, gjy.a, gjy.a, gjy.a, gjy.a, gjy.a);
   }

   public gjz(gjz $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public gjz(gjy $$0, gjy $$1, gjy $$2, gjy $$3, gjy $$4, gjy $$5, gjy $$6, gjy $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public gjy a(cvz $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gjy.a;
      };
   }

   public boolean b(cvz $$0) {
      return this.a($$0) != gjy.a;
   }

   protected static class a implements JsonDeserializer<gjz> {
      public gjz a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gjy $$4 = this.a($$2, $$3, cvz.c);
         gjy $$5 = this.a($$2, $$3, cvz.b);
         if ($$5 == gjy.a) {
            $$5 = $$4;
         }

         gjy $$6 = this.a($$2, $$3, cvz.e);
         gjy $$7 = this.a($$2, $$3, cvz.d);
         if ($$7 == gjy.a) {
            $$7 = $$6;
         }

         gjy $$8 = this.a($$2, $$3, cvz.f);
         gjy $$9 = this.a($$2, $$3, cvz.g);
         gjy $$10 = this.a($$2, $$3, cvz.h);
         gjy $$11 = this.a($$2, $$3, cvz.i);
         return new gjz($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gjy a(JsonDeserializationContext $$0, JsonObject $$1, cvz $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gjy)$$0.deserialize($$1.get($$3), gjy.class) : gjy.a;
      }
   }
}
