import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class fxz {
   public static final fxz a = new fxz();
   public final fxy b;
   public final fxy c;
   public final fxy d;
   public final fxy e;
   public final fxy f;
   public final fxy g;
   public final fxy h;
   public final fxy i;

   private fxz() {
      this(fxy.a, fxy.a, fxy.a, fxy.a, fxy.a, fxy.a, fxy.a, fxy.a);
   }

   public fxz(fxz $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public fxz(fxy $$0, fxy $$1, fxy $$2, fxy $$3, fxy $$4, fxy $$5, fxy $$6, fxy $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public fxy a(cpn $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> fxy.a;
      };
   }

   public boolean b(cpn $$0) {
      return this.a($$0) != fxy.a;
   }

   protected static class a implements JsonDeserializer<fxz> {
      public fxz a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         fxy $$4 = this.a($$2, $$3, cpn.c);
         fxy $$5 = this.a($$2, $$3, cpn.b);
         if ($$5 == fxy.a) {
            $$5 = $$4;
         }

         fxy $$6 = this.a($$2, $$3, cpn.e);
         fxy $$7 = this.a($$2, $$3, cpn.d);
         if ($$7 == fxy.a) {
            $$7 = $$6;
         }

         fxy $$8 = this.a($$2, $$3, cpn.f);
         fxy $$9 = this.a($$2, $$3, cpn.g);
         fxy $$10 = this.a($$2, $$3, cpn.h);
         fxy $$11 = this.a($$2, $$3, cpn.i);
         return new fxz($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private fxy a(JsonDeserializationContext $$0, JsonObject $$1, cpn $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (fxy)$$0.deserialize($$1.get($$3), fxy.class) : fxy.a;
      }
   }
}
