import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class fwu {
   public static final fwu a = new fwu();
   public final fwt b;
   public final fwt c;
   public final fwt d;
   public final fwt e;
   public final fwt f;
   public final fwt g;
   public final fwt h;
   public final fwt i;

   private fwu() {
      this(fwt.a, fwt.a, fwt.a, fwt.a, fwt.a, fwt.a, fwt.a, fwt.a);
   }

   public fwu(fwu $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public fwu(fwt $$0, fwt $$1, fwt $$2, fwt $$3, fwt $$4, fwt $$5, fwt $$6, fwt $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public fwt a(cow $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> fwt.a;
      };
   }

   public boolean b(cow $$0) {
      return this.a($$0) != fwt.a;
   }

   protected static class a implements JsonDeserializer<fwu> {
      public fwu a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         fwt $$4 = this.a($$2, $$3, cow.c);
         fwt $$5 = this.a($$2, $$3, cow.b);
         if ($$5 == fwt.a) {
            $$5 = $$4;
         }

         fwt $$6 = this.a($$2, $$3, cow.e);
         fwt $$7 = this.a($$2, $$3, cow.d);
         if ($$7 == fwt.a) {
            $$7 = $$6;
         }

         fwt $$8 = this.a($$2, $$3, cow.f);
         fwt $$9 = this.a($$2, $$3, cow.g);
         fwt $$10 = this.a($$2, $$3, cow.h);
         fwt $$11 = this.a($$2, $$3, cow.i);
         return new fwu($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private fwt a(JsonDeserializationContext $$0, JsonObject $$1, cow $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (fwt)$$0.deserialize($$1.get($$3), fwt.class) : fwt.a;
      }
   }
}
