import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public record gtr(gtq b, gtq c, gtq d, gtq e, gtq f, gtq g, gtq h, gtq i) {
   public static final gtr a = new gtr(gtq.a, gtq.a, gtq.a, gtq.a, gtq.a, gtq.a, gtq.a, gtq.a);

   public gtq a(czw $$0) {
      return switch ($$0) {
         case b -> this.b;
         case c -> this.c;
         case d -> this.d;
         case e -> this.e;
         case f -> this.f;
         case g -> this.g;
         case h -> this.h;
         case i -> this.i;
         default -> gtq.a;
      };
   }

   public gtq a() {
      return this.b;
   }

   public gtq b() {
      return this.c;
   }

   public gtq c() {
      return this.d;
   }

   public gtq d() {
      return this.e;
   }

   public gtq e() {
      return this.f;
   }

   public gtq f() {
      return this.g;
   }

   public gtq g() {
      return this.h;
   }

   public gtq h() {
      return this.i;
   }

   protected static class a implements JsonDeserializer<gtr> {
      public gtr a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         gtq $$4 = this.a($$2, $$3, czw.c);
         gtq $$5 = this.a($$2, $$3, czw.b);
         if ($$5 == gtq.a) {
            $$5 = $$4;
         }

         gtq $$6 = this.a($$2, $$3, czw.e);
         gtq $$7 = this.a($$2, $$3, czw.d);
         if ($$7 == gtq.a) {
            $$7 = $$6;
         }

         gtq $$8 = this.a($$2, $$3, czw.f);
         gtq $$9 = this.a($$2, $$3, czw.g);
         gtq $$10 = this.a($$2, $$3, czw.h);
         gtq $$11 = this.a($$2, $$3, czw.i);
         return new gtr($$5, $$4, $$7, $$6, $$8, $$9, $$10, $$11);
      }

      private gtq a(JsonDeserializationContext $$0, JsonObject $$1, czw $$2) {
         String $$3 = $$2.c();
         return $$1.has($$3) ? (gtq)$$0.deserialize($$1.get($$3), gtq.class) : gtq.a;
      }
   }
}
