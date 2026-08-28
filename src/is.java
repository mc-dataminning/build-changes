import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.LongArgumentType;

public class is implements ik<LongArgumentType, is.a> {
   public void a(is.a $$0, wl $$1) {
      boolean $$2 = $$0.b != Long.MIN_VALUE;
      boolean $$3 = $$0.c != Long.MAX_VALUE;
      $$1.k(im.a($$2, $$3));
      if ($$2) {
         $$1.b($$0.b);
      }

      if ($$3) {
         $$1.b($$0.c);
      }
   }

   public is.a a(wl $$0) {
      byte $$1 = $$0.readByte();
      long $$2 = im.a($$1) ? $$0.readLong() : Long.MIN_VALUE;
      long $$3 = im.b($$1) ? $$0.readLong() : Long.MAX_VALUE;
      return new is.a($$2, $$3);
   }

   public void a(is.a $$0, JsonObject $$1) {
      if ($$0.b != Long.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Long.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public is.a a(LongArgumentType $$0) {
      return new is.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements ik.a<LongArgumentType> {
      final long b;
      final long c;

      a(final long $$1, final long $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public LongArgumentType a(el $$0) {
         return LongArgumentType.longArg(this.b, this.c);
      }

      @Override
      public ik<LongArgumentType, ?> a() {
         return is.this;
      }
   }
}
