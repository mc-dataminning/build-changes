import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class giy {
   public static final giy a = new giy();
   public final gix b;
   public final gix c;
   public final gix d;
   public final gix e;
   public final gix f;
   public final gix g;
   public final gix h;
   public final gix i;

   private giy() {
      this(gix.a, gix.a, gix.a, gix.a, gix.a, gix.a, gix.a, gix.a);
   }

   public giy(giy $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public giy(gix $$0, gix $$1, gix $$2, gix $$3, gix $$4, gix $$5, gix $$6, gix $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public gix a(cvm $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gix.a;
      };
   }

   public boolean b(cvm $$0) {
      return this.a($$0) != gix.a;
   }

   protected static class a implements JsonDeserializer<giy> {
      public giy a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gix $$4 = this.a($$2, $$3, cvm.c);
         gix $$5 = this.a($$2, $$3, cvm.b);
         if ($$5 == gix.a) {
            $$5 = $$4;
         }

         gix $$6 = this.a($$2, $$3, cvm.e);
         gix $$7 = this.a($$2, $$3, cvm.d);
         if ($$7 == gix.a) {
            $$7 = $$6;
         }

         gix $$8 = this.a($$2, $$3, cvm.f);
         gix $$9 = this.a($$2, $$3, cvm.g);
         gix $$10 = this.a($$2, $$3, cvm.h);
         gix $$11 = this.a($$2, $$3, cvm.i);
         return new giy($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gix a(JsonDeserializationContext $$0, JsonObject $$1, cvm $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gix)$$0.deserialize($$1.get($$3), gix.class) : gix.a;
      }
   }
}
