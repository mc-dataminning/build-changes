import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class fxc {
   public static final fxc a = new fxc();
   public final fxb b;
   public final fxb c;
   public final fxb d;
   public final fxb e;
   public final fxb f;
   public final fxb g;
   public final fxb h;
   public final fxb i;

   private fxc() {
      this(fxb.a, fxb.a, fxb.a, fxb.a, fxb.a, fxb.a, fxb.a, fxb.a);
   }

   public fxc(fxc $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public fxc(fxb $$0, fxb $$1, fxb $$2, fxb $$3, fxb $$4, fxb $$5, fxb $$6, fxb $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public fxb a(cpa $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> fxb.a;
      };
   }

   public boolean b(cpa $$0) {
      return this.a($$0) != fxb.a;
   }

   protected static class a implements JsonDeserializer<fxc> {
      public fxc a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         fxb $$4 = this.a($$2, $$3, cpa.c);
         fxb $$5 = this.a($$2, $$3, cpa.b);
         if ($$5 == fxb.a) {
            $$5 = $$4;
         }

         fxb $$6 = this.a($$2, $$3, cpa.e);
         fxb $$7 = this.a($$2, $$3, cpa.d);
         if ($$7 == fxb.a) {
            $$7 = $$6;
         }

         fxb $$8 = this.a($$2, $$3, cpa.f);
         fxb $$9 = this.a($$2, $$3, cpa.g);
         fxb $$10 = this.a($$2, $$3, cpa.h);
         fxb $$11 = this.a($$2, $$3, cpa.i);
         return new fxc($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private fxb a(JsonDeserializationContext $$0, JsonObject $$1, cpa $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (fxb)$$0.deserialize($$1.get($$3), fxb.class) : fxb.a;
      }
   }
}
