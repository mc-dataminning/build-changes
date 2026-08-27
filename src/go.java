import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.FloatArgumentType;

public class go implements gi<FloatArgumentType, go.a> {
   public void a(go.a $$0, sq $$1) {
      boolean $$2 = $$0.b != -Float.MAX_VALUE;
      boolean $$3 = $$0.c != Float.MAX_VALUE;
      $$1.k(gk.a($$2, $$3));
      if ($$2) {
         $$1.a($$0.b);
      }

      if ($$3) {
         $$1.a($$0.c);
      }
   }

   public go.a a(sq $$0) {
      byte $$1 = $$0.readByte();
      float $$2 = gk.a($$1) ? $$0.readFloat() : -Float.MAX_VALUE;
      float $$3 = gk.b($$1) ? $$0.readFloat() : Float.MAX_VALUE;
      return new go.a($$2, $$3);
   }

   public void a(go.a $$0, JsonObject $$1) {
      if ($$0.b != -Float.MAX_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Float.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public go.a a(FloatArgumentType $$0) {
      return new go.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements gi.a<FloatArgumentType> {
      final float b;
      final float c;

      a(float $$1, float $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public FloatArgumentType a(dn $$0) {
         return FloatArgumentType.floatArg(this.b, this.c);
      }

      @Override
      public gi<FloatArgumentType, ?> a() {
         return go.this;
      }
   }
}
