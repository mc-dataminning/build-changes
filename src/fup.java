import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class fup {
   public static final fup a = new fup();
   public final fuo b;
   public final fuo c;
   public final fuo d;
   public final fuo e;
   public final fuo f;
   public final fuo g;
   public final fuo h;
   public final fuo i;

   private fup() {
      this(fuo.a, fuo.a, fuo.a, fuo.a, fuo.a, fuo.a, fuo.a, fuo.a);
   }

   public fup(fup $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public fup(fuo $$0, fuo $$1, fuo $$2, fuo $$3, fuo $$4, fuo $$5, fuo $$6, fuo $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public fuo a(cmu $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> fuo.a;
      };
   }

   public boolean b(cmu $$0) {
      return this.a($$0) != fuo.a;
   }

   protected static class a implements JsonDeserializer<fup> {
      public fup a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         fuo $$4 = this.a($$2, $$3, cmu.c);
         fuo $$5 = this.a($$2, $$3, cmu.b);
         if ($$5 == fuo.a) {
            $$5 = $$4;
         }

         fuo $$6 = this.a($$2, $$3, cmu.e);
         fuo $$7 = this.a($$2, $$3, cmu.d);
         if ($$7 == fuo.a) {
            $$7 = $$6;
         }

         fuo $$8 = this.a($$2, $$3, cmu.f);
         fuo $$9 = this.a($$2, $$3, cmu.g);
         fuo $$10 = this.a($$2, $$3, cmu.h);
         fuo $$11 = this.a($$2, $$3, cmu.i);
         return new fup($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private fuo a(JsonDeserializationContext $$0, JsonObject $$1, cmu $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (fuo)$$0.deserialize($$1.get($$3), fuo.class) : fuo.a;
      }
   }
}
