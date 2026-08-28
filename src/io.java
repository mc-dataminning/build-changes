import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.IntegerArgumentType;

public class io implements ih<IntegerArgumentType, io.a> {
   public void a(io.a $$0, vy $$1) {
      boolean $$2 = $$0.b != Integer.MIN_VALUE;
      boolean $$3 = $$0.c != Integer.MAX_VALUE;
      $$1.l(ij.a($$2, $$3));
      if ($$2) {
         $$1.q($$0.b);
      }

      if ($$3) {
         $$1.q($$0.c);
      }
   }

   public io.a a(vy $$0) {
      byte $$1 = $$0.readByte();
      int $$2 = ij.a($$1) ? $$0.readInt() : Integer.MIN_VALUE;
      int $$3 = ij.b($$1) ? $$0.readInt() : Integer.MAX_VALUE;
      return new io.a($$2, $$3);
   }

   public void a(io.a $$0, JsonObject $$1) {
      if ($$0.b != Integer.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Integer.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public io.a a(IntegerArgumentType $$0) {
      return new io.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements ih.a<IntegerArgumentType> {
      final int b;
      final int c;

      a(final int $$1, final int $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public IntegerArgumentType a(eg $$0) {
         return IntegerArgumentType.integer(this.b, this.c);
      }

      @Override
      public ih<IntegerArgumentType, ?> a() {
         return io.this;
      }
   }
}
