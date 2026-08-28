import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class iq implements il<DoubleArgumentType, iq.a> {
   public void a(iq.a $$0, vr $$1) {
      boolean $$2 = $$0.b != -Double.MAX_VALUE;
      boolean $$3 = $$0.c != Double.MAX_VALUE;
      $$1.k(in.a($$2, $$3));
      if ($$2) {
         $$1.a($$0.b);
      }

      if ($$3) {
         $$1.a($$0.c);
      }
   }

   public iq.a a(vr $$0) {
      byte $$1 = $$0.readByte();
      double $$2 = in.a($$1) ? $$0.readDouble() : -Double.MAX_VALUE;
      double $$3 = in.b($$1) ? $$0.readDouble() : Double.MAX_VALUE;
      return new iq.a($$2, $$3);
   }

   public void a(iq.a $$0, JsonObject $$1) {
      if ($$0.b != -Double.MAX_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Double.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public iq.a a(DoubleArgumentType $$0) {
      return new iq.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements il.a<DoubleArgumentType> {
      final double b;
      final double c;

      a(final double $$1, final double $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public DoubleArgumentType a(em $$0) {
         return DoubleArgumentType.doubleArg(this.b, this.c);
      }

      @Override
      public il<DoubleArgumentType, ?> a() {
         return iq.this;
      }
   }
}
