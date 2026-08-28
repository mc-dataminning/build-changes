import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class ggc {
   public static final ggc a = new ggc();
   public final ggb b;
   public final ggb c;
   public final ggb d;
   public final ggb e;
   public final ggb f;
   public final ggb g;
   public final ggb h;
   public final ggb i;

   private ggc() {
      this(ggb.a, ggb.a, ggb.a, ggb.a, ggb.a, ggb.a, ggb.a, ggb.a);
   }

   public ggc(ggc $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public ggc(ggb $$0, ggb $$1, ggb $$2, ggb $$3, ggb $$4, ggb $$5, ggb $$6, ggb $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public ggb a(cul $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> ggb.a;
      };
   }

   public boolean b(cul $$0) {
      return this.a($$0) != ggb.a;
   }

   protected static class a implements JsonDeserializer<ggc> {
      public ggc a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         ggb $$4 = this.a($$2, $$3, cul.c);
         ggb $$5 = this.a($$2, $$3, cul.b);
         if ($$5 == ggb.a) {
            $$5 = $$4;
         }

         ggb $$6 = this.a($$2, $$3, cul.e);
         ggb $$7 = this.a($$2, $$3, cul.d);
         if ($$7 == ggb.a) {
            $$7 = $$6;
         }

         ggb $$8 = this.a($$2, $$3, cul.f);
         ggb $$9 = this.a($$2, $$3, cul.g);
         ggb $$10 = this.a($$2, $$3, cul.h);
         ggb $$11 = this.a($$2, $$3, cul.i);
         return new ggc($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private ggb a(JsonDeserializationContext $$0, JsonObject $$1, cul $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (ggb)$$0.deserialize($$1.get($$3), ggb.class) : ggb.a;
      }
   }
}
