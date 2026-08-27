import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class hs implements hn<DoubleArgumentType, hs.a> {
   public void a(hs.a $$0, uu $$1) {
      boolean $$2 = $$0.b != -Double.MAX_VALUE;
      boolean $$3 = $$0.c != Double.MAX_VALUE;
      $$1.k(hp.a($$2, $$3));
      if ($$2) {
         $$1.a($$0.b);
      }

      if ($$3) {
         $$1.a($$0.c);
      }
   }

   public hs.a a(uu $$0) {
      byte $$1 = $$0.readByte();
      double $$2 = hp.a($$1) ? $$0.readDouble() : -Double.MAX_VALUE;
      double $$3 = hp.b($$1) ? $$0.readDouble() : Double.MAX_VALUE;
      return new hs.a($$2, $$3);
   }

   public void a(hs.a $$0, JsonObject $$1) {
      if ($$0.b != -Double.MAX_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Double.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public hs.a a(DoubleArgumentType $$0) {
      return new hs.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements hn.a<DoubleArgumentType> {
      final double b;
      final double c;

      a(double $$1, double $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public DoubleArgumentType a(dq $$0) {
         return DoubleArgumentType.doubleArg(this.b, this.c);
      }

      @Override
      public hn<DoubleArgumentType, ?> a() {
         return hs.this;
      }
   }
}
