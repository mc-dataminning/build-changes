import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class gmy {
   public static final gmy a = new gmy();
   public final gmx b;
   public final gmx c;
   public final gmx d;
   public final gmx e;
   public final gmx f;
   public final gmx g;
   public final gmx h;
   public final gmx i;

   private gmy() {
      this(gmx.a, gmx.a, gmx.a, gmx.a, gmx.a, gmx.a, gmx.a, gmx.a);
   }

   public gmy(gmy $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public gmy(gmx $$0, gmx $$1, gmx $$2, gmx $$3, gmx $$4, gmx $$5, gmx $$6, gmx $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public gmx a(cxe $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gmx.a;
      };
   }

   public boolean b(cxe $$0) {
      return this.a($$0) != gmx.a;
   }

   protected static class a implements JsonDeserializer<gmy> {
      public gmy a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gmx $$4 = this.a($$2, $$3, cxe.c);
         gmx $$5 = this.a($$2, $$3, cxe.b);
         if ($$5 == gmx.a) {
            $$5 = $$4;
         }

         gmx $$6 = this.a($$2, $$3, cxe.e);
         gmx $$7 = this.a($$2, $$3, cxe.d);
         if ($$7 == gmx.a) {
            $$7 = $$6;
         }

         gmx $$8 = this.a($$2, $$3, cxe.f);
         gmx $$9 = this.a($$2, $$3, cxe.g);
         gmx $$10 = this.a($$2, $$3, cxe.h);
         gmx $$11 = this.a($$2, $$3, cxe.i);
         return new gmy($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gmx a(JsonDeserializationContext $$0, JsonObject $$1, cxe $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gmx)$$0.deserialize($$1.get($$3), gmx.class) : gmx.a;
      }
   }
}
