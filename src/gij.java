import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class gij {
   public static final gij a = new gij();
   public final gii b;
   public final gii c;
   public final gii d;
   public final gii e;
   public final gii f;
   public final gii g;
   public final gii h;
   public final gii i;

   private gij() {
      this(gii.a, gii.a, gii.a, gii.a, gii.a, gii.a, gii.a, gii.a);
   }

   public gij(gij $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public gij(gii $$0, gii $$1, gii $$2, gii $$3, gii $$4, gii $$5, gii $$6, gii $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public gii a(cvi $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gii.a;
      };
   }

   public boolean b(cvi $$0) {
      return this.a($$0) != gii.a;
   }

   protected static class a implements JsonDeserializer<gij> {
      public gij a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gii $$4 = this.a($$2, $$3, cvi.c);
         gii $$5 = this.a($$2, $$3, cvi.b);
         if ($$5 == gii.a) {
            $$5 = $$4;
         }

         gii $$6 = this.a($$2, $$3, cvi.e);
         gii $$7 = this.a($$2, $$3, cvi.d);
         if ($$7 == gii.a) {
            $$7 = $$6;
         }

         gii $$8 = this.a($$2, $$3, cvi.f);
         gii $$9 = this.a($$2, $$3, cvi.g);
         gii $$10 = this.a($$2, $$3, cvi.h);
         gii $$11 = this.a($$2, $$3, cvi.i);
         return new gij($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gii a(JsonDeserializationContext $$0, JsonObject $$1, cvi $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gii)$$0.deserialize($$1.get($$3), gii.class) : gii.a;
      }
   }
}
