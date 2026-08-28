import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.IntegerArgumentType;

public class is implements il<IntegerArgumentType, is.a> {
   public void a(is.a $$0, vr $$1) {
      boolean $$2 = $$0.b != Integer.MIN_VALUE;
      boolean $$3 = $$0.c != Integer.MAX_VALUE;
      $$1.k(in.a($$2, $$3));
      if ($$2) {
         $$1.p($$0.b);
      }

      if ($$3) {
         $$1.p($$0.c);
      }
   }

   public is.a a(vr $$0) {
      byte $$1 = $$0.readByte();
      int $$2 = in.a($$1) ? $$0.readInt() : Integer.MIN_VALUE;
      int $$3 = in.b($$1) ? $$0.readInt() : Integer.MAX_VALUE;
      return new is.a($$2, $$3);
   }

   public void a(is.a $$0, JsonObject $$1) {
      if ($$0.b != Integer.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Integer.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public is.a a(IntegerArgumentType $$0) {
      return new is.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements il.a<IntegerArgumentType> {
      final int b;
      final int c;

      a(final int $$1, final int $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public IntegerArgumentType a(em $$0) {
         return IntegerArgumentType.integer(this.b, this.c);
      }

      @Override
      public il<IntegerArgumentType, ?> a() {
         return is.this;
      }
   }
}
