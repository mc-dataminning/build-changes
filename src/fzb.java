import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class fzb {
   public static final fzb a = new fzb();
   public final fza b;
   public final fza c;
   public final fza d;
   public final fza e;
   public final fza f;
   public final fza g;
   public final fza h;
   public final fza i;

   private fzb() {
      this(fza.a, fza.a, fza.a, fza.a, fza.a, fza.a, fza.a, fza.a);
   }

   public fzb(fzb $$0) {
      this.b = $$0.b;
      this.c = $$0.c;
      this.d = $$0.d;
      this.e = $$0.e;
      this.f = $$0.f;
      this.g = $$0.g;
      this.h = $$0.h;
      this.i = $$0.i;
   }

   public fzb(fza $$0, fza $$1, fza $$2, fza $$3, fza $$4, fza $$5, fza $$6, fza $$7) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
      this.h = $$6;
      this.i = $$7;
   }

   public fza a(cqj $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> fza.a;
      };
   }

   public boolean b(cqj $$0) {
      return this.a($$0) != fza.a;
   }

   protected static class a implements JsonDeserializer<fzb> {
      public fzb a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         fza $$4 = this.a($$2, $$3, cqj.c);
         fza $$5 = this.a($$2, $$3, cqj.b);
         if ($$5 == fza.a) {
            $$5 = $$4;
         }

         fza $$6 = this.a($$2, $$3, cqj.e);
         fza $$7 = this.a($$2, $$3, cqj.d);
         if ($$7 == fza.a) {
            $$7 = $$6;
         }

         fza $$8 = this.a($$2, $$3, cqj.f);
         fza $$9 = this.a($$2, $$3, cqj.g);
         fza $$10 = this.a($$2, $$3, cqj.h);
         fza $$11 = this.a($$2, $$3, cqj.i);
         return new fzb($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private fza a(JsonDeserializationContext $$0, JsonObject $$1, cqj $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (fza)$$0.deserialize($$1.get($$3), fza.class) : fza.a;
      }
   }
}
