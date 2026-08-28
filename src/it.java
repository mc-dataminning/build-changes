import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class it implements io<DoubleArgumentType, it.a> {
   public void a(it.a $$0, vw $$1) {
      boolean $$2 = $$0.b != -Double.MAX_VALUE;
      boolean $$3 = $$0.c != Double.MAX_VALUE;
      $$1.k(iq.a($$2, $$3));
      if ($$2) {
         $$1.a($$0.b);
      }

      if ($$3) {
         $$1.a($$0.c);
      }
   }

   public it.a a(vw $$0) {
      byte $$1 = $$0.readByte();
      double $$2 = iq.a($$1) ? $$0.readDouble() : -Double.MAX_VALUE;
      double $$3 = iq.b($$1) ? $$0.readDouble() : Double.MAX_VALUE;
      return new it.a($$2, $$3);
   }

   public void a(it.a $$0, JsonObject $$1) {
      if ($$0.b != -Double.MAX_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Double.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public it.a a(DoubleArgumentType $$0) {
      return new it.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements io.a<DoubleArgumentType> {
      final double b;
      final double c;

      a(final double $$1, final double $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public DoubleArgumentType a(ep $$0) {
         return DoubleArgumentType.doubleArg(this.b, this.c);
      }

      @Override
      public io<DoubleArgumentType, ?> a() {
         return it.this;
      }
   }
}
