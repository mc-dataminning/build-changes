import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public record gte(gtd b, gtd c, gtd d, gtd e, gtd f, gtd g, gtd h, gtd i) {
   public static final gte a = new gte(gtd.a, gtd.a, gtd.a, gtd.a, gtd.a, gtd.a, gtd.a, gtd.a);

   public gtd a(dai $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gtd.a;
      };
   }

   public gtd a() {
      return this.b;
   }

   public gtd b() {
      return this.c;
   }

   public gtd c() {
      return this.d;
   }

   public gtd d() {
      return this.e;
   }

   public gtd e() {
      return this.f;
   }

   public gtd f() {
      return this.g;
   }

   public gtd g() {
      return this.h;
   }

   public gtd h() {
      return this.i;
   }

   protected static class a implements JsonDeserializer<gte> {
      public gte a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gtd $$4 = this.a($$2, $$3, dai.c);
         gtd $$5 = this.a($$2, $$3, dai.b);
         if ($$5 == gtd.a) {
            $$5 = $$4;
         }

         gtd $$6 = this.a($$2, $$3, dai.e);
         gtd $$7 = this.a($$2, $$3, dai.d);
         if ($$7 == gtd.a) {
            $$7 = $$6;
         }

         gtd $$8 = this.a($$2, $$3, dai.f);
         gtd $$9 = this.a($$2, $$3, dai.g);
         gtd $$10 = this.a($$2, $$3, dai.h);
         gtd $$11 = this.a($$2, $$3, dai.i);
         return new gte($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gtd a(JsonDeserializationContext $$0, JsonObject $$1, dai $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gtd)$$0.deserialize($$1.get($$3), gtd.class) : gtd.a;
      }
   }
}
