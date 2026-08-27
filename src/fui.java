import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class fui {
   public static final fui a = new fui();
   public final fuh b;
   public final fuh c;
   public final fuh d;
   public final fuh e;
   public final fuh f;
   public final fuh g;
   public final fuh h;
   public final fuh i;

   private fui() {
      this(fuh.a, fuh.a, fuh.a, fuh.a, fuh.a, fuh.a, fuh.a, fuh.a);
   }

   public fui(fui $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public fui(fuh $$0, fuh $$1, fuh $$2, fuh $$3, fuh $$4, fuh $$5, fuh $$6, fuh $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public fuh a(cmo $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> fuh.a;
      };
   }

   public boolean b(cmo $$0) {
      return this.a($$0) != fuh.a;
   }

   protected static class a implements JsonDeserializer<fui> {
      public fui a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         fuh $$4 = this.a($$2, $$3, cmo.c);
         fuh $$5 = this.a($$2, $$3, cmo.b);
         if ($$5 == fuh.a) {
            $$5 = $$4;
         }

         fuh $$6 = this.a($$2, $$3, cmo.e);
         fuh $$7 = this.a($$2, $$3, cmo.d);
         if ($$7 == fuh.a) {
            $$7 = $$6;
         }

         fuh $$8 = this.a($$2, $$3, cmo.f);
         fuh $$9 = this.a($$2, $$3, cmo.g);
         fuh $$10 = this.a($$2, $$3, cmo.h);
         fuh $$11 = this.a($$2, $$3, cmo.i);
         return new fui($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private fuh a(JsonDeserializationContext $$0, JsonObject $$1, cmo $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (fuh)$$0.deserialize($$1.get($$3), fuh.class) : fuh.a;
      }
   }
}
