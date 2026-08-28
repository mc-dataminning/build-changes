import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.LongArgumentType;

public class it implements il<LongArgumentType, it.a> {
   public void a(it.a $$0, vr $$1) {
      boolean $$2 = $$0.b != Long.MIN_VALUE;
      boolean $$3 = $$0.c != Long.MAX_VALUE;
      $$1.k(in.a($$2, $$3));
      if ($$2) {
         $$1.b($$0.b);
      }

      if ($$3) {
         $$1.b($$0.c);
      }
   }

   public it.a a(vr $$0) {
      byte $$1 = $$0.readByte();
      long $$2 = in.a($$1) ? $$0.readLong() : Long.MIN_VALUE;
      long $$3 = in.b($$1) ? $$0.readLong() : Long.MAX_VALUE;
      return new it.a($$2, $$3);
   }

   public void a(it.a $$0, JsonObject $$1) {
      if ($$0.b != Long.MIN_VALUE) {
         $$1.addProperty("min", $$0.b);
      }

      if ($$0.c != Long.MAX_VALUE) {
         $$1.addProperty("max", $$0.c);
      }
   }

   public it.a a(LongArgumentType $$0) {
      return new it.a($$0.getMinimum(), $$0.getMaximum());
   }

   public final class a implements il.a<LongArgumentType> {
      final long b;
      final long c;

      a(final long $$1, final long $$2) {
         this.b = $$1;
         this.c = $$2;
      }

      public LongArgumentType a(em $$0) {
         return LongArgumentType.longArg(this.b, this.c);
      }

      @Override
      public il<LongArgumentType, ?> a() {
         return it.this;
      }
   }
}
