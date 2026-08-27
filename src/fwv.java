import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class fwv {
   public static final fwv a = new fwv();
   public final fwu b;
   public final fwu c;
   public final fwu d;
   public final fwu e;
   public final fwu f;
   public final fwu g;
   public final fwu h;
   public final fwu i;

   private fwv() {
      this(fwu.a, fwu.a, fwu.a, fwu.a, fwu.a, fwu.a, fwu.a, fwu.a);
   }

   public fwv(fwv $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public fwv(fwu $$0, fwu $$1, fwu $$2, fwu $$3, fwu $$4, fwu $$5, fwu $$6, fwu $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public fwu a(cow $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> fwu.a;
      };
   }

   public boolean b(cow $$0) {
      return this.a($$0) != fwu.a;
   }

   protected static class a implements JsonDeserializer<fwv> {
      public fwv a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         fwu $$4 = this.a($$2, $$3, cow.c);
         fwu $$5 = this.a($$2, $$3, cow.b);
         if ($$5 == fwu.a) {
            $$5 = $$4;
         }

         fwu $$6 = this.a($$2, $$3, cow.e);
         fwu $$7 = this.a($$2, $$3, cow.d);
         if ($$7 == fwu.a) {
            $$7 = $$6;
         }

         fwu $$8 = this.a($$2, $$3, cow.f);
         fwu $$9 = this.a($$2, $$3, cow.g);
         fwu $$10 = this.a($$2, $$3, cow.h);
         fwu $$11 = this.a($$2, $$3, cow.i);
         return new fwv($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private fwu a(JsonDeserializationContext $$0, JsonObject $$1, cow $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (fwu)$$0.deserialize($$1.get($$3), fwu.class) : fwu.a;
      }
   }
}
