import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class gnb {
   public static final gnb a = new gnb();
   public final gna b;
   public final gna c;
   public final gna d;
   public final gna e;
   public final gna f;
   public final gna g;
   public final gna h;
   public final gna i;

   private gnb() {
      this(gna.a, gna.a, gna.a, gna.a, gna.a, gna.a, gna.a, gna.a);
   }

   public gnb(gnb $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public gnb(gna $$0, gna $$1, gna $$2, gna $$3, gna $$4, gna $$5, gna $$6, gna $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public gna a(cxm $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gna.a;
      };
   }

   public boolean b(cxm $$0) {
      return this.a($$0) != gna.a;
   }

   protected static class a implements JsonDeserializer<gnb> {
      public gnb a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gna $$4 = this.a($$2, $$3, cxm.c);
         gna $$5 = this.a($$2, $$3, cxm.b);
         if ($$5 == gna.a) {
            $$5 = $$4;
         }

         gna $$6 = this.a($$2, $$3, cxm.e);
         gna $$7 = this.a($$2, $$3, cxm.d);
         if ($$7 == gna.a) {
            $$7 = $$6;
         }

         gna $$8 = this.a($$2, $$3, cxm.f);
         gna $$9 = this.a($$2, $$3, cxm.g);
         gna $$10 = this.a($$2, $$3, cxm.h);
         gna $$11 = this.a($$2, $$3, cxm.i);
         return new gnb($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gna a(JsonDeserializationContext $$0, JsonObject $$1, cxm $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gna)$$0.deserialize($$1.get($$3), gna.class) : gna.a;
      }
   }
}
