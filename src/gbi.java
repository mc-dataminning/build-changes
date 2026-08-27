import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class gbi {
   public static final gbi a = new gbi();
   public final gbh b;
   public final gbh c;
   public final gbh d;
   public final gbh e;
   public final gbh f;
   public final gbh g;
   public final gbh h;
   public final gbh i;

   private gbi() {
      this(gbh.a, gbh.a, gbh.a, gbh.a, gbh.a, gbh.a, gbh.a, gbh.a);
   }

   public gbi(gbi $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public gbi(gbh $$0, gbh $$1, gbh $$2, gbh $$3, gbh $$4, gbh $$5, gbh $$6, gbh $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public gbh a(crg $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gbh.a;
      };
   }

   public boolean b(crg $$0) {
      return this.a($$0) != gbh.a;
   }

   protected static class a implements JsonDeserializer<gbi> {
      public gbi a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gbh $$4 = this.a($$2, $$3, crg.c);
         gbh $$5 = this.a($$2, $$3, crg.b);
         if ($$5 == gbh.a) {
            $$5 = $$4;
         }

         gbh $$6 = this.a($$2, $$3, crg.e);
         gbh $$7 = this.a($$2, $$3, crg.d);
         if ($$7 == gbh.a) {
            $$7 = $$6;
         }

         gbh $$8 = this.a($$2, $$3, crg.f);
         gbh $$9 = this.a($$2, $$3, crg.g);
         gbh $$10 = this.a($$2, $$3, crg.h);
         gbh $$11 = this.a($$2, $$3, crg.i);
         return new gbi($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gbh a(JsonDeserializationContext $$0, JsonObject $$1, crg $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gbh)$$0.deserialize($$1.get($$3), gbh.class) : gbh.a;
      }
   }
}
