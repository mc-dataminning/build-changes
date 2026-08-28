import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class gez {
   public static final gez a = new gez();
   public final gey b;
   public final gey c;
   public final gey d;
   public final gey e;
   public final gey f;
   public final gey g;
   public final gey h;
   public final gey i;

   private gez() {
      this(gey.a, gey.a, gey.a, gey.a, gey.a, gey.a, gey.a, gey.a);
   }

   public gez(gez $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public gez(gey $$0, gey $$1, gey $$2, gey $$3, gey $$4, gey $$5, gey $$6, gey $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public gey a(cuo $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gey.a;
      };
   }

   public boolean b(cuo $$0) {
      return this.a($$0) != gey.a;
   }

   protected static class a implements JsonDeserializer<gez> {
      public gez a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gey $$4 = this.a($$2, $$3, cuo.c);
         gey $$5 = this.a($$2, $$3, cuo.b);
         if ($$5 == gey.a) {
            $$5 = $$4;
         }

         gey $$6 = this.a($$2, $$3, cuo.e);
         gey $$7 = this.a($$2, $$3, cuo.d);
         if ($$7 == gey.a) {
            $$7 = $$6;
         }

         gey $$8 = this.a($$2, $$3, cuo.f);
         gey $$9 = this.a($$2, $$3, cuo.g);
         gey $$10 = this.a($$2, $$3, cuo.h);
         gey $$11 = this.a($$2, $$3, cuo.i);
         return new gez($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gey a(JsonDeserializationContext $$0, JsonObject $$1, cuo $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gey)$$0.deserialize($$1.get($$3), gey.class) : gey.a;
      }
   }
}
