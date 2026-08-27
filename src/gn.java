import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.FloatArgumentType;

public class gn implements gh<FloatArgumentType, gn.a> {
   public void a(gn.a $$0, sh $$1) {
      boolean $$2 = $$0.b != -Float.MAX_VALUE;
      boolean $$3 = $$0.c != Float.MAX_VALUE;
      $$1.k(gj.a($$2, $$3));
      if ($$2) {
         $$1.a($$0.b);
      }

      if ($$3) {
         $$1.a($$0.c);
      }
   }

   public gn.a a(sh $$0) {
      byte $$1 = $$0.readByte();
      float $$2 = gj.a($$1) ? $$0.readFloat() : -Float.MAX_VALUE;
      float $$3 = gj.b($$1) ? $$0.readFloat() : Float.MAX_VALUE;
      return new gn.a($$2, $$3);
   }

   public void a(gn.a $$0, JsonObject $$1) {
      if ($$0.b != -Float.MAX_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Float.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public gn.a a(FloatArgumentType $$0) {
      return new gn.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements gh.a<FloatArgumentType> {
      final float b;
      final float c;

      a(float $$1, float $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public FloatArgumentType a(dm $$0) {
         return FloatArgumentType.floatArg(this.b, this.c);
      }

      @Override
      public gh<FloatArgumentType, ?> a() {
         return gn.this;
      }
   }
}
