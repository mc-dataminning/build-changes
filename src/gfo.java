import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class gfo {
   public static final gfo a = new gfo();
   public final gfn b;
   public final gfn c;
   public final gfn d;
   public final gfn e;
   public final gfn f;
   public final gfn g;
   public final gfn h;
   public final gfn i;

   private gfo() {
      this(gfn.a, gfn.a, gfn.a, gfn.a, gfn.a, gfn.a, gfn.a, gfn.a);
   }

   public gfo(gfo $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public gfo(gfn $$0, gfn $$1, gfn $$2, gfn $$3, gfn $$4, gfn $$5, gfn $$6, gfn $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public gfn a(cua $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gfn.a;
      };
   }

   public boolean b(cua $$0) {
      return this.a($$0) != gfn.a;
   }

   protected static class a implements JsonDeserializer<gfo> {
      public gfo a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gfn $$4 = this.a($$2, $$3, cua.c);
         gfn $$5 = this.a($$2, $$3, cua.b);
         if ($$5 == gfn.a) {
            $$5 = $$4;
         }

         gfn $$6 = this.a($$2, $$3, cua.e);
         gfn $$7 = this.a($$2, $$3, cua.d);
         if ($$7 == gfn.a) {
            $$7 = $$6;
         }

         gfn $$8 = this.a($$2, $$3, cua.f);
         gfn $$9 = this.a($$2, $$3, cua.g);
         gfn $$10 = this.a($$2, $$3, cua.h);
         gfn $$11 = this.a($$2, $$3, cua.i);
         return new gfo($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gfn a(JsonDeserializationContext $$0, JsonObject $$1, cua $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gfn)$$0.deserialize($$1.get($$3), gfn.class) : gfn.a;
      }
   }
}
