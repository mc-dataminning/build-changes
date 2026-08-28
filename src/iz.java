import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.IntegerArgumentType;

public class iz implements is<IntegerArgumentType, iz.a> {
   public void a(iz.a $$0, wg $$1) {
      boolean $$2 = $$0.b != Integer.MIN_VALUE;
      boolean $$3 = $$0.c != Integer.MAX_VALUE;
      $$1.l(iu.a($$2, $$3));
      if ($$2) {
         $$1.q($$0.b);
      }

      if ($$3) {
         $$1.q($$0.c);
      }
   }

   public iz.a a(wg $$0) {
      byte $$1 = $$0.readByte();
      int $$2 = iu.a($$1) ? $$0.readInt() : Integer.MIN_VALUE;
      int $$3 = iu.b($$1) ? $$0.readInt() : Integer.MAX_VALUE;
      return new iz.a($$2, $$3);
   }

   public void a(iz.a $$0, JsonObject $$1) {
      if ($$0.b != Integer.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Integer.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public iz.a a(IntegerArgumentType $$0) {
      return new iz.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements is.a<IntegerArgumentType> {
      final int b;
      final int c;

      a(final int $$1, final int $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public IntegerArgumentType a(es $$0) {
         return IntegerArgumentType.integer(this.b, this.c);
      }

      @Override
      public is<IntegerArgumentType, ?> a() {
         return iz.this;
      }
   }
}
