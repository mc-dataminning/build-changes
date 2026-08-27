import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class gbr {
   public static final gbr a = new gbr();
   public final gbq b;
   public final gbq c;
   public final gbq d;
   public final gbq e;
   public final gbq f;
   public final gbq g;
   public final gbq h;
   public final gbq i;

   private gbr() {
      this(gbq.a, gbq.a, gbq.a, gbq.a, gbq.a, gbq.a, gbq.a, gbq.a);
   }

   public gbr(gbr $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public gbr(gbq $$0, gbq $$1, gbq $$2, gbq $$3, gbq $$4, gbq $$5, gbq $$6, gbq $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public gbq a(crp $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gbq.a;
      };
   }

   public boolean b(crp $$0) {
      return this.a($$0) != gbq.a;
   }

   protected static class a implements JsonDeserializer<gbr> {
      public gbr a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gbq $$4 = this.a($$2, $$3, crp.c);
         gbq $$5 = this.a($$2, $$3, crp.b);
         if ($$5 == gbq.a) {
            $$5 = $$4;
         }

         gbq $$6 = this.a($$2, $$3, crp.e);
         gbq $$7 = this.a($$2, $$3, crp.d);
         if ($$7 == gbq.a) {
            $$7 = $$6;
         }

         gbq $$8 = this.a($$2, $$3, crp.f);
         gbq $$9 = this.a($$2, $$3, crp.g);
         gbq $$10 = this.a($$2, $$3, crp.h);
         gbq $$11 = this.a($$2, $$3, crp.i);
         return new gbr($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gbq a(JsonDeserializationContext $$0, JsonObject $$1, crp $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gbq)$$0.deserialize($$1.get($$3), gbq.class) : gbq.a;
      }
   }
}
