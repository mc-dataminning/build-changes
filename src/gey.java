import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class gey {
   public static final gey a = new gey();
   public final gex b;
   public final gex c;
   public final gex d;
   public final gex e;
   public final gex f;
   public final gex g;
   public final gex h;
   public final gex i;

   private gey() {
      this(gex.a, gex.a, gex.a, gex.a, gex.a, gex.a, gex.a, gex.a);
   }

   public gey(gey $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public gey(gex $$0, gex $$1, gex $$2, gex $$3, gex $$4, gex $$5, gex $$6, gex $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public gex a(cun $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gex.a;
      };
   }

   public boolean b(cun $$0) {
      return this.a($$0) != gex.a;
   }

   protected static class a implements JsonDeserializer<gey> {
      public gey a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gex $$4 = this.a($$2, $$3, cun.c);
         gex $$5 = this.a($$2, $$3, cun.b);
         if ($$5 == gex.a) {
            $$5 = $$4;
         }

         gex $$6 = this.a($$2, $$3, cun.e);
         gex $$7 = this.a($$2, $$3, cun.d);
         if ($$7 == gex.a) {
            $$7 = $$6;
         }

         gex $$8 = this.a($$2, $$3, cun.f);
         gex $$9 = this.a($$2, $$3, cun.g);
         gex $$10 = this.a($$2, $$3, cun.h);
         gex $$11 = this.a($$2, $$3, cun.i);
         return new gey($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gex a(JsonDeserializationContext $$0, JsonObject $$1, cun $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gex)$$0.deserialize($$1.get($$3), gex.class) : gex.a;
      }
   }
}
