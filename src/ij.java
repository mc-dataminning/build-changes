import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.IntegerArgumentType;

public class ij implements ib<IntegerArgumentType, ij.a> {
   public void a(ij.a $$0, we $$1) {
      boolean $$2 = $$0.b != Integer.MIN_VALUE;
      boolean $$3 = $$0.c != Integer.MAX_VALUE;
      $$1.k(id.a($$2, $$3));
      if ($$2) {
         $$1.p($$0.b);
      }

      if ($$3) {
         $$1.p($$0.c);
      }
   }

   public ij.a a(we $$0) {
      byte $$1 = $$0.readByte();
      int $$2 = id.a($$1) ? $$0.readInt() : Integer.MIN_VALUE;
      int $$3 = id.b($$1) ? $$0.readInt() : Integer.MAX_VALUE;
      return new ij.a($$2, $$3);
   }

   public void a(ij.a $$0, JsonObject $$1) {
      if ($$0.b != Integer.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Integer.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public ij.a a(IntegerArgumentType $$0) {
      return new ij.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements ib.a<IntegerArgumentType> {
      final int b;
      final int c;

      a(int $$1, int $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public IntegerArgumentType a(ed $$0) {
         return IntegerArgumentType.integer(this.b, this.c);
      }

      @Override
      public ib<IntegerArgumentType, ?> a() {
         return ij.this;
      }
   }
}
