import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class gkp {
   public static final gkp a = new gkp();
   public final gko b;
   public final gko c;
   public final gko d;
   public final gko e;
   public final gko f;
   public final gko g;
   public final gko h;
   public final gko i;

   private gkp() {
      this(gko.a, gko.a, gko.a, gko.a, gko.a, gko.a, gko.a, gko.a);
   }

   public gkp(gkp $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public gkp(gko $$0, gko $$1, gko $$2, gko $$3, gko $$4, gko $$5, gko $$6, gko $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public gko a(cwd $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gko.a;
      };
   }

   public boolean b(cwd $$0) {
      return this.a($$0) != gko.a;
   }

   protected static class a implements JsonDeserializer<gkp> {
      public gkp a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gko $$4 = this.a($$2, $$3, cwd.c);
         gko $$5 = this.a($$2, $$3, cwd.b);
         if ($$5 == gko.a) {
            $$5 = $$4;
         }

         gko $$6 = this.a($$2, $$3, cwd.e);
         gko $$7 = this.a($$2, $$3, cwd.d);
         if ($$7 == gko.a) {
            $$7 = $$6;
         }

         gko $$8 = this.a($$2, $$3, cwd.f);
         gko $$9 = this.a($$2, $$3, cwd.g);
         gko $$10 = this.a($$2, $$3, cwd.h);
         gko $$11 = this.a($$2, $$3, cwd.i);
         return new gkp($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gko a(JsonDeserializationContext $$0, JsonObject $$1, cwd $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gko)$$0.deserialize($$1.get($$3), gko.class) : gko.a;
      }
   }
}
