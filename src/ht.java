import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.FloatArgumentType;

public class ht implements hn<FloatArgumentType, ht.a> {
   public void a(ht.a $$0, us $$1) {
      boolean $$2 = $$0.b != -Float.MAX_VALUE;
      boolean $$3 = $$0.c != Float.MAX_VALUE;
      $$1.k(hp.a($$2, $$3));
      if ($$2) {
         $$1.a($$0.b);
      }

      if ($$3) {
         $$1.a($$0.c);
      }
   }

   public ht.a a(us $$0) {
      byte $$1 = $$0.readByte();
      float $$2 = hp.a($$1) ? $$0.readFloat() : -Float.MAX_VALUE;
      float $$3 = hp.b($$1) ? $$0.readFloat() : Float.MAX_VALUE;
      return new ht.a($$2, $$3);
   }

   public void a(ht.a $$0, JsonObject $$1) {
      if ($$0.b != -Float.MAX_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Float.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public ht.a a(FloatArgumentType $$0) {
      return new ht.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements hn.a<FloatArgumentType> {
      final float b;
      final float c;

      a(float $$1, float $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public FloatArgumentType a(dq $$0) {
         return FloatArgumentType.floatArg(this.b, this.c);
      }

      @Override
      public hn<FloatArgumentType, ?> a() {
         return ht.this;
      }
   }
}
