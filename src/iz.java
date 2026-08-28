import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.FloatArgumentType;

public class iz implements it<FloatArgumentType, iz.a> {
   public void a(iz.a $$0, vl $$1) {
      boolean $$2 = $$0.b != -Float.MAX_VALUE;
      boolean $$3 = $$0.c != Float.MAX_VALUE;
      $$1.l(iv.a($$2, $$3));
      if ($$2) {
         $$1.a($$0.b);
      }

      if ($$3) {
         $$1.a($$0.c);
      }
   }

   public iz.a a(vl $$0) {
      byte $$1 = $$0.readByte();
      float $$2 = iv.a($$1) ? $$0.readFloat() : -Float.MAX_VALUE;
      float $$3 = iv.b($$1) ? $$0.readFloat() : Float.MAX_VALUE;
      return new iz.a($$2, $$3);
   }

   public void a(iz.a $$0, JsonObject $$1) {
      if ($$0.b != -Float.MAX_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Float.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public iz.a a(FloatArgumentType $$0) {
      return new iz.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements it.a<FloatArgumentType> {
      final float b;
      final float c;

      a(final float $$1, final float $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public FloatArgumentType a(et $$0) {
         return FloatArgumentType.floatArg(this.b, this.c);
      }

      @Override
      public it<FloatArgumentType, ?> a() {
         return iz.this;
      }
   }
}
