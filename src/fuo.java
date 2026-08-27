import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class fuo {
   public static final fuo a = new fuo();
   public final fun b;
   public final fun c;
   public final fun d;
   public final fun e;
   public final fun f;
   public final fun g;
   public final fun h;
   public final fun i;

   private fuo() {
      this(fun.a, fun.a, fun.a, fun.a, fun.a, fun.a, fun.a, fun.a);
   }

   public fuo(fuo $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public fuo(fun $$0, fun $$1, fun $$2, fun $$3, fun $$4, fun $$5, fun $$6, fun $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public fun a(cmu $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> fun.a;
      };
   }

   public boolean b(cmu $$0) {
      return this.a($$0) != fun.a;
   }

   protected static class a implements JsonDeserializer<fuo> {
      public fuo a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         fun $$4 = this.a($$2, $$3, cmu.c);
         fun $$5 = this.a($$2, $$3, cmu.b);
         if ($$5 == fun.a) {
            $$5 = $$4;
         }

         fun $$6 = this.a($$2, $$3, cmu.e);
         fun $$7 = this.a($$2, $$3, cmu.d);
         if ($$7 == fun.a) {
            $$7 = $$6;
         }

         fun $$8 = this.a($$2, $$3, cmu.f);
         fun $$9 = this.a($$2, $$3, cmu.g);
         fun $$10 = this.a($$2, $$3, cmu.h);
         fun $$11 = this.a($$2, $$3, cmu.i);
         return new fuo($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private fun a(JsonDeserializationContext $$0, JsonObject $$1, cmu $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (fun)$$0.deserialize($$1.get($$3), fun.class) : fun.a;
      }
   }
}
