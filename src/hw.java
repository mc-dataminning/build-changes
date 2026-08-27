import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.IntegerArgumentType;

public class hw implements hp<IntegerArgumentType, hw.a> {
   public void a(hw.a $$0, vi $$1) {
      boolean $$2 = $$0.b != Integer.MIN_VALUE;
      boolean $$3 = $$0.c != Integer.MAX_VALUE;
      $$1.k(hr.a($$2, $$3));
      if ($$2) {
         $$1.p($$0.b);
      }

      if ($$3) {
         $$1.p($$0.c);
      }
   }

   public hw.a a(vi $$0) {
      byte $$1 = $$0.readByte();
      int $$2 = hr.a($$1) ? $$0.readInt() : Integer.MIN_VALUE;
      int $$3 = hr.b($$1) ? $$0.readInt() : Integer.MAX_VALUE;
      return new hw.a($$2, $$3);
   }

   public void a(hw.a $$0, JsonObject $$1) {
      if ($$0.b != Integer.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Integer.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public hw.a a(IntegerArgumentType $$0) {
      return new hw.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements hp.a<IntegerArgumentType> {
      final int b;
      final int c;

      a(int $$1, int $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public IntegerArgumentType a(dr $$0) {
         return IntegerArgumentType.integer(this.b, this.c);
      }

      @Override
      public hp<IntegerArgumentType, ?> a() {
         return hw.this;
      }
   }
}
