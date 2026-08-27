import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class fuq {
   public static final fuq a = new fuq();
   public final fup b;
   public final fup c;
   public final fup d;
   public final fup e;
   public final fup f;
   public final fup g;
   public final fup h;
   public final fup i;

   private fuq() {
      this(fup.a, fup.a, fup.a, fup.a, fup.a, fup.a, fup.a, fup.a);
   }

   public fuq(fuq $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public fuq(fup $$0, fup $$1, fup $$2, fup $$3, fup $$4, fup $$5, fup $$6, fup $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public fup a(cmv $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> fup.a;
      };
   }

   public boolean b(cmv $$0) {
      return this.a($$0) != fup.a;
   }

   protected static class a implements JsonDeserializer<fuq> {
      public fuq a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         fup $$4 = this.a($$2, $$3, cmv.c);
         fup $$5 = this.a($$2, $$3, cmv.b);
         if ($$5 == fup.a) {
            $$5 = $$4;
         }

         fup $$6 = this.a($$2, $$3, cmv.e);
         fup $$7 = this.a($$2, $$3, cmv.d);
         if ($$7 == fup.a) {
            $$7 = $$6;
         }

         fup $$8 = this.a($$2, $$3, cmv.f);
         fup $$9 = this.a($$2, $$3, cmv.g);
         fup $$10 = this.a($$2, $$3, cmv.h);
         fup $$11 = this.a($$2, $$3, cmv.i);
         return new fuq($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private fup a(JsonDeserializationContext $$0, JsonObject $$1, cmv $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (fup)$$0.deserialize($$1.get($$3), fup.class) : fup.a;
      }
   }
}
