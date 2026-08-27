import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class hk implements hf<DoubleArgumentType, hk.a> {
   public void a(hk.a $$0, tl $$1) {
      boolean $$2 = $$0.b != -Double.MAX_VALUE;
      boolean $$3 = $$0.c != Double.MAX_VALUE;
      $$1.k(hh.a($$2, $$3));
      if ($$2) {
         $$1.a($$0.b);
      }

      if ($$3) {
         $$1.a($$0.c);
      }
   }

   public hk.a a(tl $$0) {
      byte $$1 = $$0.readByte();
      double $$2 = hh.a($$1) ? $$0.readDouble() : -Double.MAX_VALUE;
      double $$3 = hh.b($$1) ? $$0.readDouble() : Double.MAX_VALUE;
      return new hk.a($$2, $$3);
   }

   public void a(hk.a $$0, JsonObject $$1) {
      if ($$0.b != -Double.MAX_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Double.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public hk.a a(DoubleArgumentType $$0) {
      return new hk.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements hf.a<DoubleArgumentType> {
      final double b;
      final double c;

      a(double $$1, double $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public DoubleArgumentType a(dp $$0) {
         return DoubleArgumentType.doubleArg(this.b, this.c);
      }

      @Override
      public hf<DoubleArgumentType, ?> a() {
         return hk.this;
      }
   }
}
