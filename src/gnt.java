import com.google.common.annotations.VisibleForTesting;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public record gnt(akv a, j b, boolean c, int d) implements hhi {
   @Override
   public j a() {
      return this.b;
   }

   @Override
   public boolean b() {
      return this.c;
   }

   public akv c() {
      return this.a;
   }

   public j d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public static class a implements JsonDeserializer<gnt> {
      @VisibleForTesting
      static final boolean a = false;
      @VisibleForTesting
      static final int b = 1;
      @VisibleForTesting
      static final int c = 0;
      @VisibleForTesting
      static final int d = 0;

      public gnt a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         akv $$4 = this.b($$3);
         hgt $$5 = this.a($$3);
         boolean $$6 = this.d($$3);
         int $$7 = this.c($$3);
         return new gnt($$4, $$5.a(), $$6, $$7);
      }

      private boolean d(JsonObject $$0) {
         return ayp.a($$0, "uvlock", false);
      }

      protected hgt a(JsonObject $$0) {
         int $$1 = ayp.a($$0, "x", 0);
         int $$2 = ayp.a($$0, "y", 0);
         hgt $$3 = hgt.a($$1, $$2);
         if ($$3 == null) {
            throw new JsonParseException("Invalid BlockModelRotation x: " + $$1 + ", y: " + $$2);
         } else {
            return $$3;
         }
      }

      protected akv b(JsonObject $$0) {
         return akv.a(ayp.i($$0, "model"));
      }

      protected int c(JsonObject $$0) {
         int $$1 = ayp.a($$0, "weight", 1);
         if ($$1 < 1) {
            throw new JsonParseException("Invalid weight " + $$1 + " found, expected integer >= 1");
         } else {
            return $$1;
         }
      }
   }
}
