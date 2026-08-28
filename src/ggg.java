import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class ggg {
   public static final ggg a = new ggg();
   public final ggf b;
   public final ggf c;
   public final ggf d;
   public final ggf e;
   public final ggf f;
   public final ggf g;
   public final ggf h;
   public final ggf i;

   private ggg() {
      this(ggf.a, ggf.a, ggf.a, ggf.a, ggf.a, ggf.a, ggf.a, ggf.a);
   }

   public ggg(ggg $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public ggg(ggf $$0, ggf $$1, ggf $$2, ggf $$3, ggf $$4, ggf $$5, ggf $$6, ggf $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public ggf a(cun $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> ggf.a;
      };
   }

   public boolean b(cun $$0) {
      return this.a($$0) != ggf.a;
   }

   protected static class a implements JsonDeserializer<ggg> {
      public ggg a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         ggf $$4 = this.a($$2, $$3, cun.c);
         ggf $$5 = this.a($$2, $$3, cun.b);
         if ($$5 == ggf.a) {
            $$5 = $$4;
         }

         ggf $$6 = this.a($$2, $$3, cun.e);
         ggf $$7 = this.a($$2, $$3, cun.d);
         if ($$7 == ggf.a) {
            $$7 = $$6;
         }

         ggf $$8 = this.a($$2, $$3, cun.f);
         ggf $$9 = this.a($$2, $$3, cun.g);
         ggf $$10 = this.a($$2, $$3, cun.h);
         ggf $$11 = this.a($$2, $$3, cun.i);
         return new ggg($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private ggf a(JsonDeserializationContext $$0, JsonObject $$1, cun $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (ggf)$$0.deserialize($$1.get($$3), ggf.class) : ggf.a;
      }
   }
}
