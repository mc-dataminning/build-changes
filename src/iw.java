import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.IntegerArgumentType;

public class iw implements ip<IntegerArgumentType, iw.a> {
   public void a(iw.a $$0, wa $$1) {
      boolean $$2 = $$0.b != Integer.MIN_VALUE;
      boolean $$3 = $$0.c != Integer.MAX_VALUE;
      $$1.l(ir.a($$2, $$3));
      if ($$2) {
         $$1.q($$0.b);
      }

      if ($$3) {
         $$1.q($$0.c);
      }
   }

   public iw.a a(wa $$0) {
      byte $$1 = $$0.readByte();
      int $$2 = ir.a($$1) ? $$0.readInt() : Integer.MIN_VALUE;
      int $$3 = ir.b($$1) ? $$0.readInt() : Integer.MAX_VALUE;
      return new iw.a($$2, $$3);
   }

   public void a(iw.a $$0, JsonObject $$1) {
      if ($$0.b != Integer.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Integer.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public iw.a a(IntegerArgumentType $$0) {
      return new iw.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements ip.a<IntegerArgumentType> {
      final int b;
      final int c;

      a(final int $$1, final int $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public IntegerArgumentType a(ep $$0) {
         return IntegerArgumentType.integer(this.b, this.c);
      }

      @Override
      public ip<IntegerArgumentType, ?> a() {
         return iw.this;
      }
   }
}
