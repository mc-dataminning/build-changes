import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class ggi {
   public static final ggi a = new ggi();
   public final ggh b;
   public final ggh c;
   public final ggh d;
   public final ggh e;
   public final ggh f;
   public final ggh g;
   public final ggh h;
   public final ggh i;

   private ggi() {
      this(ggh.a, ggh.a, ggh.a, ggh.a, ggh.a, ggh.a, ggh.a, ggh.a);
   }

   public ggi(ggi $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public ggi(ggh $$0, ggh $$1, ggh $$2, ggh $$3, ggh $$4, ggh $$5, ggh $$6, ggh $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public ggh a(cun $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> ggh.a;
      };
   }

   public boolean b(cun $$0) {
      return this.a($$0) != ggh.a;
   }

   protected static class a implements JsonDeserializer<ggi> {
      public ggi a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         ggh $$4 = this.a($$2, $$3, cun.c);
         ggh $$5 = this.a($$2, $$3, cun.b);
         if ($$5 == ggh.a) {
            $$5 = $$4;
         }

         ggh $$6 = this.a($$2, $$3, cun.e);
         ggh $$7 = this.a($$2, $$3, cun.d);
         if ($$7 == ggh.a) {
            $$7 = $$6;
         }

         ggh $$8 = this.a($$2, $$3, cun.f);
         ggh $$9 = this.a($$2, $$3, cun.g);
         ggh $$10 = this.a($$2, $$3, cun.h);
         ggh $$11 = this.a($$2, $$3, cun.i);
         return new ggi($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private ggh a(JsonDeserializationContext $$0, JsonObject $$1, cun $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (ggh)$$0.deserialize($$1.get($$3), ggh.class) : ggh.a;
      }
   }
}
