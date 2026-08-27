import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class hu implements hp<DoubleArgumentType, hu.a> {
   public void a(hu.a $$0, vi $$1) {
      boolean $$2 = $$0.b != -Double.MAX_VALUE;
      boolean $$3 = $$0.c != Double.MAX_VALUE;
      $$1.k(hr.a($$2, $$3));
      if ($$2) {
         $$1.a($$0.b);
      }

      if ($$3) {
         $$1.a($$0.c);
      }
   }

   public hu.a a(vi $$0) {
      byte $$1 = $$0.readByte();
      double $$2 = hr.a($$1) ? $$0.readDouble() : -Double.MAX_VALUE;
      double $$3 = hr.b($$1) ? $$0.readDouble() : Double.MAX_VALUE;
      return new hu.a($$2, $$3);
   }

   public void a(hu.a $$0, JsonObject $$1) {
      if ($$0.b != -Double.MAX_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Double.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public hu.a a(DoubleArgumentType $$0) {
      return new hu.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements hp.a<DoubleArgumentType> {
      final double b;
      final double c;

      a(double $$1, double $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public DoubleArgumentType a(dr $$0) {
         return DoubleArgumentType.doubleArg(this.b, this.c);
      }

      @Override
      public hp<DoubleArgumentType, ?> a() {
         return hu.this;
      }
   }
}
