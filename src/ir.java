import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.IntegerArgumentType;

public class ir implements ik<IntegerArgumentType, ir.a> {
   public void a(ir.a $$0, wm $$1) {
      boolean $$2 = $$0.b != Integer.MIN_VALUE;
      boolean $$3 = $$0.c != Integer.MAX_VALUE;
      $$1.k(im.a($$2, $$3));
      if ($$2) {
         $$1.p($$0.b);
      }

      if ($$3) {
         $$1.p($$0.c);
      }
   }

   public ir.a a(wm $$0) {
      byte $$1 = $$0.readByte();
      int $$2 = im.a($$1) ? $$0.readInt() : Integer.MIN_VALUE;
      int $$3 = im.b($$1) ? $$0.readInt() : Integer.MAX_VALUE;
      return new ir.a($$2, $$3);
   }

   public void a(ir.a $$0, JsonObject $$1) {
      if ($$0.b != Integer.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Integer.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public ir.a a(IntegerArgumentType $$0) {
      return new ir.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements ik.a<IntegerArgumentType> {
      final int b;
      final int c;

      a(final int $$1, final int $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public IntegerArgumentType a(el $$0) {
         return IntegerArgumentType.integer(this.b, this.c);
      }

      @Override
      public ik<IntegerArgumentType, ?> a() {
         return ir.this;
      }
   }
}
