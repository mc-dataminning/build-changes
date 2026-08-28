import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class gjd {
   public static final gjd a = new gjd();
   public final gjc b;
   public final gjc c;
   public final gjc d;
   public final gjc e;
   public final gjc f;
   public final gjc g;
   public final gjc h;
   public final gjc i;

   private gjd() {
      this(gjc.a, gjc.a, gjc.a, gjc.a, gjc.a, gjc.a, gjc.a, gjc.a);
   }

   public gjd(gjd $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public gjd(gjc $$0, gjc $$1, gjc $$2, gjc $$3, gjc $$4, gjc $$5, gjc $$6, gjc $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public gjc a(cvp $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gjc.a;
      };
   }

   public boolean b(cvp $$0) {
      return this.a($$0) != gjc.a;
   }

   protected static class a implements JsonDeserializer<gjd> {
      public gjd a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gjc $$4 = this.a($$2, $$3, cvp.c);
         gjc $$5 = this.a($$2, $$3, cvp.b);
         if ($$5 == gjc.a) {
            $$5 = $$4;
         }

         gjc $$6 = this.a($$2, $$3, cvp.e);
         gjc $$7 = this.a($$2, $$3, cvp.d);
         if ($$7 == gjc.a) {
            $$7 = $$6;
         }

         gjc $$8 = this.a($$2, $$3, cvp.f);
         gjc $$9 = this.a($$2, $$3, cvp.g);
         gjc $$10 = this.a($$2, $$3, cvp.h);
         gjc $$11 = this.a($$2, $$3, cvp.i);
         return new gjd($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gjc a(JsonDeserializationContext $$0, JsonObject $$1, cvp $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gjc)$$0.deserialize($$1.get($$3), gjc.class) : gjc.a;
      }
   }
}
