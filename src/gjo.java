import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class gjo {
   public static final gjo a = new gjo();
   public final gjn b;
   public final gjn c;
   public final gjn d;
   public final gjn e;
   public final gjn f;
   public final gjn g;
   public final gjn h;
   public final gjn i;

   private gjo() {
      this(gjn.a, gjn.a, gjn.a, gjn.a, gjn.a, gjn.a, gjn.a, gjn.a);
   }

   public gjo(gjo $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public gjo(gjn $$0, gjn $$1, gjn $$2, gjn $$3, gjn $$4, gjn $$5, gjn $$6, gjn $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public gjn a(cvv $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gjn.a;
      };
   }

   public boolean b(cvv $$0) {
      return this.a($$0) != gjn.a;
   }

   protected static class a implements JsonDeserializer<gjo> {
      public gjo a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gjn $$4 = this.a($$2, $$3, cvv.c);
         gjn $$5 = this.a($$2, $$3, cvv.b);
         if ($$5 == gjn.a) {
            $$5 = $$4;
         }

         gjn $$6 = this.a($$2, $$3, cvv.e);
         gjn $$7 = this.a($$2, $$3, cvv.d);
         if ($$7 == gjn.a) {
            $$7 = $$6;
         }

         gjn $$8 = this.a($$2, $$3, cvv.f);
         gjn $$9 = this.a($$2, $$3, cvv.g);
         gjn $$10 = this.a($$2, $$3, cvv.h);
         gjn $$11 = this.a($$2, $$3, cvv.i);
         return new gjo($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gjn a(JsonDeserializationContext $$0, JsonObject $$1, cvv $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gjn)$$0.deserialize($$1.get($$3), gjn.class) : gjn.a;
      }
   }
}
