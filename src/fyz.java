import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class fyz {
   public static final fyz a = new fyz();
   public final fyy b;
   public final fyy c;
   public final fyy d;
   public final fyy e;
   public final fyy f;
   public final fyy g;
   public final fyy h;
   public final fyy i;

   private fyz() {
      this(fyy.a, fyy.a, fyy.a, fyy.a, fyy.a, fyy.a, fyy.a, fyy.a);
   }

   public fyz(fyz $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public fyz(fyy $$0, fyy $$1, fyy $$2, fyy $$3, fyy $$4, fyy $$5, fyy $$6, fyy $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public fyy a(cqh $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> fyy.a;
      };
   }

   public boolean b(cqh $$0) {
      return this.a($$0) != fyy.a;
   }

   protected static class a implements JsonDeserializer<fyz> {
      public fyz a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         fyy $$4 = this.a($$2, $$3, cqh.c);
         fyy $$5 = this.a($$2, $$3, cqh.b);
         if ($$5 == fyy.a) {
            $$5 = $$4;
         }

         fyy $$6 = this.a($$2, $$3, cqh.e);
         fyy $$7 = this.a($$2, $$3, cqh.d);
         if ($$7 == fyy.a) {
            $$7 = $$6;
         }

         fyy $$8 = this.a($$2, $$3, cqh.f);
         fyy $$9 = this.a($$2, $$3, cqh.g);
         fyy $$10 = this.a($$2, $$3, cqh.h);
         fyy $$11 = this.a($$2, $$3, cqh.i);
         return new fyz($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private fyy a(JsonDeserializationContext $$0, JsonObject $$1, cqh $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (fyy)$$0.deserialize($$1.get($$3), fyy.class) : fyy.a;
      }
   }
}
