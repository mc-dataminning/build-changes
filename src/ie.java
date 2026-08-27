import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.IntegerArgumentType;

public class ie implements hx<IntegerArgumentType, ie.a> {
   public void a(ie.a $$0, vu $$1) {
      boolean $$2 = $$0.b != Integer.MIN_VALUE;
      boolean $$3 = $$0.c != Integer.MAX_VALUE;
      $$1.k(hz.a($$2, $$3));
      if ($$2) {
         $$1.p($$0.b);
      }

      if ($$3) {
         $$1.p($$0.c);
      }
   }

   public ie.a a(vu $$0) {
      byte $$1 = $$0.readByte();
      int $$2 = hz.a($$1) ? $$0.readInt() : Integer.MIN_VALUE;
      int $$3 = hz.b($$1) ? $$0.readInt() : Integer.MAX_VALUE;
      return new ie.a($$2, $$3);
   }

   public void a(ie.a $$0, JsonObject $$1) {
      if ($$0.b != Integer.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Integer.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public ie.a a(IntegerArgumentType $$0) {
      return new ie.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements hx.a<IntegerArgumentType> {
      final int b;
      final int c;

      a(int $$1, int $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public IntegerArgumentType a(dz $$0) {
         return IntegerArgumentType.integer(this.b, this.c);
      }

      @Override
      public hx<IntegerArgumentType, ?> a() {
         return ie.this;
      }
   }
}
