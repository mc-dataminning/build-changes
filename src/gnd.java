import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class gnd {
   public static final gnd a = new gnd();
   public final gnc b;
   public final gnc c;
   public final gnc d;
   public final gnc e;
   public final gnc f;
   public final gnc g;
   public final gnc h;
   public final gnc i;

   private gnd() {
      this(gnc.a, gnc.a, gnc.a, gnc.a, gnc.a, gnc.a, gnc.a, gnc.a);
   }

   public gnd(gnd $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public gnd(gnc $$0, gnc $$1, gnc $$2, gnc $$3, gnc $$4, gnc $$5, gnc $$6, gnc $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public gnc a(cxn $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gnc.a;
      };
   }

   public boolean b(cxn $$0) {
      return this.a($$0) != gnc.a;
   }

   protected static class a implements JsonDeserializer<gnd> {
      public gnd a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gnc $$4 = this.a($$2, $$3, cxn.c);
         gnc $$5 = this.a($$2, $$3, cxn.b);
         if ($$5 == gnc.a) {
            $$5 = $$4;
         }

         gnc $$6 = this.a($$2, $$3, cxn.e);
         gnc $$7 = this.a($$2, $$3, cxn.d);
         if ($$7 == gnc.a) {
            $$7 = $$6;
         }

         gnc $$8 = this.a($$2, $$3, cxn.f);
         gnc $$9 = this.a($$2, $$3, cxn.g);
         gnc $$10 = this.a($$2, $$3, cxn.h);
         gnc $$11 = this.a($$2, $$3, cxn.i);
         return new gnd($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gnc a(JsonDeserializationContext $$0, JsonObject $$1, cxn $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gnc)$$0.deserialize($$1.get($$3), gnc.class) : gnc.a;
      }
   }
}
