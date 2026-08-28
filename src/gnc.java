import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class gnc {
   public static final gnc a = new gnc();
   public final gnb b;
   public final gnb c;
   public final gnb d;
   public final gnb e;
   public final gnb f;
   public final gnb g;
   public final gnb h;
   public final gnb i;

   private gnc() {
      this(gnb.a, gnb.a, gnb.a, gnb.a, gnb.a, gnb.a, gnb.a, gnb.a);
   }

   public gnc(gnc $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public gnc(gnb $$0, gnb $$1, gnb $$2, gnb $$3, gnb $$4, gnb $$5, gnb $$6, gnb $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public gnb a(cxm $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gnb.a;
      };
   }

   public boolean b(cxm $$0) {
      return this.a($$0) != gnb.a;
   }

   protected static class a implements JsonDeserializer<gnc> {
      public gnc a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gnb $$4 = this.a($$2, $$3, cxm.c);
         gnb $$5 = this.a($$2, $$3, cxm.b);
         if ($$5 == gnb.a) {
            $$5 = $$4;
         }

         gnb $$6 = this.a($$2, $$3, cxm.e);
         gnb $$7 = this.a($$2, $$3, cxm.d);
         if ($$7 == gnb.a) {
            $$7 = $$6;
         }

         gnb $$8 = this.a($$2, $$3, cxm.f);
         gnb $$9 = this.a($$2, $$3, cxm.g);
         gnb $$10 = this.a($$2, $$3, cxm.h);
         gnb $$11 = this.a($$2, $$3, cxm.i);
         return new gnc($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gnb a(JsonDeserializationContext $$0, JsonObject $$1, cxm $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gnb)$$0.deserialize($$1.get($$3), gnb.class) : gnb.a;
      }
   }
}
