import com.google.common.annotations.VisibleForTesting;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Objects;

public class ggi implements gst {
   private final akr a;
   private final j b;
   private final boolean c;
   private final int d;

   public ggi(akr $$0, j $$1, boolean $$2, int $$3) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public akr a() {
      return this.a;
   }

   @Override
   public j b() {
      return this.b;
   }

   @Override
   public boolean c() {
      return this.c;
   }

   public int d() {
      return this.d;
   }

   @Override
   public String toString() {
      return "Variant{modelLocation=" + this.a + ", rotation=" + this.b + ", uvLock=" + this.c + ", weight=" + this.d + "}";
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof ggi $$1) ? false : this.a.equals($$1.a) && Objects.equals(this.b, $$1.b) && this.c == $$1.c && this.d == $$1.d;
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      $$0 = 31 * $$0 + this.b.hashCode();
      $$0 = 31 * $$0 + Boolean.valueOf(this.c).hashCode();
      return 31 * $$0 + this.d;
   }

   public static class a implements JsonDeserializer<ggi> {
      @VisibleForTesting
      static final boolean a = false;
      @VisibleForTesting
      static final int b = 1;
      @VisibleForTesting
      static final int c = 0;
      @VisibleForTesting
      static final int d = 0;

      public ggi a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         akr $$4 = this.b($$3);
         gsl $$5 = this.a($$3);
         boolean $$6 = this.d($$3);
         int $$7 = this.c($$3);
         return new ggi($$4, $$5.b(), $$6, $$7);
      }

      private boolean d(JsonObject $$0) {
         return aye.a($$0, "uvlock", false);
      }

      protected gsl a(JsonObject $$0) {
         int $$1 = aye.a($$0, "x", 0);
         int $$2 = aye.a($$0, "y", 0);
         gsl $$3 = gsl.a($$1, $$2);
         if ($$3 == null) {
            throw new JsonParseException("Invalid BlockModelRotation x: " + $$1 + ", y: " + $$2);
         } else {
            return $$3;
         }
      }

      protected akr b(JsonObject $$0) {
         return akr.a(aye.i($$0, "model"));
      }

      protected int c(JsonObject $$0) {
         int $$1 = aye.a($$0, "weight", 1);
         if ($$1 < 1) {
            throw new JsonParseException("Invalid weight " + $$1 + " found, expected integer >= 1");
         } else {
            return $$1;
         }
      }
   }
}
