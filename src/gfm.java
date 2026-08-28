import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class gfm {
   public static final gfm a = new gfm();
   public final gfl b;
   public final gfl c;
   public final gfl d;
   public final gfl e;
   public final gfl f;
   public final gfl g;
   public final gfl h;
   public final gfl i;

   private gfm() {
      this(gfl.a, gfl.a, gfl.a, gfl.a, gfl.a, gfl.a, gfl.a, gfl.a);
   }

   public gfm(gfm $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public gfm(gfl $$0, gfl $$1, gfl $$2, gfl $$3, gfl $$4, gfl $$5, gfl $$6, gfl $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public gfl a(ctz $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gfl.a;
      };
   }

   public boolean b(ctz $$0) {
      return this.a($$0) != gfl.a;
   }

   protected static class a implements JsonDeserializer<gfm> {
      public gfm a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gfl $$4 = this.a($$2, $$3, ctz.c);
         gfl $$5 = this.a($$2, $$3, ctz.b);
         if ($$5 == gfl.a) {
            $$5 = $$4;
         }

         gfl $$6 = this.a($$2, $$3, ctz.e);
         gfl $$7 = this.a($$2, $$3, ctz.d);
         if ($$7 == gfl.a) {
            $$7 = $$6;
         }

         gfl $$8 = this.a($$2, $$3, ctz.f);
         gfl $$9 = this.a($$2, $$3, ctz.g);
         gfl $$10 = this.a($$2, $$3, ctz.h);
         gfl $$11 = this.a($$2, $$3, ctz.i);
         return new gfm($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gfl a(JsonDeserializationContext $$0, JsonObject $$1, ctz $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gfl)$$0.deserialize($$1.get($$3), gfl.class) : gfl.a;
      }
   }
}
