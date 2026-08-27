import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class fvc {
   public static final fvc a = new fvc();
   public final fvb b;
   public final fvb c;
   public final fvb d;
   public final fvb e;
   public final fvb f;
   public final fvb g;
   public final fvb h;
   public final fvb i;

   private fvc() {
      this(fvb.a, fvb.a, fvb.a, fvb.a, fvb.a, fvb.a, fvb.a, fvb.a);
   }

   public fvc(fvc $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public fvc(fvb $$0, fvb $$1, fvb $$2, fvb $$3, fvb $$4, fvb $$5, fvb $$6, fvb $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public fvb a(cnd $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> fvb.a;
      };
   }

   public boolean b(cnd $$0) {
      return this.a($$0) != fvb.a;
   }

   protected static class a implements JsonDeserializer<fvc> {
      public fvc a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         fvb $$4 = this.a($$2, $$3, cnd.c);
         fvb $$5 = this.a($$2, $$3, cnd.b);
         if ($$5 == fvb.a) {
            $$5 = $$4;
         }

         fvb $$6 = this.a($$2, $$3, cnd.e);
         fvb $$7 = this.a($$2, $$3, cnd.d);
         if ($$7 == fvb.a) {
            $$7 = $$6;
         }

         fvb $$8 = this.a($$2, $$3, cnd.f);
         fvb $$9 = this.a($$2, $$3, cnd.g);
         fvb $$10 = this.a($$2, $$3, cnd.h);
         fvb $$11 = this.a($$2, $$3, cnd.i);
         return new fvc($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private fvb a(JsonDeserializationContext $$0, JsonObject $$1, cnd $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (fvb)$$0.deserialize($$1.get($$3), fvb.class) : fvb.a;
      }
   }
}
