import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class gdt {
   public static final gdt a = new gdt();
   public final gds b;
   public final gds c;
   public final gds d;
   public final gds e;
   public final gds f;
   public final gds g;
   public final gds h;
   public final gds i;

   private gdt() {
      this(gds.a, gds.a, gds.a, gds.a, gds.a, gds.a, gds.a, gds.a);
   }

   public gdt(gdt $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public gdt(gds $$0, gds $$1, gds $$2, gds $$3, gds $$4, gds $$5, gds $$6, gds $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public gds a(ctn $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gds.a;
      };
   }

   public boolean b(ctn $$0) {
      return this.a($$0) != gds.a;
   }

   protected static class a implements JsonDeserializer<gdt> {
      public gdt a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gds $$4 = this.a($$2, $$3, ctn.c);
         gds $$5 = this.a($$2, $$3, ctn.b);
         if ($$5 == gds.a) {
            $$5 = $$4;
         }

         gds $$6 = this.a($$2, $$3, ctn.e);
         gds $$7 = this.a($$2, $$3, ctn.d);
         if ($$7 == gds.a) {
            $$7 = $$6;
         }

         gds $$8 = this.a($$2, $$3, ctn.f);
         gds $$9 = this.a($$2, $$3, ctn.g);
         gds $$10 = this.a($$2, $$3, ctn.h);
         gds $$11 = this.a($$2, $$3, ctn.i);
         return new gdt($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gds a(JsonDeserializationContext $$0, JsonObject $$1, ctn $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gds)$$0.deserialize($$1.get($$3), gds.class) : gds.a;
      }
   }
}
