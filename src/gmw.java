import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class gmw {
   public static final gmw a = new gmw();
   public final gmv b;
   public final gmv c;
   public final gmv d;
   public final gmv e;
   public final gmv f;
   public final gmv g;
   public final gmv h;
   public final gmv i;

   private gmw() {
      this(gmv.a, gmv.a, gmv.a, gmv.a, gmv.a, gmv.a, gmv.a, gmv.a);
   }

   public gmw(gmw $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public gmw(gmv $$0, gmv $$1, gmv $$2, gmv $$3, gmv $$4, gmv $$5, gmv $$6, gmv $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public gmv a(cxi $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gmv.a;
      };
   }

   public boolean b(cxi $$0) {
      return this.a($$0) != gmv.a;
   }

   protected static class a implements JsonDeserializer<gmw> {
      public gmw a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gmv $$4 = this.a($$2, $$3, cxi.c);
         gmv $$5 = this.a($$2, $$3, cxi.b);
         if ($$5 == gmv.a) {
            $$5 = $$4;
         }

         gmv $$6 = this.a($$2, $$3, cxi.e);
         gmv $$7 = this.a($$2, $$3, cxi.d);
         if ($$7 == gmv.a) {
            $$7 = $$6;
         }

         gmv $$8 = this.a($$2, $$3, cxi.f);
         gmv $$9 = this.a($$2, $$3, cxi.g);
         gmv $$10 = this.a($$2, $$3, cxi.h);
         gmv $$11 = this.a($$2, $$3, cxi.i);
         return new gmw($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gmv a(JsonDeserializationContext $$0, JsonObject $$1, cxi $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gmv)$$0.deserialize($$1.get($$3), gmv.class) : gmv.a;
      }
   }
}
