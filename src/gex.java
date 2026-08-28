import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class gex {
   public static final gex a = new gex();
   public final gew b;
   public final gew c;
   public final gew d;
   public final gew e;
   public final gew f;
   public final gew g;
   public final gew h;
   public final gew i;

   private gex() {
      this(gew.a, gew.a, gew.a, gew.a, gew.a, gew.a, gew.a, gew.a);
   }

   public gex(gex $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public gex(gew $$0, gew $$1, gew $$2, gew $$3, gew $$4, gew $$5, gew $$6, gew $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public gew a(cum $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gew.a;
      };
   }

   public boolean b(cum $$0) {
      return this.a($$0) != gew.a;
   }

   protected static class a implements JsonDeserializer<gex> {
      public gex a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gew $$4 = this.a($$2, $$3, cum.c);
         gew $$5 = this.a($$2, $$3, cum.b);
         if ($$5 == gew.a) {
            $$5 = $$4;
         }

         gew $$6 = this.a($$2, $$3, cum.e);
         gew $$7 = this.a($$2, $$3, cum.d);
         if ($$7 == gew.a) {
            $$7 = $$6;
         }

         gew $$8 = this.a($$2, $$3, cum.f);
         gew $$9 = this.a($$2, $$3, cum.g);
         gew $$10 = this.a($$2, $$3, cum.h);
         gew $$11 = this.a($$2, $$3, cum.i);
         return new gex($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gew a(JsonDeserializationContext $$0, JsonObject $$1, cum $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gew)$$0.deserialize($$1.get($$3), gew.class) : gew.a;
      }
   }
}
