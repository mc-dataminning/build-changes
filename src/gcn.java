import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class gcn {
   public static final gcn a = new gcn();
   public final gcm b;
   public final gcm c;
   public final gcm d;
   public final gcm e;
   public final gcm f;
   public final gcm g;
   public final gcm h;
   public final gcm i;

   private gcn() {
      this(gcm.a, gcm.a, gcm.a, gcm.a, gcm.a, gcm.a, gcm.a, gcm.a);
   }

   public gcn(gcn $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public gcn(gcm $$0, gcm $$1, gcm $$2, gcm $$3, gcm $$4, gcm $$5, gcm $$6, gcm $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public gcm a(csa $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gcm.a;
      };
   }

   public boolean b(csa $$0) {
      return this.a($$0) != gcm.a;
   }

   protected static class a implements JsonDeserializer<gcn> {
      public gcn a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gcm $$4 = this.a($$2, $$3, csa.c);
         gcm $$5 = this.a($$2, $$3, csa.b);
         if ($$5 == gcm.a) {
            $$5 = $$4;
         }

         gcm $$6 = this.a($$2, $$3, csa.e);
         gcm $$7 = this.a($$2, $$3, csa.d);
         if ($$7 == gcm.a) {
            $$7 = $$6;
         }

         gcm $$8 = this.a($$2, $$3, csa.f);
         gcm $$9 = this.a($$2, $$3, csa.g);
         gcm $$10 = this.a($$2, $$3, csa.h);
         gcm $$11 = this.a($$2, $$3, csa.i);
         return new gcn($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gcm a(JsonDeserializationContext $$0, JsonObject $$1, csa $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gcm)$$0.deserialize($$1.get($$3), gcm.class) : gcm.a;
      }
   }
}
