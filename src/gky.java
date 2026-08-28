import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class gky {
   public static final gky a = new gky();
   public final gkx b;
   public final gkx c;
   public final gkx d;
   public final gkx e;
   public final gkx f;
   public final gkx g;
   public final gkx h;
   public final gkx i;

   private gky() {
      this(gkx.a, gkx.a, gkx.a, gkx.a, gkx.a, gkx.a, gkx.a, gkx.a);
   }

   public gky(gky $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public gky(gkx $$0, gkx $$1, gkx $$2, gkx $$3, gkx $$4, gkx $$5, gkx $$6, gkx $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public gkx a(cwk $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gkx.a;
      };
   }

   public boolean b(cwk $$0) {
      return this.a($$0) != gkx.a;
   }

   protected static class a implements JsonDeserializer<gky> {
      public gky a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gkx $$4 = this.a($$2, $$3, cwk.c);
         gkx $$5 = this.a($$2, $$3, cwk.b);
         if ($$5 == gkx.a) {
            $$5 = $$4;
         }

         gkx $$6 = this.a($$2, $$3, cwk.e);
         gkx $$7 = this.a($$2, $$3, cwk.d);
         if ($$7 == gkx.a) {
            $$7 = $$6;
         }

         gkx $$8 = this.a($$2, $$3, cwk.f);
         gkx $$9 = this.a($$2, $$3, cwk.g);
         gkx $$10 = this.a($$2, $$3, cwk.h);
         gkx $$11 = this.a($$2, $$3, cwk.i);
         return new gky($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gkx a(JsonDeserializationContext $$0, JsonObject $$1, cwk $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gkx)$$0.deserialize($$1.get($$3), gkx.class) : gkx.a;
      }
   }
}
