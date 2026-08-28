import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class gew {
   public static final gew a = new gew();
   public final gev b;
   public final gev c;
   public final gev d;
   public final gev e;
   public final gev f;
   public final gev g;
   public final gev h;
   public final gev i;

   private gew() {
      this(gev.a, gev.a, gev.a, gev.a, gev.a, gev.a, gev.a, gev.a);
   }

   public gew(gew $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public gew(gev $$0, gev $$1, gev $$2, gev $$3, gev $$4, gev $$5, gev $$6, gev $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public gev a(cul $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gev.a;
      };
   }

   public boolean b(cul $$0) {
      return this.a($$0) != gev.a;
   }

   protected static class a implements JsonDeserializer<gew> {
      public gew a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gev $$4 = this.a($$2, $$3, cul.c);
         gev $$5 = this.a($$2, $$3, cul.b);
         if ($$5 == gev.a) {
            $$5 = $$4;
         }

         gev $$6 = this.a($$2, $$3, cul.e);
         gev $$7 = this.a($$2, $$3, cul.d);
         if ($$7 == gev.a) {
            $$7 = $$6;
         }

         gev $$8 = this.a($$2, $$3, cul.f);
         gev $$9 = this.a($$2, $$3, cul.g);
         gev $$10 = this.a($$2, $$3, cul.h);
         gev $$11 = this.a($$2, $$3, cul.i);
         return new gew($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gev a(JsonDeserializationContext $$0, JsonObject $$1, cul $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gev)$$0.deserialize($$1.get($$3), gev.class) : gev.a;
      }
   }
}
