import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class gev {
   public static final gev a = new gev();
   public final geu b;
   public final geu c;
   public final geu d;
   public final geu e;
   public final geu f;
   public final geu g;
   public final geu h;
   public final geu i;

   private gev() {
      this(geu.a, geu.a, geu.a, geu.a, geu.a, geu.a, geu.a, geu.a);
   }

   public gev(gev $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public gev(geu $$0, geu $$1, geu $$2, geu $$3, geu $$4, geu $$5, geu $$6, geu $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public geu a(cuk $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> geu.a;
      };
   }

   public boolean b(cuk $$0) {
      return this.a($$0) != geu.a;
   }

   protected static class a implements JsonDeserializer<gev> {
      public gev a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         geu $$4 = this.a($$2, $$3, cuk.c);
         geu $$5 = this.a($$2, $$3, cuk.b);
         if ($$5 == geu.a) {
            $$5 = $$4;
         }

         geu $$6 = this.a($$2, $$3, cuk.e);
         geu $$7 = this.a($$2, $$3, cuk.d);
         if ($$7 == geu.a) {
            $$7 = $$6;
         }

         geu $$8 = this.a($$2, $$3, cuk.f);
         geu $$9 = this.a($$2, $$3, cuk.g);
         geu $$10 = this.a($$2, $$3, cuk.h);
         geu $$11 = this.a($$2, $$3, cuk.i);
         return new gev($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private geu a(JsonDeserializationContext $$0, JsonObject $$1, cuk $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (geu)$$0.deserialize($$1.get($$3), geu.class) : geu.a;
      }
   }
}
