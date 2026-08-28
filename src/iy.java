import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.LongArgumentType;

public class iy implements iq<LongArgumentType, iy.a> {
   public void a(iy.a $$0, wb $$1) {
      boolean $$2 = $$0.b != Long.MIN_VALUE;
      boolean $$3 = $$0.c != Long.MAX_VALUE;
      $$1.l(is.a($$2, $$3));
      if ($$2) {
         $$1.b($$0.b);
      }

      if ($$3) {
         $$1.b($$0.c);
      }
   }

   public iy.a a(wb $$0) {
      byte $$1 = $$0.readByte();
      long $$2 = is.a($$1) ? $$0.readLong() : Long.MIN_VALUE;
      long $$3 = is.b($$1) ? $$0.readLong() : Long.MAX_VALUE;
      return new iy.a($$2, $$3);
   }

   public void a(iy.a $$0, JsonObject $$1) {
      if ($$0.b != Long.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Long.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public iy.a a(LongArgumentType $$0) {
      return new iy.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements iq.a<LongArgumentType> {
      final long b;
      final long c;

      a(final long $$1, final long $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public LongArgumentType a(eq $$0) {
         return LongArgumentType.longArg(this.b, this.c);
      }

      @Override
      public iq<LongArgumentType, ?> a() {
         return iy.this;
      }
   }
}
