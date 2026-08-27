import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class gcx {
   public static final gcx a = new gcx();
   public final gcw b;
   public final gcw c;
   public final gcw d;
   public final gcw e;
   public final gcw f;
   public final gcw g;
   public final gcw h;
   public final gcw i;

   private gcx() {
      this(gcw.a, gcw.a, gcw.a, gcw.a, gcw.a, gcw.a, gcw.a, gcw.a);
   }

   public gcx(gcx $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public gcx(gcw $$0, gcw $$1, gcw $$2, gcw $$3, gcw $$4, gcw $$5, gcw $$6, gcw $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public gcw a(csw $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gcw.a;
      };
   }

   public boolean b(csw $$0) {
      return this.a($$0) != gcw.a;
   }

   protected static class a implements JsonDeserializer<gcx> {
      public gcx a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gcw $$4 = this.a($$2, $$3, csw.c);
         gcw $$5 = this.a($$2, $$3, csw.b);
         if ($$5 == gcw.a) {
            $$5 = $$4;
         }

         gcw $$6 = this.a($$2, $$3, csw.e);
         gcw $$7 = this.a($$2, $$3, csw.d);
         if ($$7 == gcw.a) {
            $$7 = $$6;
         }

         gcw $$8 = this.a($$2, $$3, csw.f);
         gcw $$9 = this.a($$2, $$3, csw.g);
         gcw $$10 = this.a($$2, $$3, csw.h);
         gcw $$11 = this.a($$2, $$3, csw.i);
         return new gcx($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gcw a(JsonDeserializationContext $$0, JsonObject $$1, csw $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gcw)$$0.deserialize($$1.get($$3), gcw.class) : gcw.a;
      }
   }
}
