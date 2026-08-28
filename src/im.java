import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.IntegerArgumentType;

public class im implements ie<IntegerArgumentType, im.a> {
   public void a(im.a $$0, vs $$1) {
      boolean $$2 = $$0.b != Integer.MIN_VALUE;
      boolean $$3 = $$0.c != Integer.MAX_VALUE;
      $$1.l(ih.a($$2, $$3));
      if ($$2) {
         $$1.q($$0.b);
      }

      if ($$3) {
         $$1.q($$0.c);
      }
   }

   public im.a a(vs $$0) {
      byte $$1 = $$0.readByte();
      int $$2 = ih.a($$1) ? $$0.readInt() : Integer.MIN_VALUE;
      int $$3 = ih.b($$1) ? $$0.readInt() : Integer.MAX_VALUE;
      return new im.a($$2, $$3);
   }

   public void a(im.a $$0, JsonObject $$1) {
      if ($$0.b != Integer.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Integer.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public im.a a(IntegerArgumentType $$0) {
      return new im.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements ie.a<IntegerArgumentType> {
      final int b;
      final int c;

      a(final int $$1, final int $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public IntegerArgumentType a(ee $$0) {
         return IntegerArgumentType.integer(this.b, this.c);
      }

      @Override
      public ie<IntegerArgumentType, ?> a() {
         return im.this;
      }
   }
}
