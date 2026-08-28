import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class gfg {
   public static final gfg a = new gfg();
   public final gff b;
   public final gff c;
   public final gff d;
   public final gff e;
   public final gff f;
   public final gff g;
   public final gff h;
   public final gff i;

   private gfg() {
      this(gff.a, gff.a, gff.a, gff.a, gff.a, gff.a, gff.a, gff.a);
   }

   public gfg(gfg $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public gfg(gff $$0, gff $$1, gff $$2, gff $$3, gff $$4, gff $$5, gff $$6, gff $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public gff a(ctx $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gff.a;
      };
   }

   public boolean b(ctx $$0) {
      return this.a($$0) != gff.a;
   }

   protected static class a implements JsonDeserializer<gfg> {
      public gfg a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gff $$4 = this.a($$2, $$3, ctx.c);
         gff $$5 = this.a($$2, $$3, ctx.b);
         if ($$5 == gff.a) {
            $$5 = $$4;
         }

         gff $$6 = this.a($$2, $$3, ctx.e);
         gff $$7 = this.a($$2, $$3, ctx.d);
         if ($$7 == gff.a) {
            $$7 = $$6;
         }

         gff $$8 = this.a($$2, $$3, ctx.f);
         gff $$9 = this.a($$2, $$3, ctx.g);
         gff $$10 = this.a($$2, $$3, ctx.h);
         gff $$11 = this.a($$2, $$3, ctx.i);
         return new gfg($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gff a(JsonDeserializationContext $$0, JsonObject $$1, ctx $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gff)$$0.deserialize($$1.get($$3), gff.class) : gff.a;
      }
   }
}
